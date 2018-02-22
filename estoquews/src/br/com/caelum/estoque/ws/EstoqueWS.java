package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.exception.AutorizacaoException;
import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

@WebService
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.WRAPPED)
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	@WebMethod(operationName="todosOsItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name="item")
	@RequestWrapper(localName="listaItens")
    public List<Item> getItens(@WebParam(name="filtros") Filtros filtros) {
        System.out.println("Chamando todosItens()");
        List<Filtro> lista = filtros.getLista();
        ArrayList<Item> itensResultado = dao.todosItens(lista);
        
        return itensResultado;
       // return new ListaItens(itensResultado);
    }
	
	@WebMethod(action="CadastrarItem", operationName="CadastrarItem")
	public Item cadastrarItem(@WebParam(name="tokenUsuario", header=true) TokenUsuario token, 
							  @WebParam(name="item") Item item) 
							  throws AutorizacaoException {
		System.out.println("Cadastrando " + item);
		
		if(!new TokenDao().ehValido(token)) {
	        throw new AutorizacaoException("Autorizacao falhou");
	    }
		
		new ItemValidador(item).validate();
		
		this.dao.cadastrar(item);
		return item;
	}
	
	
	@WebMethod(exclude=true)
	public void outroMetodo() {
		//nao faz parte do WSDL
	}

}

package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {
	
	public static void main(String[] args) {
		
		EstoqueWS implementacaoWS = new EstoqueWS();
		String URL = "http://localhost:8080/estoquews";
		
		
		//RelatorioService implementacaoWS = new RelatorioService();
		//String URL = "http://localhost:8080/relatorioservice";
		
		System.out.println("EstoqueWS rodando: " + URL);
		
		//associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWS);
		
	}

}

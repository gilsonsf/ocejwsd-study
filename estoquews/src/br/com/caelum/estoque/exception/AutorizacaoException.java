package br.com.caelum.estoque.exception;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutoizacaoFault", messageName="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AutorizacaoException(String msg) {
		super(msg);
	}
	
	public InfoFault getFaultInfo() {
	    return new InfoFault("Token invalido" , new Date());
	}

}

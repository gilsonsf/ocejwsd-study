package ch01.ts;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface TimeServer {
	
	@WebMethod 
	@WebResult(partName="time_response")
	String getTimeAsString();

	@WebMethod 
	@WebResult(partName="time_response")
	long getTimeAsElapsed();

}

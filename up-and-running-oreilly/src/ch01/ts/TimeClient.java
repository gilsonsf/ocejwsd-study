package ch01.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		//URL url = new URL("http://localhost:9876/ts?wsdl");
		URL url = new URL("http://localhost:8888/ts?wsdl");
		
		//Qualified name of the service
		//1st arg is the service URI
		//2nd is the service name published in the WSDL
		QName qname = new QName("http://ts.ch01/", "TimeServerImplService");
		
		//create, in effect, a factory for the service
		Service service = Service.create(url, qname);
		
		//extract the endpoint interface, the service "port"
		TimeServer eif = service.getPort(TimeServer.class);
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}
}

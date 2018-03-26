package ch02.validate;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;
import javax.xml.XMLConstants;
import javax.xml.validation.Validator;

public class ValidateXML {

	public static void main(String[] args) {

		if(args.length != 2) {
			String msg = "\nUsage: java ValidateXML XMLfile XSDfile";
			System.err.println(msg);
			return;
		}
		
		try {
			//Read and validate the XML Schema (XSD document)
			final String schema_uri = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			SchemaFactory factory = SchemaFactory.newInstance(schema_uri);
			Schema schema = factory.newSchema(new StreamSource(args[1]));
			//Validate the XML document agaist the XML Schema
			Validator val = schema.newValidator();
			val.validate(new StreamSource(args[0]));
		}
		//Return on any validation error
		catch(Exception e) {
			System.err.println(e);
			return;
		}
		System.out.println(args[0] + " validated against " + args[1]);
	}

}

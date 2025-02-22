package controller;

import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class TemperaturaDOMCcaa {
	    public static void main(String[] args) {
	        try {
	            // Crea un objeto DocumentBuilderFactory
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	            // Crea un objeto DocumentBuilder
	            DocumentBuilder builder = factory.newDocumentBuilder();

	            // Crea un objeto Document vacío
	            Document doc = builder.newDocument();

	            // Crea el elemento raíz del documento
	            Element root = doc.createElement("MiDocumento");
	            doc.appendChild(root);

	            // Crea un elemento hijo
	            Element child = doc.createElement("MiElemento");
	            root.appendChild(child);

	            // Agrega un atributo al elemento hijo
	            Attr attr = doc.createAttribute("MiAtributo");
	            attr.setValue("MiValor");
	            child.setAttributeNode(attr);

	            // Crea un nodo de texto para el elemento hijo
	            Text text = doc.createTextNode("MiContenido");
	            child.appendChild(text);

	            // Crea un objeto TransformerFactory
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();

	            // Crea un objeto Transformer
	            Transformer transformer = transformerFactory.newTransformer();

	            // Crea un objeto DOMSource para el documento
	            DOMSource source = new DOMSource(doc);

	            // Crea un objeto StreamResult para el archivo de salida
	            StreamResult result = new StreamResult("MiDocumento.xml");

	            // Transforma el documento en un archivo XML
	            transformer.transform(source, result);

	            System.out.println("El archivo XML ha sido creado!");
	        } catch (Exception e) {e.printStackTrace();}
		}

}

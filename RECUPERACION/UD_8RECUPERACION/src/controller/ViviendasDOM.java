package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import model.*;
public class ViviendasDOM {

	List<Vivienda> viviendas = new ArrayList<Vivienda>();
public ViviendasDOM() throws ParserConfigurationException, TransformerException{
	
	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

	Document docXML = docBuilder.newDocument();

	Element viviendasElement = docXML.createElement("viviendas");
	docXML.appendChild(viviendasElement);

	
	for (Vivienda vivienda : viviendas) {
	    // Crear el elemento "vivienda"
	    Element viviendaElement = docXML.createElement("vivienda");
	    viviendasElement.appendChild(viviendaElement);

	    // Añadir atributos a la vivienda
	    viviendaElement.setAttribute("id", String.valueOf(vivienda.getId()));
	    viviendaElement.setAttribute("precio", String.valueOf(vivienda.getPrecio()));

	    // Recorrer las zonas
	    for (Zona zona : vivienda.getZonas()) {
	        // Crear el elemento "zona"
	        Element zonaElement = docXML.createElement("zona");
	        viviendaElement.appendChild(zonaElement);

	        // Añadir atributos a la zona
	        zonaElement.setAttribute("tipo", zona.getTipo().name());
	        zonaElement.setAttribute("descripcion", zona.getDescripcion());
	    }
	}

	// Escribir el contenido del documento en un archivo XML
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = transformerFactory.newTransformer();
	DOMSource source = new DOMSource(docXML);
	StreamResult result = new StreamResult(new File("viviendas.xml"));
	transformer.transform(source, result);

}

}
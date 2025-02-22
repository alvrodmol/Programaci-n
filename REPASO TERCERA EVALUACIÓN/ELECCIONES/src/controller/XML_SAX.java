package controller;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.*;

public class XML_SAX extends DefaultHandler{
	
	private List<Votacion> listaVotaciones = new ArrayList<>();
	private Votacion votacion = null ;
	private StringBuilder caracteresLeidos = new StringBuilder();
	Integer row = 0;
	
	
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		if(qName.equals("row")) {
			row++;
			votacion = new Votacion();
		}
		caracteresLeidos.setLength(0);
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException{
		caracteresLeidos.append(ch, start, length);
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException{
		switch(qName) {
		case "municipi"				-> votacion.setMunicipio(caracteresLeidos.toString());
		case "singles_candidatura"	-> votacion.setPartido(caracteresLeidos.toString());
		case "vots" 				-> votacion.setVotos(Integer.parseInt(caracteresLeidos.toString()));
		
		}
		if (qName.equals("row")) {
			if(row == 2) {
				listaVotaciones.add(votacion);
				row--;
			}
		
		}
	}
	public List<Votacion> getVotaciones() {
		return listaVotaciones;
	}
	
}

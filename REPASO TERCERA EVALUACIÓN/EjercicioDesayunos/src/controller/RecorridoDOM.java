package controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Desayuno;

import java.util.*;
public class RecorridoDOM {
	
	private Document docXML;
	
	public RecorridoDOM(String fileName) throws Exception{
			readXML(fileName);
			writeXML(fileName);
				
		}
	

	private void readXML(String fileName)throws Exception {
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			docXML = db.parse(fileName);
			docXML.getDocumentElement().normalize();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	private void writeXML(String fileName) throws Exception{
		try {
			Transformer t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.METHOD, "xml");
			t.setOutputProperty(OutputKeys.ENCODING, "utf-8");
			t.transform(new DOMSource(docXML), new StreamResult(fileName));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
		public List<Desayuno> getDesayunos() throws Exception{
			List<Desayuno> listado = new ArrayList<Desayuno>();
			
			try {
				String food;
				String name;
				Double price;
				String descripcion;
				Double calories;
				
				String expression ="bre"
						+ "breakfast_menu/food";
				
				NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(expression).evaluate(docXML, XPathConstants.NODESET);
		
				for(int i = 0; i<nodeList.getLength(); i++) {
					Node nNode = nodeList.item(i);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element elemento = (Element) nNode;
						
					}
					
					
				}
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return listado;
		}
	}



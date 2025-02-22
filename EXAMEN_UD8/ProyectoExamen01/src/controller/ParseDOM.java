package controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Casa;
import model.Componente;
import model.Tipo;

public class ParseDOM {
	
	public static List<Casa> parse(String nomFile) throws Exception {

		List<Casa> listado = new ArrayList<Casa>();

		try {

			Document docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(nomFile);

			NodeList nodeList = docXML.getElementsByTagName("Casa");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nNode;

					Integer id = Integer.parseInt(elemento.getElementsByTagName("id").item(0).getTextContent());
					Double precio = Double.parseDouble(elemento.getElementsByTagName("precio").item(0).getTextContent());
					Componente componente = Componente.clas(elemento.getElementsByTagName("componente").item(0).getTextContent());
					listado.add(new Casa(2, 2.00, Tipo.BAÑOS, "1"));

				}

			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new Exception(e);
		}

		return listado;

	}


public static void writeXML(String nomFile, List<Casa> listado) throws Exception {

			// Creación del documento XML
			Document docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			Element root = docXML.createElement("casas"); //le añadimos los elementos
			docXML.appendChild(root); //elemento raiz
			
			for (Casa c : listado) {
				Node nCasa = docXML.createElement("casa");
				Casa.appendChild(docXML.createTextNode(c.getId("id").toString()));

				Node nPrecio = docXML.createElement("precio");
				nPrecio.appendChild(docXML.createTextNode(c.getPrecio().toString()));

				Node nComponente = docXML.createElement("componente");
				nCasa.appendChild(nCasa);
				nCasa.appendChild(nPrecio);
				root.appendChild(nCasa);
			}
			
			// Escribir el documento XML en el fichero
			Transformer	t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.METHOD, "xml");
			t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			t.transform(new DOMSource(docXML), new StreamResult(fileName));
			
		}
		

}


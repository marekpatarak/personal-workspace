package mp.personal.xmlparserdemo;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		File file = new File("C:\\workspace\\personal-workspace\\XMLParsingDemo\\vestnik.xml");
		
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		PrintWriter writer = new PrintWriter(new File("C:\\workspace\\personal-workspace\\XMLParsingDemo\\vestnik.txt"));
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
		writer.println("Root element:" + doc.getDocumentElement().getNodeName());
		
		NodeList nodeList = doc.getElementsByTagName("item");
		
		for(int temp = 0; temp < nodeList.getLength(); temp++) {
			Node nNode = nodeList.item(temp);
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			writer.println("\nCurrent Element :" + nNode.getNodeName());
			
			Element eElement = (Element) nNode;

			System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			writer.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
			writer.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
			System.out.println("Link : " + eElement.getElementsByTagName("link").item(0).getTextContent());
			writer.println("Link : " + eElement.getElementsByTagName("link").item(0).getTextContent());
			System.out.println("guid : " + eElement.getElementsByTagName("guid").item(0).getTextContent());
			writer.println("guid : " + eElement.getElementsByTagName("guid").item(0).getTextContent());
			System.out.println("pubDate : " + eElement.getElementsByTagName("pubDate").item(0).getTextContent());
			writer.println("pubDate : " + eElement.getElementsByTagName("pubDate").item(0).getTextContent());
			writer.println("\n");
		}
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
//		public static void printNodes(NodeList nodelist) {
//			for (int i = 0; i < nodelist.getLength(); i++) {
//				Node tempNode = nodelist.item(i);
//				
//				if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
//					if(tempNode.getNodeValue() != null && tempNode.getNodeName() != null) {
//						System.out.println("Node name = " + tempNode.getNodeName() + "\n");
//						System.out.println("Node value = " + tempNode.getNodeValue() + "\n");
//							
//					}
//				}
//			}
//		}
	}



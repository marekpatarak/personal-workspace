package mp.personal.xmlparserdemo;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		File file = new File("C:\\workspace\\personal-workspace\\XMLParsingDemo\\vestnik.xml");
		
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		
		System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
		
		if (doc.hasChildNodes()) {
			printNodes(doc.getChildNodes());
			
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public static void printNodes(NodeList nodelist) {
			for (int i = 0; i < nodelist.getLength(); i++) {
				Node tempNode = nodelist.item(i);
				
				if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
					if(tempNode.getNodeValue() != null && tempNode.getNodeName() != null) {
						System.out.println("Node name = " + tempNode.getNodeName() + "\n");
						System.out.println("Node value = " + tempNode.getNodeValue() + "\n");
							
					}
				}
			}
		}
	}



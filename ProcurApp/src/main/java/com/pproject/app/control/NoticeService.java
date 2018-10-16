package com.pproject.app.control;

import java.io.File;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.pproject.app.entity.Notice;
import com.pproject.app.repository.NoticeRepository;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeRepository noticeRepository;

	public void fetchFeedForPreview() {
		try {
			
			File file = new File("C:\\workspace\\personal-workspace\\XMLParsingDemo\\vestnik.xml");
			
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			StringBuilder strb = new StringBuilder();
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getDocumentElement().getElementsByTagName("item");
			
			for(int temp = 0; temp < nodeList.getLength(); temp++) {
				Node nNode = nodeList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				strb.append("\nCurrent Element :" + nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				String title = eElement.getElementsByTagName("title").item(0).getTextContent();
				String desc = eElement.getElementsByTagName("description").item(0).getTextContent();
				String link = eElement.getElementsByTagName("link").item(0).getTextContent();
				String guid = eElement.getElementsByTagName("guid").item(0).getTextContent();
				String pubDate = eElement.getElementsByTagName("pubDate").item(0).getTextContent();
				
				Notice notice = new Notice(title, desc, link, guid, pubDate);
				
				noticeRepository.save(notice);
				
				System.out.println("Notice persisted " + notice.toString());

				}

			}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}
}

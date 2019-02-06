package com.pproject.app.control;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	private static Logger logger = Logger.getLogger(NoticeService.class.getCanonicalName());

	public void fetchFeedForPreview() {
		try {
			
//			Document doc = FeedFetcher.fetchFeedFromUrl("https://a.uguu.se/IGqwA1JC5Fgr_vestnik.xml");
			Document doc = FeedFetcher.fetchFeedFromFile("C:\\library\\git\\personal\\ProcurApp\\target\\classes\\vestnik.xml");

			NodeList nodeList = doc.getDocumentElement().getElementsByTagName("item");
			
			for(int temp = 0; temp < nodeList.getLength(); temp++) {
				Node nNode = nodeList.item(temp);
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
	
					String title = eElement.getElementsByTagName("title").item(0).getTextContent();
					String desc = eElement.getElementsByTagName("description").item(0).getTextContent();
					String link = eElement.getElementsByTagName("link").item(0).getTextContent();
					int guid = Integer.parseInt(eElement.getElementsByTagName("guid").item(0).getTextContent().substring(7));
					String pubDate = eElement.getElementsByTagName("pubDate").item(0).getTextContent();
					
					Notice notice = new Notice(guid, title, desc, link, pubDate);
					
					if (!noticeRepository.existsById(guid)) {
						noticeRepository.save(notice);
						logger.log(Level.INFO, "Notice GUID " + guid + " persisted ");
						
					} else {
						logger.log(Level.INFO, "Notice " + guid + " not persisted, duplicate GUID found");
					}

				}

			}

			} catch (Exception e) {
				logger.log(Level.SEVERE, e.getMessage());
			}

	}
}

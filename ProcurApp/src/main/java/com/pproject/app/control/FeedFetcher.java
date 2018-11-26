package com.pproject.app.control;

import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.util.logging.*;
import org.w3c.dom.Document;

public class FeedFetcher {
	
	private static Logger logger = Logger.getLogger(FeedFetcher.class.getCanonicalName());

	public static Document fetchFeedFromUrl (String urlString) {
		
		try{
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(conn.getInputStream());
			doc.getDocumentElement().normalize();
			
			return doc;
		} catch (Exception e) 
		{
			logger.log(Level.SEVERE, "Couldnt fetch feed from URL");
		}
		
		return null;
	}
}

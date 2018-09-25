package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityLoggerDemo
{
	private static final Logger logger = Logger.getLogger(ChainOfResponsibilityLoggerDemo.class.getName());
	
	public static void main(String[] args)
	{
		// level logovania
		logger.setLevel(Level.FINER);

		ConsoleHandler handler = new ConsoleHandler();
		// level pre konkretny handler
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);

		logger.finest("Najjemnejsi level logovania");
		logger.finer("Jemnejsi ako jemny, ale zase nie taky jemny ako najjemnejsi");
		logger.fine("Jemny, ale nie az taky jemny ako jemnejsi alebo najjemnejsi"); 
	}
}

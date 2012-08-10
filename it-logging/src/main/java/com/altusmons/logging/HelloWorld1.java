package com.altusmons.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;


public class HelloWorld1 {

	public static void main (String[] args) {
		
		debugLoggingConfiguration();
		
		Logger logger = LoggerFactory.getLogger(HelloWorld1.class.getName());
	    logger.debug("Hello world.");
	}
	
	private static void debugLoggingConfiguration() {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	} 
	
}

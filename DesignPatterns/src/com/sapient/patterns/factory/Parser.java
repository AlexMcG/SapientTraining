package com.sapient.patterns.factory;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Parser {
	private static Parser parser;
	//  Java specific implementation of singleton
	static {
		Logger log = Logger.getLogger(Parser.class.getClass().getName());
		BasicConfigurator.configure();
		log.setLevel(Level.TRACE);
		log.trace("Parser Object created");
		parser = new Parser();	
	}
	private Parser(){}
	public static Parser getInstance() {
		return parser;
	}

//  programming language independent implementation of singleton
//	public static Parser getInstance() {
//		if (parser == null) {
//			Logger log = Logger.getLogger(Parser.class.getClass().getName());
//			BasicConfigurator.configure();
//			log.setLevel(Level.TRACE);
//			log.trace("Parser Object created");
//			parser = new Parser();
//		}
//		return parser;
//	}
}

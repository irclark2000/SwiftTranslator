package com.gmail.irclark2000.swift;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.gmail.irclark2000.swift.parser.SwiftLexer;
import com.gmail.irclark2000.swift.parser.SwiftParser;

public class Parse {
	private static final String FILENAME = "examples/AppConfiguration.swift";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedInputStream instream = null;
		try {
			instream = new BufferedInputStream(new FileInputStream(
					FILENAME));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ANTLRInputStream antlrStream = null;
		try {
			antlrStream = new ANTLRInputStream(instream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwiftParser.Top_levelContext tree = new SwiftParser(
				new CommonTokenStream(new SwiftLexer(antlrStream)))
				.top_level();
		// walk the tree and activate so we can listen
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new SwiftTranslatorListener(), tree);
		try {
			instream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

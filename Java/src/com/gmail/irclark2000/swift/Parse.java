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
import com.gmail.irclark2000.swift.symbol.Scope;

public class Parse {
	private static final String FILENAME = "examples/call.swift";

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException,
			FileNotFoundException {
		BufferedInputStream instream = null;
		ANTLRInputStream antlrStream = null;
		ParseParameters param = new ParseParameters();
		
		param.gScope = new Scope("Global", null);
		param.fileName = FILENAME;
		instream = new BufferedInputStream(new FileInputStream(FILENAME));
		antlrStream = new ANTLRInputStream(instream);

		CommonTokenStream tokenStream = new CommonTokenStream(new SwiftLexer(
				antlrStream));
		SwiftParser.Top_levelContext tree = new SwiftParser(tokenStream)
				.top_level();
		// walk the tree and activate so we can listen
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new SwiftTranslatorListener(tokenStream, param), tree);
		instream.close();
	}
}

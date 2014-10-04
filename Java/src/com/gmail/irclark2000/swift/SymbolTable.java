package com.gmail.irclark2000.swift;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
	private Map<String, String> symbols;
	
	SymbolTable() {
		symbols = new HashMap<String, String>();
	}
	
	public void addSymbol(String name, String type) {
	   if (symbols.get(name) == null) {
		   symbols.put(name, type);
	   }
	}


}
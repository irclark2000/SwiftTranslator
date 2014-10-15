package com.gmail.irclark2000.swift;

import com.gmail.irclark2000.swift.parser.SwiftParser.Parenthesized_expressionContext;
import com.gmail.irclark2000.swift.parser.SwiftParser.Trailing_closureContext;

/**
 * @author Isaac Clarl
 * Functions to help manage translations
 *
 */
public class SwiftTranslationHelper {


	public static String getFunctionSignature(
			Parenthesized_expressionContext parenthesized_expression,
			Trailing_closureContext trailing_closure) {
		// TODO Auto-generated method stub
		return "";
	}
	
	/**
	 * Appends strings and puts separation character between if needed
	 * @param target current string
	 * @param source string to append
	 * @param sep separation string
	 * @return appended strings with space between
	 */
	public static String appendWithChar(String target, String source, String sep) {
		String result = "";
		if (target != null && !target.isEmpty()) {
			result = target;
		}
		if (source != null && !source.isEmpty()) {
		   if (!result.isEmpty()) {
			   result += (sep + source);
		   } else {
			   result = source;
		   }
		}
		return result;
	}
	
	/**
	 * Appends strings and puts space between if needed
	 * @param target current string
	 * @param source string to append
	 * @return appended strings with space between
	 */
	public static String appendWithSpace(String target, String source) {
		return appendWithChar(target, source, " ");
	}
}

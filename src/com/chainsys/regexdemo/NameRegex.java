package com.chainsys.regexdemo;

public class NameRegex {
// TODO character [a-z,A-Z," "]
	// length 3-15,35,/
	/*
	 * REGEX :
	 * String :
	 *  lowercase -> a-z			
	 *  Uppercase -> A-Z			
	 *  numeric character -> 0-9	
	 *  metaCharacters (Need to be escaped):  .[{()\^$|?*+
	 *  
	 *  
	 */
    /**
	 * .   - Any Character Except New line 
	 * \d  - Digit (0-9)
	 * \D  - Not a Digit(0-9)
	 * \w  - Word Character (a-z, A-Z, 0-9,_)
	 * \W  - Not Word Character
	 * \s  - Whitespace (space, tab, newline)
	 * \S  - Not whitespace (space, tab, newline)
	 * 
	 * \b  - Word Boundary
	 * \B  - Not a Word Boundary
	 * ^   - Beginning of a String 
	 * $   - End of String
	 * 
	 * []  - Matches Characters inside brackets
	 * [^] - Matches Characters NOT in brackets
	 * |   - Either or
	 * ()  - Group 
	 * 
	 * Quantifiers :
	 *  *     - 0 or More
	 *  +	  -	1 or more
	 *  ?	  -	0 or One
	 *  {3}	  -	Exact Number
	 *  {3,6} -	Range of Numbers (minimum, Maximum)
	 * 
	 */ 
	/**
	 *  regex Samples 
	 *  
	 *  String Only :  (a-z,A-z)
	 */
}

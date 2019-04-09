package com.stringhunt.logic;

public class WordGenerator {
    
    public String getCharacterFromCode(int characterCode) {
	String character = null;
		
	switch(characterCode) {
	case 0: character = "A"; break;
	case 1: character = "B"; break;
	case 2: character = "C"; break;
	case 3: character = "D"; break;
	case 4: character = "E"; break;
	case 5: character = "F"; break;
	case 6: character = "G"; break;
	case 7: character = "H"; break;
	case 8: character = "I"; break;
	case 9: character = "J"; break;
	
	case 10: character = "K"; break;
	case 11: character = "L"; break;
	case 12: character = "M"; break;
	case 13: character = "N"; break;
	case 14: character = "O"; break;
	case 15: character = "P"; break;
	case 16: character = "QU"; break;
	case 17: character = "R"; break;
	case 18: character = "S"; break;
	case 19: character = "T"; break;
	
	case 20: character = "U"; break;
	case 21: character = "V"; break;
	case 22: character = "W"; break;
	case 23: character = "X"; break;
	case 24: character = "Y"; break;
	case 25: character = "Z"; break;
	
	default: System.exit(1); break;
	}
	
	return character;
    }

}

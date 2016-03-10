package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;

import lib.LibParserConstants;
import lib.LibParserTokenManager;
import lib.SimpleCharStream;
import lib.Token;


public class TestToken {
	public static void main(String[] args) {
		FileReader input;
		try {
			input = new FileReader(new File("input"+System.getProperty("file.separator")+"tokens_test.txt"));
			LibParserTokenManager scanner = new LibParserTokenManager(new SimpleCharStream(input));

			Token t;
			while ( (t = scanner.getNextToken()).kind != LibParserConstants.EOF ) {
				System.out.println("Found: "+t.image + "("+t.kind+")");
			}
			System.out.println("OK");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
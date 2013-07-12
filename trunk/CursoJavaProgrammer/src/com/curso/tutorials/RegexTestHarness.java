package com.curso.tutorials;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {
	public static void main(String[] args) throws IOException {
		Console console = System.console();
		if (console == null) {
			System.err.println("No console.");
//			System.exit(1);
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {

			System.out.println("%nEnter your regex: ");
			Pattern pattern = Pattern.compile(in.readLine());
//			Pattern pattern = Pattern.compile(console
//					.readLine("%nEnter your regex: "));

			System.out.println("Enter input string to search: ");
			Matcher matcher = pattern.matcher(in.readLine());

			boolean found = false;
			while (matcher.find()) {
				StringBuffer s ;
				
				console.format("I found the text" + " \"%s\" starting at "
						+ "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				//FIXME
				System.out.println("I found the text" +matcher.group() + " starting at " + matcher.start()  );
				found = true;
			}
			if (!found) {
				console.format("No match found.%n");
			}
		}
	}
}

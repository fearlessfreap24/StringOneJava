import java.util.Arrays;

//Given two strings, a and b, return the result of putting them 
//together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//
//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"


public class MakeAbba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeAbba start = new MakeAbba();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] input = { {"Hi", "Bye"}, {"Yo", "Alice"}, {"What", "Up"} };
		for ( String[] i : input ) {
			System.out.printf("i = %s : %s\n", Arrays.deepToString(i), makeAbba(i[0], i[1]));
		}
		
	}

	private String makeAbba(String a, String b) {
		// TODO Auto-generated method stub
		return a+b+b+a;
	}

}

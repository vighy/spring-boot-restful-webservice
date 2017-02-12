package com.examples.reverse;

import java.util.stream.Stream;

public class StringReverser
{
	public String reverse(String strToReverse)
	{
		return Stream.of(strToReverse.split(" "))
								.map(x -> (reverseWord(x)))
								.reduce("", (a,b) -> (a+" "+b));
	}
	
	private String reverseWord(String wordToReverse)
	{
		return new StringBuilder(wordToReverse).reverse().toString();
	}
}

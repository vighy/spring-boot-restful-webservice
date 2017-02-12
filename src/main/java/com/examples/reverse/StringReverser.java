package com.examples.reverse;

import java.util.stream.Stream;

import org.springframework.util.StringUtils;

public class StringReverser
{
	public String reverse(String strToReverse)
	{
		if(StringUtils.isEmpty(strToReverse))
		{
			return null;
		}
		return Stream.of(strToReverse.split(" "))
								.map(x -> (reverseWord(x)))
								.reduce("", (a,b) -> (a+" "+b));
	}
	
	private String reverseWord(String wordToReverse)
	{
		return new StringBuilder(wordToReverse).reverse().toString();
	}
}

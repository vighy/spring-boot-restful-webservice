package com.examples;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examples.fibonacci.FibonacciGenerator;
import com.examples.reverse.StringReverser;
import com.examples.token.TokenGenerator;
import com.examples.triangle.TriangleTypeGuesser;


@RestController
public class Controller
{
	@RequestMapping("/api/ReverseWords")
	public String reverseSentence(@RequestParam(value = "sentence", defaultValue = "") String strToReverse)
	{
		return new StringReverser().reverse(strToReverse);
	}
	
	@RequestMapping("/api/Fibonacci")
	public BigInteger generateSumOfFibonacci(@RequestParam(value = "n", defaultValue = "1") int n)
	{
		return new FibonacciGenerator().generator(n);
	}
	
	@RequestMapping("/api/TriangleType")
	public String checkTrinagleType(int a, int b, int c)
	{
		return (new TriangleTypeGuesser().getType(a ,b ,c)).toString();
	}
	
	@RequestMapping("/api/Token")
	public String getToken()
	{
		return new TokenGenerator().getToken();
	}
}

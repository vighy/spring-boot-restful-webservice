package com.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.fibonacci.FibonacciGenerator;
import com.examples.reverse.StringReverser;
import com.examples.token.TokenGenerator;
import com.examples.triangle.TriangleTypeGuesser;


@RestController
public class Controller
{
	@RequestMapping(value="/api/ReverseWords", method = RequestMethod.GET, produces = "application/json")
	public String reverseSentence(@RequestParam(value = "sentence", defaultValue = "") String strToReverse)
	{
		return new StringReverser().reverse(strToReverse);
	}
	
	@RequestMapping(value="/api/Fibonacci", method = RequestMethod.GET, produces = "application/json")
	public long generateSumOfFibonacci(@RequestParam(value = "n", defaultValue = "1") long n)
	{
		return new FibonacciGenerator().generator(n);
	}
	
	@RequestMapping(value="/api/TriangleType", method = RequestMethod.GET, produces = "application/json")
	public String checkTriangleType(int a, int b, int c)
	{
		return (new TriangleTypeGuesser().getType(a ,b ,c)).toString();
	}
	
	@RequestMapping(value = "/api/Token", method = RequestMethod.GET, produces = "application/json")
	//@ResponseBody
	public String getToken()
	{
		return new TokenGenerator().getToken();
	}
}

package com.examples.fibonacci;

import java.util.stream.LongStream;

public class FibonacciGenerator
{
	
	public long generator(int n)
	{
		long result = LongStream.rangeClosed(1, n)
				.map(x -> {
					long interimResult = 0;
					interimResult +=x;
					System.out.println(interimResult);
			return interimResult;
		}).sum();
						
		return result;
	}
	public static void main(String[] args)
	{
		FibonacciGenerator gen = new FibonacciGenerator();
		System.out.println(gen.generator(20));
	}
}

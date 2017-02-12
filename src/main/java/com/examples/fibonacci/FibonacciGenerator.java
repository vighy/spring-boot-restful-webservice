package com.examples.fibonacci;

import java.util.stream.Stream;

public class FibonacciGenerator
{
	public long generator(long n)
	{
		long [] result = Stream.iterate(new long[]{ 1, 1 },
	               p->new long[]{ p[1], p[0]+(p[1]) })
				.limit(n)
				.reduce((first, second) -> second).get();
		return result[0];
	}
}
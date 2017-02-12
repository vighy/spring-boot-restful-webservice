package com.examples.fibonacci;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciGenerator
{
	public BigInteger generator(int n)
	{
		BigInteger [] result = Stream.iterate(new BigInteger[]{ BigInteger.ONE, BigInteger.ONE },
	               p->new BigInteger[]{ p[1], p[0].add(p[1]) })
				.limit(n)
				.reduce((first, second) -> second).get();
		return result[0];
	}
}
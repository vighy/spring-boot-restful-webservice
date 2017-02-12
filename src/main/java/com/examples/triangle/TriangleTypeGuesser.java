package com.examples.triangle;

public class TriangleTypeGuesser
{
	public enum TriangleType  {Equilateral, Scalene, Isosceles, Error};
	
	public TriangleType getType(int side1, int side2, int side3)
	{
		if(side1 < 0 || side2 < 0 || side3 < 0)
		{
			return TriangleType.Error;
		}
		
		boolean side1Side2 = side1 == side2;
		boolean side1Side3 = side1 == side3;
		boolean side2Side3 = side2 == side3;
		
		if(side1Side2 && side1Side3 && side2Side3)
		{
			return TriangleType.Equilateral;
		}

		if (side1Side2)
		{
			return (side1 + side2 <= side3) ? TriangleType.Error : TriangleType.Isosceles;
		}

		if (side1Side3)
		{
			return (side1 + side3 <= side2) ? TriangleType.Error : TriangleType.Isosceles;
		}

		if (side2Side3)
		{
			return (side2 + side3 <= side1) ? TriangleType.Error : TriangleType.Isosceles;
		}
		
		if (side1 > side2 && side1 > side3 && side2 + side3 <= side1)
		{
			return TriangleType.Error;
		}

		if (side2 > side1 && side2 > side3 && side1 + side3 <= side2)
		{
			return TriangleType.Error;
		}
		
		return (side1 + side2 <= side3) ? TriangleType.Error : TriangleType.Scalene;
	}
}

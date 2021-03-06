package com.prac.model;

public class Rectangle
{
	private double length, breadth;
	
	public Rectangle()
	{
		this(20, 10);
	}

	public Rectangle(double length, double breadth)
	{
		this.breadth = breadth;
		this.length = length;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getBreadth()
	{
		return breadth;
	}

	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public double calcArea()
	{
		return (this.length*this.breadth);
	}
	
	@Override
	public String toString()
	{
		String rec = "[Length: " + this.length + ", Breadth: " + this.breadth + "]";
		return rec;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		
		if(obj instanceof Rectangle)
		{
			Rectangle r = (Rectangle)obj;
			return (r.length == this.length && r.breadth == this.breadth);
		}
		return false;
	}
}

class Demo
{
	void m1()
	{
		System.out.println("parent method");
	}
}

class Sample extends Demo
{
	void m1()
	{
		System.out.println("child method");
	}
}

class Example12
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1();
	}
}
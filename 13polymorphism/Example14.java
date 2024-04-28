class Demo
{
	void m1()
	{
		System.out.println("parent method");
	}
}

class Sample extends Demo
{
	void m2()
	{
		System.out.println("child method");
	}
}

class Example14
{
	public static void main(String[] args)
	{
		Sample obj =  new Sample();
		obj.m1();
		obj.m2();
	}
}
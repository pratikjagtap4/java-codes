class Demo
{
	void m1(int a)
	{
		System.out.println("parent int method");
	}
}

class Sample extends Demo
{
	void m1(float b)
	{
		System.out.println("child float methods");
	}
}

class Example15
{
	public static void  main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1(20.5f);
		obj.m1(10);
	}
}
class Demo
{
	void m1()
	{
		System.out.println("parent method");
	}
}

class Sample extends Demo
{
	final void m1()
	{
		System.out.println("child final method");

	}
}

class Example21
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		
		obj.m1();
	}
}
class Demo
{
	void m1()
	{
		System.out.println("inside parent method");
	}
}

class Sample extends Demo
{
	void m1()
	{
		System.out.println("inside child method");
	}
	void test()
	{
		this.m1();
		super.m1();
	}
}

class Example13
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.test();

	}
}
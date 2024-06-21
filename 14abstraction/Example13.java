abstract class Demo
{
	abstract void m1();

	void m2()
	{
		System.out.println("parent m2");
	}
}



class Example13 extends Demo
{
	void m1()
	{
		System.out.println("overriden m1");
	}

	void m2()
	{
		System.out.println("child m2");
	}

	void test()
	{
		m1();
		this.m2();
		super.m2();
	}
	public static void main(String[] args)
	{
		new Example13().test();
	}
}
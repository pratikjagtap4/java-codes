class Example12
{
	Example12()
	{
		System.out.println("inside 0 args");
	}
	Example12(int a)
	{
		System.out.println("inside 1 args");
	}
	void m1()
	{
		System.out.println("inside m1 method");
	}

	public static void main(String[] args)
	{
		new Example12().m1();
		new Example12(10).m1();
	}
}
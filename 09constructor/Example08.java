class Example08
{
	int a;
	Example08()
	{
		System.out.println(a);
		a=10;
	}
	void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		Example08 obj = new Example08();
		obj.m1();
	}
}
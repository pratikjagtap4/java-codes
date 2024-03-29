class Example8
{
	int a;
	Example8()
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
		Example8 obj = new Example8();
		obj.m1();
	}
}
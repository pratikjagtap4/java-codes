class Example06
{
	int a;
	{
		System.out.println("inside instance block " + a);
		a = 10;
	}

	Example06()
	{
		System.out.println("inside constructor " +a);
		a = 100;
	}
	void m1()
	{
		System.out.println("inside m1 " + a);
		a =200;
	}
	public static void main(String[] args)
	{
		Example06 obj = new Example06();
		obj.m1();
		System.out.println(obj.a);
	}
}

class combo5
{	static int a = 100;
	static void m1()
	{
		System.out.println("inside m1");
	}

	public static void main(String[] args)
	{
		combo5 obj = new combo5();
		obj.test();
	}
	void test()
	{
		//directly 
		System.out.println(a);
		m1();

		//classname
		System.out.println(combo5.a);
		combo5.m1();

		//object
		combo5 obj = new combo5();
		System.out.println(obj.a);
		obj.m1();
	}
}
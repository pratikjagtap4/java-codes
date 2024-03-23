class combo7
{
	int a = 100;
	void m1()
	{
		System.out.println("inside m1");
	}

	public static void main(String[] args)
	{
		combo7 obj = new combo7();
		obj.test();
	}

	void test()
	{
		// directly
		System.out.println(a);
		m1();

		//classname
		//System.out.println(combo7.a);

		//object
		combo7 obj = new combo7();
		System.out.println(obj.a);
		obj.m1();
	}
}


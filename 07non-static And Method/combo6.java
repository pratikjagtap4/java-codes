class sample6
{
	static int a = 100;
	static void m1()
	{
		System.out.println("insde m1");
	}
}

class combo6
{
	public static void main (String[] args)
	{
		combo6 obj = new combo6();
		obj.test();
	}

	void test()
	{
		//directly
		//System.out.println(a);


		//classname
		System.out.println(sample6.a);
		sample6.m1();
		
			
		//object
		sample6 obj = new sample6();
		System.out.println(obj.a);
		obj.m1();

	}
}
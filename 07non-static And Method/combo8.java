class sample8
{
	int a = 100;
	void m1()
	{
		System.out.println("inside m1");
	}
}
class combo8
{
	public static void main(String[] args)
	{
		
		combo8 obj = new combo8();
		obj.test();
	}

	void test()
	{
		// directly
		//System.out.println(a);

		//classname
		//System.out.println(sample8.a);

		//classname
		sample8 obj = new sample8();
		System.out.println(obj.a);
		obj.m1();

	}
}
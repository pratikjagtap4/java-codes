class sample3
{
	static int a = 100;
	static void m1()
	{
		System.out.println("inside m1");
	}
}


class combo2
{
	public static void main(String[] args)
	{
		// directly
		//System.out.println(a);
		//m1();

	

		//using classname
		System.out.println(sample3.a);
		sample3.m1();

		// using object 
		sample3 obj = new sample3();
		System.out.println(obj.a);
		obj.m1();

	}
}

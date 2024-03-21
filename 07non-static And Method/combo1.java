class combo1
{
	static int a = 100;
	static void m1()
	{
		System.out.println("inside m1");
	}
	
	public static void main(String[] args)
	{
		// directly 
		System.out.println(a);
		m1();

		// using classname 
		System.out.println(combo1.a);
		combo1.m1();

		// using object
		combo1 obj = new combo1();
		System.out.println(obj.a);
		obj.m1();
	}

}
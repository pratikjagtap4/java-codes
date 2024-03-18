class $10_static7
{
	public static void main(String[] args)
	{
		// direct approach
		method1();

		//using classname
		$10_static7.method1();

		// using object
		$10_static7 ref = new $10_static7();
		ref.method1();


	}
	static void method1()
	{
		System.out.println("hello World");
		return;
	}
}



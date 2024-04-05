class Example09
{
	{
		//calling method from instance block
		m1();
	}
	Example09()
	{
		// calling method from constructor
		m1();
	}
	void m1()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		Example09 obj = new Example09();
	}
}
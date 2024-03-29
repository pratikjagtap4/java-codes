class Example5
{
	Example5( int a)
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args)
	{
		Example5 obj = new Example5(10);
		new Example5(10);
	}
}
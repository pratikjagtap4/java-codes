class Example4
{
	Example4()
	{
		System.out.println("inside constructor");
	}
	
	Example4(int a )
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args)
	{
		Example4 obj1 = new Example4();
		Example4 obj2 = new Example4(10);
	}
}
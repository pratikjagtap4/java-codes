class Example04
{
	Example04()
	{
		System.out.println("inside constructor");
	}
	
	Example04(int a )
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args)
	{
		Example04 obj1 = new Example04();
		Example04 obj2 = new Example04(10);
	}
}
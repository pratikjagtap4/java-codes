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
		new Example04();
		new Example04(10);
	}
}
class Example05
{
	Example05( int a)
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args)
	{
		new Example05(100);
		new Example05(10);
	}
}
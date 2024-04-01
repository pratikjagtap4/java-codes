class Example05
{
	Example05( int a)
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args)
	{
		Example05 obj = new Example05(10);
		new Example05(10);
	}
}
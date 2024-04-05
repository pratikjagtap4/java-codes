class Example14
{
	Example14()
	{
		this(10);
		System.out.println("inside 0 args");
	}
	Example14(int a)
	{
		System.out.println("inside 1 args");
	}

	public static void main(String[] args)
	{
		new Example14();
	}
}
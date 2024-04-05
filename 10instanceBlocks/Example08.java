class Example08
{
	static int a;
	{
		a = 10;
		System.out.println("inside instance block " + a);
	}
	Example08()
	{
		a = 100;
		System.out.println("inside constructor " +a);
	}
	public static void main(String[] args)
	{
		Example08 obj = new Example08();
	}
}
class Example02
{
	Example02()
	{
		System.out.println("inside constructor");
	}

	{
		System.out.println("inside instance block");
	}
	public static void main(String[] args)
	{
		Example02 obj = new Example02();
	}
}

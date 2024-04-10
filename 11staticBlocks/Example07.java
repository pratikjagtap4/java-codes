class Example07
{
	static
	{
		System.out.println("inside stati block");
	}

	{
		System.out.println("inside non static block");
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		Example07 obj = new Example07();
		Example07 obj2 = new Example07();
	}
}
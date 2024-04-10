class Example7
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
		Example7 obj = new Example7();
		Example7 obj2 = new Example7();
	}
}
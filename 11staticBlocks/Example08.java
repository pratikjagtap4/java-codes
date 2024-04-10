class Example08
{
	static 
	{
		System.out.println("inside static block");
	}

	{
		System.out.println("inside non static block");
	}

	Example08()
	{
		System.out.println("inside 0 arg constructor");
	}

	Example08(int a )
	{
		System.out.println("inside 1 arg constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		Example08 obj =  new Example08();
		Example08 obj2 = new Example08(10);
	}
}
class Example10
{
	int a = 10;
	static
	{
		System.out.println("inside static block");
		Example10 obj = new Example10();
		System.out.println(obj.a);
	}
	Example10()
	{
		System.out.println("inside constructor");
	}
	{
		System.out.println("inside non static block");
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println("stop");
	}
}
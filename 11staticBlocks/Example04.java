class Example04
{
	static int a;

	static
	{
		System.out.println("inside static block" +a);
		a = 100;
	}

	static void m1()
	{
		System.out.println("inside m1 method" + a);
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		m1();
		System.out.println("stop");
	}

}
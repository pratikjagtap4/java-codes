class Example09
{
	static int a ;

	static 
	{
		System.out.println("inside static block " +a );
		a = 10;
	}

	{
		System.out.println("inside non static block " + a);
		a=100;
	}

	Example09(int x)
	{
		System.out.println("inside constructor " + a);
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		Example09 obj = new Example09(10);
		obj.a = 20;
		System.out.println("--------------------");
		Example09 obj2 = new Example09(2);
	}
}
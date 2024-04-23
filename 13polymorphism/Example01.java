class Example01
{
	void m1()
	{
		System.out.println("0 arg m1 method");
	}
	void m1(int a)
	{
		System.out.println("1 arg m1 method");
	}

	public static void main(String[] args)
	{
		Example01 obj = new Example01();
		obj.m1();
	}
}
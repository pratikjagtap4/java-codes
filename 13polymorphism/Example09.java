class Example09
{
	static void m1()
	{
		System.out.println("0 arg");
	}
	static void m1(int a)
	{
		System.out.println("1 arg");
	}
	public static void main(String[] args)
	{
		Example09 obj = new Example09();
		obj.m1();
	}
}

class $05_nonStatic
{
	int a = 100;
	public static void main(String[] args)
	{
		$05_nonStatic obj = new $05_nonStatic();

		obj.m1();
	}

	void m1()
	{
		System.out.println(a);
		m2();
	}
	void m2()
	{
		System.out.println("inside m2");
		m3();
	}
	static void  m3()
	{
		System.out.println("inside m3");
	}
}


class $04_nonStatic
{
	int a = 100;
	public static void main(String [] args)
	{
		$04_nonStatic obj1 = new $04_nonStatic();

		System.out.println(obj1.a);
		obj1.m1();
	}

	void m1()
	{
		System.out.println("inside m1 method");
	}
}

class Example02
{
	void m1(int a)
	{
		System.out.println("m1- int arg");
	}

	void m1(float b)
	{
		System.out.println("m1-float arg");
	}

	public static void main(String[] args)
	{
		Example02 obj = new Example02();
		obj.m1(10.5f);
	}
}
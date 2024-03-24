class sample33
{
	static int a = 100;
	float b = 200.5f;
}

class demo
{
	void m1()
	{
		sample33 obj = new sample33();

		System.out.println( sample33.a + obj.b);
	}
}

class demo2
{
	static void m2()
	{
		sample33 obj = new sample33();

		System.out.println(sample33.a + obj.b);
	}
}

class example33
{
	public static void main(String[] args)
	{
		demo d = new demo();
		d.m1();
		demo2.m2();


	}
}

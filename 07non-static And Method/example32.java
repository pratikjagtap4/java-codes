class sample32
{
	static int a = 100;
	float b = 200.5f;
}

class example32
{

	public static void main(String[] args)
	{
		example32 obj = new example32();
		obj.m1();
		example32.m2();
	}

	void m1()
	{
		sample32 obj = new sample32();
		System.out.println( sample32.a + obj.b);
	}

	static void m2()
	{
		sample32 obj = new sample32();
		System.out.println( sample32.a + obj.b);
	}
}
 
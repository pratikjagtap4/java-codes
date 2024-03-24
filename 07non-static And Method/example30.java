class example30
{
	static int a = 100;
	float b = 200.5f;

	public static void main(String[] args)
	{
		int x = 10;
		float y = 20.5f;

		example30 obj = new example30();

		obj.m1(x , y);
	}

	void m1(int x , float y)
	{
		System.out.println(example30.a + x);
		System.out.println( b + y);
	}
} 
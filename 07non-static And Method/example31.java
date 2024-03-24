class example31 
{
	static int a = 100;
	float b = 200.5f;

	public static void main(String[] args)
	{
		example31 obj = new example31();

		int x = obj.m1();
		float y = example31.m2();
		System.out.println(x);
		System.out.println(y);


	}

	int m1()
	{
		int x = 10 , y = 20;
		return x + y;
	}

	static float m2()
	{
		float x = 10.5f , y = 20.5f;
		return x + y;
	}
} 
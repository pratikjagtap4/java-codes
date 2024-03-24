class example9
{
	static int a = 100;
	float b = 200.5f;

	public static void main(String[] args)
	{
		System.out.println(example9.a);

		example9 obj = new example9();

		System.out.println(obj.b);
		obj.m1();
	}

	void m1()
	{
		System.out.println(example9.a);
		System.out.println(b);
	}
}
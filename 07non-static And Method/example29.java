class example29
{
	static int a = 100;
	float b = 200.5f;

	public static void main(String[] args)
	{
		System.out.println(example29.a);

		example29 obj = new example29();

		System.out.println(obj.b);
		obj.m1();
	}

	void m1()
	{
		System.out.println(example29.a);
		System.out.println(b);
	}
} 
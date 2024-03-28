class example54
{
	int a = 100;
	static void m1( example54 obj)
	{
		System.out.println(obj.a);
	}

	public static void main(String[] args)
	{
		m1(new example54());
	}
}

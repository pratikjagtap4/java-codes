class example36
{
	int a = 100;

	public static void main(String[] args)
	{
		example36 obj = m1();
		System.out.println(obj.a);
	}

	static example36 m1()
	{
		example36 obj = new example36();

		return obj;
	}
}
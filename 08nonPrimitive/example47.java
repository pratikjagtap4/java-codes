class example47
{
	int a = 10;
	float b = 20.5f;

	void m1(int p , float q)
	{
		System.out.println(p+q);
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		example47 obj1 = new example47();
		obj1.m1(100 , 100.5f);
	}
}
class example48
{
	int a = 100;
	float b = 200.5f;

	void m1(int a , float b)
	{
		System.out.println(a+b); // it prints local variables

		//1st approach
		example48 obj1 = new example48();
		System.out.println(obj1.a + obj1.b);
	}

	public static void main(String[] args)
	{
		example48 obj1 = new example48();
		obj1.m1(10 , 20.5f);
	}
}
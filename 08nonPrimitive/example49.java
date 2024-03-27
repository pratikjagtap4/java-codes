class example49
{
	int a = 100;
	float b = 200.5f;

	void m1(int a , float b)
	{
		System.out.println(a+b);

		//2nd approach

		System.out.println(this.a + this.b);
	}
	
	public static void main(String[] args)
	{
		example49 obj = new example49();
		obj.m1(10 , 20.5f);

	}
}
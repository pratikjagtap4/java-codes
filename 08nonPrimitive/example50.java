class example50
{
	int a;
	float b;

	void m1(int a , float b)
	{
		System.out.println(this.a + this.b);

		this.a = a;
		this.b = b;
		
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args)
	{
		example50 obj = new example50();

		obj.m1(10 , 20.5f);
	}
}
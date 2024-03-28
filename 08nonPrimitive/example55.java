class example55
{
	int a = 100;
	static void m1(int a )
	{
		System.out.println(a);
		System.out.println(this.a); // error: non-static variable this cannot be referenced from a static context
	}
	public static void main(String[] args)
	{
		example55 obj = new example55();
		obj.m1(10);
	}
}
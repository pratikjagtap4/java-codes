class demo
{
	int a = 100;
	void m1()
	{
		System.out.println(a);
	}
}
class example41
{
	static demo obj ;
	public static void main(String[] args)
	{
		obj = new demo();
		System.out.println(obj.a);
		obj.m1();

	}
}


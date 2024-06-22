class Outer
{
	void m1()
	{
		class Inner
		{
			int a = 100;
		}
		Inner i = new Inner();
		System.out.println(i.a);
	}

	void m2()
	{
		class Inner
		{
			int b = 200;
		}
		Inner i = new Inner();
		System.out.println(i.b);
	}
}
class Example14
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();
		o.m2();
	}
}
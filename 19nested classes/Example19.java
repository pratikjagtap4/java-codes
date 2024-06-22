class Outer
{
	int a = 100;

	static class Inner
	{
		void m1()
		{
			Outer o = new Outer();
			System.out.println(o.a);
		}
	}
}

class Example19
{
	public static void main(String[] args)
	{
		Outer.Inner i = new Outer.Inner();
		i.m1();
	}
}
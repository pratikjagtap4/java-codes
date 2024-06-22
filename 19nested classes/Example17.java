class Outer
{
	static int a = 100;

	static class  Inner
	{
		void m1()
		{
			System.out.println(a);
		}
	}
}


class Example17
{
	public static void main(String[] args)
	{
		Outer o = new Outer();

		Outer.Inner i = new Outer.Inner();
		i.m1();
	}
}
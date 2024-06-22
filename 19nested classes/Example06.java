class Outer
{
	int a = 10;
	float b = 20.5f;
	void m1()
	{
		Inner i = new Inner();
		i.m2();
	}

	class Inner
	{
		int x = 100;
		float y = 200.5f;

		void m2()
		{
			System.out.println(x+y);
			System.out.println(a+b);
		}
	}
}

class Example06
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();

	}
}
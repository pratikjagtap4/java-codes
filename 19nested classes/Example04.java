class Outer
{
	int a = 10;
	Inner i = new Inner();

	class Inner
	{
		float b = 10.5f;

		void m1()
		{
			System.out.println(a+b);
		}
	}
}

class Example04
{
	public static void main(String[] args)
	
	{
		Outer o = new Outer();

		//o.i=o.new Inner();
		o.i.m1();
	}
}
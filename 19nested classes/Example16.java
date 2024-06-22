class Outer 
{
	int a = 100;
	static float b = 200.5f;
	
	class Inner
	{
		void m1()
		{
			System.out.println(a+b);
		}
	}
}

class Example16
{
	public static void main(String[] args)
	{
		Outer o =  new Outer();

		Outer.Inner i = o.new Inner();
		
		i.m1();
		
	}
}
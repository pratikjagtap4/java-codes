abstract class Outer
{
	abstract void m1();
}

class Example23
{	
	Outer o = new Outer()
	{
		void m1()
		{
			System.out.println("Inside m1 Method");
		}
	};

	public static void main(String[] args)
	{
		Example23 obj = new Example23();
		obj.o.m1();
	}
}
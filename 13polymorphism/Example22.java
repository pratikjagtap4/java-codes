class Demo
{
	void m1()
	{
		System.out.println("parent method");
	}
}

class Sample extends Demo
{
	void m2()
	{
		System.out.println("child method");
	}
}


class Example22
{
	public static void main(String[] args)
	{
		Demo d = new Sample();
		
		d.m1();
		//d.m2();
		System.out.println("---------------");

		Sample s = (Sample)d;

		s.m1();
		s.m2();

		System.out.println("---------------");

		d.m1();
	}
}
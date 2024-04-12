class sample
{
	void m()
	{
		System.out.println("inside m method");
	}
}

class Demo1 extends sample
{
	void m1()
	{
		System.out.println("inside m1 method");
	}
}

class Demo2 extends sample
{
	void m2()
	{
		System.out.println("inside m2 method");
	}
}

class Demo3 extends sample
{
	void m3()
	{
		System.out.println("inside m3 method");
	}
}
class Example05
{
	public static void main(String[] args)
	{
		sample s = new sample();
		s.m();

		Demo1 d1 = new Demo1();
		d1.m1();
		d1.m();

		Demo2 d2 = new Demo2();
		d2.m2();
		d2.m();

		Demo3 d3 = new Demo3();
		d3.m3();
		d3.m();
	}
}
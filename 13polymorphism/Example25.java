class Demo
{
	int a = 100;
	void m1()
	{
		System.out.println("parent  method" + this.a);
	}
}

class Sample extends Demo
{
	float b=200.5f;
	void m1()
	{
		System.out.println("child method" + this.b +" " + super.a);
	}
}

class Example25
{
	public static void main(String[] args)
	{
		Demo obj = new Sample();

		obj.m1();
	}
}
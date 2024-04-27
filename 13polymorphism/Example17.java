class Demo
{
	int m1()
	{
		System.out.println("parent method");
	}
}

class Sample extends Demo
{
	float m1()
	{
		System.out.println("child method");
	}
}

class Example17
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		System.out.println(obj.m1());
	}
}
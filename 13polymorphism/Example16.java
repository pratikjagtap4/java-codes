class Demo
{
	int m1()
	{
		return 10;
	}
}

class Sample extends Demo
{
	int m1()
	{
		return 20;
	}
}

class Example16
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		System.out.println(obj.m1());
	}
}
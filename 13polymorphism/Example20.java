class Demo
{
	Demo m1()
	{
		return new Demo();
	}
}

class Sample extends Demo
{
	Sample m1()
	{
		return new Sample();
	}
}

class Example20
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

		Sample obj2 = obj.m1();
		Demo obj3 = obj.m1();
	}
}
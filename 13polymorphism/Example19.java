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


class Example19
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		Demo obj2 = obj.m1();
		System.out.println(obj.m1());
	}
}
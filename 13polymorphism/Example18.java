class Demo
{
	Sample m1()
	{
		return new Sample();
	}
}

class Sample extends Demo
{
	Sample m1()
	{
		return new Sample();
	}
}

class Example18
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		//Demo return_obj = obj.m1();

		System.out.println(obj.m1());
	}
}
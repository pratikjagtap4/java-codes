class Demo
{
	Demo()
	{
		System.out.println("0 arg parent constructor");
	}
}

class Sample extends Demo
{
	Sample()
	{
		System.out.println("0 arg child constructor");
	}
	Sample(int a)
	{
		System.out.println("1 arg child constructor");
	}
}

class Example18
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		Sample obj2 = new Sample(10);

	}
}
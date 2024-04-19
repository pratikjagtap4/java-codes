class Demo
{
	Demo()
	{
		System.out.println("0 args parent constructor");
	}

	Demo(int a)
	{
		System.out.println(" 1 arg parent constructor");
	}
}

class Sample extends Demo
{
	Sample()
	{
		System.out.println("0 args child constructor");
	}
}

class Example17
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

	}
}
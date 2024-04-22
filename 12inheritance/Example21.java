class Demo
{
	{
		System.out.println("inside parent instance block");
	}
	Demo()
	{
		System.out.println("inside parent constructor");
	}
}

class Sample extends Demo
{
	{
		System.out.println("Child instace block");
	}
	Sample()
	{
		System.out.println("inside child constructor");
	}
}

class Example21
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

	}
}
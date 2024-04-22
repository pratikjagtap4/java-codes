class Demo
{
	{
		System.out.println("inside parent instance block");
	}
}

class Sample extends Demo
{
	{
		System.out.println("inside parent insyance block");
	}
}

class Example23
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
	}
}
class Demo
{
	Demo()
	{
		System.out.println("0 args parent");
	}
	Demo(int a)
	{
		this();
		System.out.println("1 arg parent");
	}
}

class Sample extends Demo
{
	Sample()
	{
		this(10);
		System.out.println("0 arg child ");
	}
	Sample(int a )
	{
		super(10);
		System.out.println("1 arg child");
	}
}

class Example19
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

	}
}
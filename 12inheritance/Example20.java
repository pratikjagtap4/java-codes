class Demo
{
	Demo()
	{
		System.out.println("inside Demo constructor");
	}
}

class Sample extends Demo
{
	Sample()
	{
		super();
		this(10);
		System.out.println("inside Sample Constructor");
	}
	Sample(int a)
	{
		System.out.println("inside sample 1 args constructor");
	}
}

class Example20
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

	}
}
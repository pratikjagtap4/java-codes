class Demo
{
	{
		System.out.println("inside parent instance block");
	}

}

class Sample extends Demo
{
	{
		System.out.println("inside Child instance block");
	}

	Sample()
	{
		System.out.println("inside Child constructor");
	}
}

class Example22
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
	}
}
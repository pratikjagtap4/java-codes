class Demo
{
	Demo()
	{
		System.out.println("inside parent class");
	}
}
class Sample extends Demo
{
	Sample()
	{
		super();
		System.out.println("inside child constructor");
	}
}
class  Example14
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();

	}
}
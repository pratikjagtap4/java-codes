class Demo
{
	int a = 10;
	Demo()
	{
		System.out.println("parent constructor");
	}
}

class Sample extends Demo
{
	Sample()
	{
		System.out.println("child constructor");
	}
}
class Example15
{
	public static void main(String[] args)
	{
		Sample s = new Sample();
		System.out.println(s.a);
	}

}
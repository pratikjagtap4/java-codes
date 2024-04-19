class Demo
{
	Demo()
	{
		System.out.println("parent constructor");
	}
}

class Sample extends Demo
{

}
class Example16
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
	}
}
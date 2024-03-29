class Demo
{
	Demo()
	{
		System.out.println("Inside Demo constructor");
	}
}
class Example6
{
	Example6()
	{
		System.out.println("inside Example6 constructor");
	}

	public static void main(String[] args)
	{
		Example6 obj1 =new Example6();

		Demo obj2 = new Demo();
	}
}

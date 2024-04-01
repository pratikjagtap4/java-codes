class Demo
{
	Demo()
	{
		System.out.println("Inside Demo constructor");
	}
}
class Example06
{
	Example06()
	{
		System.out.println("inside Example6 constructor");
	}

	public static void main(String[] args)
	{
		Example06 obj1 =new Example06();

		Demo obj2 = new Demo();
	}
}

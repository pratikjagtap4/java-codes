abstract class Demo
{
	int a; 
	Demo(int a)
	{
		System.out.println(" val of a is " + this.a);
		this.a = a ;
		System.out.println("val of a is " + this.a);
	}
}


class Example12 extends Demo
{
	Example12()
	{
		super(10);
	}

	public static void main(String[] args)
	{
		new Example12();
	}
}
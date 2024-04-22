class Demo
{
	static 
	{
		System.out.println("inside parent static block");
	}
}

class Sample extends Demo
{
	static 
	{
		System.out.println("inside child static block");
	}

}
class Example25
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
	}
}
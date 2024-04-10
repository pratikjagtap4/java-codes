class Demo
{
	static 
	{
		System.out.println("inside static block - 1");
	}
	static int a = 10;
}
class Demo2
{
	static int b = 200;

	static 
	{
		System.out.println("inside static block -2");
	    System.out.println(Demo.a);
	}
}
class Example06
{
	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println(Demo2.b);
		System.out.println("stop");
	}
}
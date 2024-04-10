class Demo1
{
	static int a = 10;
}

class Demo2 extends Demo1
{
	static float b = 200.5f;
}

class Example03
{	
	public static void main(String[] args)
	{
		//parent 
		System.out.println(Demo1.a);
		//System.out.println(Demo1.b);

		System.out.println("----------------");

		//child
		System.out.println(Demo2.a);
		System.out.println(Demo2.b);
	}
}


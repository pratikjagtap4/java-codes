class sample
{
	int a = 10;
}

class Demo1 extends sample
{
	int a1 = 1;
}

class Demo2 extends sample
{
	int a2 = 2;
}

class Demo11 extends Demo1
{
	int a11 = 11;
}

class Demo22 extends Demo2
{
	int a22 = 22;
}

class Example08
{
	public static void main(String[] args)
	{
		Demo11 obj1 = new Demo11();
		System.out.println( obj1.a +" " +obj1.a1 + " " + obj1.a11);

		Demo22 obj2 = new Demo22();
		System.out.println( obj2.a + " " + obj2.a2 + " " + obj2.a22);

	}
}
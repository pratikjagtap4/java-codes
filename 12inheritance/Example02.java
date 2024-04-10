class Demo1
{
	void m1()
	{
		System.out.println("inside parent");
	}
}

class Demo2 extends Demo1
{
	void m2()
	{
		System.out.println("inside child");
	}
}
class Example02
{
	public static void main(String[] args)
	{
	//parent
	Demo1 obj = new Demo1();
	obj.m1();
	//obj.m2();



	System.out.println("----------");
	//child
	Demo2 obj2 = new Demo2();
	obj2.m1();
	obj2.m2();
	}
}
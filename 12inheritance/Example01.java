class Demo1
{
	int a = 10;
}

class Demo2 extends Demo1
{
	float b = 200.5f;
}
class Example01
{
	public static void main(String[] args)
	{
	//parent
	Demo1 obj = new Demo1();
	System.out.println(obj.a);
	//System.out.println(obj.b);
	
	System.out.println("------------------");
	//child
	Demo2 obj2 = new Demo2();
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	}

}
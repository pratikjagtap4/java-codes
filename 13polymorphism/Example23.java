class Demo
{
	int a = 100;
}

class Sample extends Demo
{
	float b = 200.5f;
}

class Example23
{
	public static void main(String[] args)
	{
		Demo obj = new Sample();
		
		System.out.println(obj.a);
		//System.out.println(obj.b); compile error

	}
}
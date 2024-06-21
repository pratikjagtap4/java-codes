class Demo
{
	public String toString()
	{
		return "user define tosting method";
	}
}

class Example5
{
	public static void main(String[] args)
	{
		Example5 obj = new Example5();
		System.out.println(obj);

		Demo obj2 = new Demo();
		System.out.println(obj2);

		String str = new String("Hello");
		System.out.println(str);
	}
}
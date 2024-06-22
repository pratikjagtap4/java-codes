class Demo
{
	public String toString()
	{
		return "user define tosting method";
	}
}

class Example05
{
	public static void main(String[] args)
	{
		Example05 obj = new Example05();
		System.out.println(obj);

		Demo obj2 = new Demo();
		System.out.println(obj2);

		String str = new String("Hello");
		System.out.println(str);
	}
}
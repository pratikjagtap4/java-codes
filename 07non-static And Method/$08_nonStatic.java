class sample2
{
	int a = 100;
	void m1()
	{
		System.out.println("inside m1");
	}
}
class $08_nonStatic
{
	public static void main(String[] args)
	{
		sample2 obj1 = new sample2();
		System.out.println(obj1.a);
		obj1.m1();

		sample2 obj2 = new sample2();
		System.out.println(obj2.a);
		obj2.m1();
	}
}

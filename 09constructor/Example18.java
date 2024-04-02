class Example18
{
	int a ;
	Example18()
	{
		System.out.println("inside 0 arg");
	}
	Example18(int a)
	{
		this();
		System.out.println("inside 1 arg");
		this.a = a;
		System.out.println(a);
	}
	void m1(int a )
	{
		System.out.println("insdie m1");
		this.a = a;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Example18 obj = new Example18(10);
		obj.m1(100);
	}
}
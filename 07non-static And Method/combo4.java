class sample4
{
	int a = 100;
	void m1()
	{
		System.out.println("inside m1");
	}
}
class combo4
{
	public static void main(String[] args)
	{
		//directly 
		//System.out.println(a);

		//classname
		//System.out.println(sample4.a);

		//object
		sample4 obj = new sample4();
		System.out.println(obj.a);
		obj.m1();

	}

}
class example44
{
	float f= 100.5f;
	void m1()
	{
		System.out.println(f);
	}
	example44 obj1;

	public static void main(String[] args)
	{
		example44 obj2 =new example44();

		obj2.obj1 = new example44();

		obj2.obj1.m1();
	}
}
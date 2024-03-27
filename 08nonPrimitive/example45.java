class Demo
{
	float f =100.5f;
	void m1()
	{
		System.out.println(f);
	}
}

class example45
{
	Demo obj1 = new Demo();
	public static void main(String[] args)
	{
		example45 obj2 = new example45();
		obj2.obj1.m1();
	}

}

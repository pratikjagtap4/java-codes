class example43
{
	float  f =100.5f;
	example43 obj1;

	public static void main(String[] args)
	{
		example43 obj2 = new example43();

		System.out.println(obj2.obj1);

		obj2.obj1 = new example43();

		System.out.println(obj2.obj1.f);

		obj2.f = 200.5f;
		obj2.obj1.f = 300.5f;

		System.out.println(obj2.f);
		System.out.println(obj2.obj1.f);
	}
}

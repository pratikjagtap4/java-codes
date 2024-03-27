class example42
{
	float f = 200.5f;
	example42 obj1;

	public static void main(String[] args)
	{
		example42 obj2 =new example42();

		obj2.obj1 = new example42();

		System.out.println(obj2.obj1.f);
	}
}

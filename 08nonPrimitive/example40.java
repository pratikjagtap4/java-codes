class example40
{
	int a = 100;
	static example40 obj;

	public static void main(String[] args)
	{
		obj = new example40();

		System.out.println(obj.a);
	}

}
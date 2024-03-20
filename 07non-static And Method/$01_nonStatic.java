class $01_nonStatic
{
	int a = 100;

	public static void main(String[] args)
	{
		// direct approach
		//System.out.println(a);

		// using classname
		//System.out.println($01_nonStatic.a);

		// using object

		$01_nonStatic obj = new $01_nonStatic();
		System.out.println(obj.a);

	}
}


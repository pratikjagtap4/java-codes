class $07_nonStatic
{
	int a= 100;

	public static void main(String[] args)
	{
		$07_nonStatic obj = new $07_nonStatic();
		System.out.println(obj.a);

		
		$07_nonStatic obj2 = new $07_nonStatic();
		System.out.println(obj2.a);

	}
}
class $03_nonStatic
{
	int a = 100;
	static float b = 200.5f;

	public static void main(String[] args)
	{
		$03_nonStatic obj = new $03_nonStatic();

		float result = obj.a + b;

		System.out.println(result);
	}
}
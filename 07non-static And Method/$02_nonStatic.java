class $02_nonStatic
{
	int a = 100;
	float b = 200.5f;
	char c = 'p';

	public static void main(String[] args)
	{
		$02_nonStatic obj = new $02_nonStatic();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
class Maths
{
	public static void main(String[] args)
	{
		int min = 1, max = 6;
		
		for (int i=0; i<=20 ;i++ )
		{
			System.out.println(Math.floor(Math.random()*max + min));
		}
		
		int a = 257;

		byte b = (byte) a;
		System.out.println(b);

	}
}
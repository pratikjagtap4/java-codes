class Example25
{
	public static void  main(String[] args)
	{
		String str = "This-class-is-core-java-class";
		String[] s = str.split("-");

		for(int i = 0; i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
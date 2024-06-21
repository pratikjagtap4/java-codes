class Example9
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Pratik");
		StringBuffer sb2 = new StringBuffer("Jagtap");
		StringBuffer sb3 = new StringBuffer("Pratik");

		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb3.equals(sb1));
	}
}
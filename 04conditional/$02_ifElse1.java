class $02_ifElse1
{
	public static void main(String[] args)
	{
		int age = 11;

		if(age>18)
		{
			System.out.println("congratulations you are eligible for voting");
		}
		else{
			System.out.println("sorry! you cane vote after : " + (18 -age) + "years");
		}
	}

}
class $05_ifElse4
{
	public static void main(String[] args)
	{
		int age = 22;
		char gender = 'f';

		if((age>=21 && gender == 'm') || (age >= 18 && gender == 'f'))
		{
			System.out.println("you are eligble for marriage");
		} else {
			System.out.println("you are not eligible for marrige");
		}
	}
}
class $08_nestedIf
{
	public static void main(String[] args)
	{
		int age = 21;
		char gender ='f';

		if(age>=21)
		{
			if(gender == 'f' )
			{
				System.out.println("look for a grroom");
			}
			else if(gender == 'm')
			{
				System.out.println("llok for a bride");
			}
			else {
				System.out.println("control ....");
			}
		}
		else {
			System.out.println("You are not eligibke for marriage");
		}
	}
}
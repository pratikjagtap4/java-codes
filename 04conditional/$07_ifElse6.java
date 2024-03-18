class $07_ifElse6
{
	public static void main(String[] args)
	{
		char signal = 'y';

		if(signal == 'r')
		{
			System.out.println("Stop");
		}
		else if(signal =='g')
		{
			System.out.println("go");
		}
		else if(signal == 'y')
		{
			System.out.println("go slow");
		}
		else
		{
			System.out.println("Signal is not propperly working");
		}
	}
}
class $05_identifier1
{
	public static void main(String [] args)
	{
		int a = 10;
		System.out.println(a);

		int $ = 20;
		System.out.println($);

		int _ = 30;   // throws warning as not supported after java8
		// System.out.println(_);

		//int 1 = 40 ;  error as name of identifier cant start with number    
		//System.out.println(1);

		int a1 = 50;
		System.out.println(a1);

		int $2 = 60;
		System.out.println($2);

		int _2 = 70;
		System.out.println(_2);

		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 80;  // though there is no limit on length of identifier it recommended to have length between 10 to 15
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa) ;

		//int byte = 90;  name of identifier can bnot be same as a reserved keyword
		//System.out.println(byte);

		int cyber = 100; //java is case sensitive so it spelling can be same but case can be different
		System.out.println(cyber);

		int CYBer = 110;
		System.out.println(CYBer);

		int CYBER = 120;
		System.out.println(CYBER);

		int main = 130; // name of identifier can be similar to mai nmethod or class name 
		System.out.println(main);

		int $05_identifier1 = 140;
		System.out.println($05_identifier1);
	}


}
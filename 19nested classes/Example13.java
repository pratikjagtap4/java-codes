class Organisation
{
	void leaves()
	{
		class Insuarance
		{
			int ins_id = 1001;
			int ins_cap = 500000;
		}
		Insuarance i = new Insuarance();
		System.out.println(i.ins_id + " " + i.ins_cap);
		
	}
}
class Example13
{
	public static void main(String[] args)
	{
		Organisation o = new Organisation();
		o.leaves();
		
	}
}
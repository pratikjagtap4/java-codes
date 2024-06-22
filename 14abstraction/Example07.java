abstract class HDFC
{
    abstract void banking();
    abstract void insuarance();
    abstract void finance();
}

abstract class HdfcBanking extends HDFC{
    void banking()
    {
        System.out.println("Banking Requirements");
    }
}

abstract class Insuarance extends HdfcBanking
{
    void insuarance()
    {
        System.out.println("Insuarance requirements");
    }
} 

class Finance extends Insuarance
{
    void finance()
    {
        System.out.println("Finance requirements");
    }
}

public class Example07 {
    public static void main(String[] args)
    {
        Finance cust1 =  new Finance();
        cust1.banking();
        cust1.insuarance();
        cust1.finance();
    }
}

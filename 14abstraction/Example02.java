abstract class MobileBanking
{
    abstract void transfer();
}

class HdfcServer extends MobileBanking
{
    void transfer()
    {
        System.out.println("transfer money successful");
    }
}

public class Example02 {
   public static void main(String[] args)
   {
        HdfcServer cust = new HdfcServer();
        cust.transfer();
   } 
}

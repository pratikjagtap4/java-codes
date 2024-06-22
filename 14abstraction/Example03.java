abstract class MobileBanking{
    abstract void transfer();

}

class HdfcServer extends MobileBanking{
    void m1()
    {
        System.out.println("m1 method");
    }
}

public class Example03 {
    public static void main(String[] args)
    {
        HdfcServer cust = new HdfcServer();
        cust.m1();
    }    
}

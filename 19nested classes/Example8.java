class Outer
{
    int a = 10;
    float b = 20.5f;

    void m1()
    {
        Inner i =  new Inner();
        System.out.println(i.x + i.y);
    }
    class Inner
    {
        private int x =10;
        private float y= 20.5f;
    }
}
public class  Example8
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.m1();
        
    }
}
abstract class Demo
{
    abstract void m1();

    void m2()
    {
        System.out.println("inside m2");
    }

    void m3()
    {
        System.out.println("inside m3");
    }
}

public class Example06 extends Demo {
    void m1() {
        System.out.println("inside m1 overridden");
    }
    public static void main(String[] args)
    {
        Example06 e = new Example06();
        e.m1();
        e.m2();
        e.m3();

        Demo d =  new Example06();
        d.m1();
        d.m2();
        d.m3();
    }
    
}

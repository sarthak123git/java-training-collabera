package polymorphism;


    class AB extends Object
    {    public void m()
    {    System.out.println("m()");
    }
    }
    class B extends AB
    {    public void m(int x)
    {    System.out.println("m(int x)");
    }
        public void m(String y)
        {    System.out.println("m(String y)");
        }
    }
    public class Poly01
    {    public static void main(String[ ] args)
    {    B var = new B();
        var.m();
        var.m(3);
        var.m("String");
    }
    }


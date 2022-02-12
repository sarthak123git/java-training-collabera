package com.company;


    class static1
    {    static int c=0;
        void increment()
        {    c++;
        }
        void display()
        {    System.out.println("Value="+c);
        }
    }
    class staticClass
    {    public static void main(String args[ ])
    {    static1 s=new static1();
        static1 s1=new static1();
        static1 s2=new static1();
        s.increment();
        s1.increment();
        s2.increment();
        s.display();
        s1.display();
        s2.display();
    }

}

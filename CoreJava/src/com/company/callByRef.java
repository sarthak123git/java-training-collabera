package com.company;

          class Test1{
        int a, b;

        Test1(int i, int j) {
            a = i;
            b = j;
        }

        void meth(Test1 of) {
            of.a = a * 2;
            of.b = b / 2;
        }
    }
    
   public class callByRef
    {    public static void main(String args [ ])
    {    Test1 t=new Test1(4,5);
        System.out.println("Before calling a="+t.a+"b="+t.b);
        t.meth(t);
        System.out.println("After calling a="+t.a+"b="+t.b);
    }
    }


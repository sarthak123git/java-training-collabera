package com.company;

    class objcnt
    {
        static int count;
        public objcnt()
        {    count++;
        }
        static void display()
        {    System.out.println("Count of Objects:"+count);
        }
    };
    public class objectCount
    {    public static void main(String args[ ])
    {    objcnt o1,o2,o3;
        o1 = new objcnt();
        o2 = new objcnt();
        o3 = new objcnt();
        objcnt.display();
    }
    }


package com.company;


    class program
    {    public static void main(String args[ ])
    {    int sum=0;
        int n[]=new int[5];
        for(int i=0;i<5;i++)
        {    n[i]=Integer.parseInt(args[i]);
            sum=sum+n[i];
        }
        System.out.println("Total="+sum);
    }
    }


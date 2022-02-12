package com.company;

      import java. util.*;
    class binarySearch
    {    Scanner s=new Scanner(System.in);
        int ele,test,i,n,high,low,mid;   int a[ ];
        public binarySearch()
        {    System.out.println("Enter the value of n:");
            n=s.nextInt();       a=new int[n];
        }
        public void read()
        {    System.out.println("enter elements into  array:");
            for(i=0;i<a.length;i++)   a[i]=s.nextInt();
            System.out.println("enter element tobe searched is:");   ele=s.nextInt();
        }
        public void search()
        {    low=0;  high=n-1;
            while(low<high)
            {    mid=(low+high)/2;
                if(ele<a[mid])
                    high=mid-1;
                else if(ele>a[mid])
                    low=mid+1;
                else
                {
                    System.out.println("Found at position is:"+mid);   test=1;break;
                }
            }
            if(test!=1)
                System.out.println("Element is not found:");
        }
    }
    class bsrch
    {     public static void main(String args[])
    {    binarySearch g=new binarySearch();  g.read();  g.search();
    }
    }


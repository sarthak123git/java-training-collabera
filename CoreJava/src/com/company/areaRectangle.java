package com.company;


    class TwoClasses
    {    float length, breadth;
        void getdata(float a, float b)
        {    length = a;
            breadth = b;
        }
    }
    class areaRectangle
    {    public static void main(String args[ ])
    {    float area;
        TwoClasses Rectangle = new TwoClasses();
        Rectangle.getdata(5,5);
        area = Rectangle.length * Rectangle.breadth;
        System.out.println("Area : "+area);
    }
    }


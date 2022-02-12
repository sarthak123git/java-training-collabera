package com.company;


class Check1
{    private int amount=0;
    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int amount1)
    {    amount=amount1;
    }
}
public class MainclassEncaps
{    public static void main(String[ ] args)
{    int amount1=0;
    Check obj=new Check();
    obj.setAmount(200);
    amount1=obj.getAmount();
    System.out.println("Your current amount is :"+amount1);
}
}


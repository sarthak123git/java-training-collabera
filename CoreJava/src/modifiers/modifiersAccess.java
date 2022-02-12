package modifiers;

 class demo
{
    int x;    //default : whose accessibility is through out the package
    private int y;    //as y is private it can not be seen out side the class
    public int z;    //whose visibility will be through out the program
    protected int p;    //whose visibility is to the derived classes of other packages
}
    public class modifiersAccess
    {
        public static void main(String args[ ])
        {
            demo d= new demo(); // constructor
            d. x=10;
           // d.y=20;
            d.z=100;
            d.p=150;
            System.out.println("  "+d.x+"    "+d.z+"   "+d.p);
        }
    }


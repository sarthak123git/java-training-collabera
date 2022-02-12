package polymorphismOverriding;

public class MainOverriding {
    public static void main(String[] args) {
         P obj= new P();//obj of P class
         obj.num(5);
         P obj1=new Q();// obj of Q class
         obj1.num(6);
    }
}

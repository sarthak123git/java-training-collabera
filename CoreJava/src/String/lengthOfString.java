package String;
import java.util.*;
public class lengthOfString
    {
        public static void main(String [ ] args)
        {
            String s = new String();
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter a string");
                    s = scn.nextLine();
            System.out.println("  "+s);
            System.out.println("length:"+s.length());
        }
    }


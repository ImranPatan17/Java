
import java.util.*;
public class Answer {
        static String typ;
        static Scanner sc= new Scanner(System.in);
    public static int Types(String typ) {
      
        // Write your code here
          if(typ.equals("Integer") || typ.equals("Float"))

          return(Integer.SIZE/8);

          if(typ.equals("Long") || typ.equals("Double"))
          return(Double.SIZE/8);

          if(typ.equals("Character")) 

          return (Character.SIZE/8);

        return 0;
    }
    public static void main(String[] args) {
     typ=sc.next();
      Types(typ);
    }
}
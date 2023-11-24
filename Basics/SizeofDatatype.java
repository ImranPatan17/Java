//prints the size of bytes of a datatype
import java.util.*;
public class SizeofDatatype {
    static Scanner sc = new Scanner(System.in);
        public static int dataTypes(String type) { 
                type = sc.next();
                if(type.equals("Integer"))
                return (Integer.SIZE / 8);
                else if(type.equals("Long"))
                return (Long.SIZE / 8);
                else if(type.equals("Float"))
                return (Float.SIZE / 8);
                else if(type.equals("Double"))
                return (Double.SIZE / 8);
                else if(type.equals("Character"))
                return (Character.SIZE / 8);
                return 0;
            }
    public static void main(String[] args) {
    
        int size= dataTypes(null);
        System.out.println("The size of datatype is "+size+" "+"bytes");
         sc.close();
    }
    
}



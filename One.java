import java.util.*;
class One{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n =sc.next();
        if(n.compareTo("a") >=0 && n.compareTo("z") <=0)
        System.out.println(0);
        if(n.compareTo("A") >=0 && n.compareTo("Z")<=0)
        System.out.println(1);
      sc.close();
    }
}
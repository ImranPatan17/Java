//if the case is 1 prints the area of the circle
//if the case is 2 prints the area of the rectangle
import java.util.*;
public class Switchcase {
    static Scanner sc = new Scanner(System.in);
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch){
            case 1: return (double)(a[0]*a[0]);
            
            case 2: return (double)(a[0]*a[1]);
            
        }
        return 0;
    }
    public static void main(String[] args) {
        double val =areaSwitchCase(0, null);
        System.out.println(val);
    }
}

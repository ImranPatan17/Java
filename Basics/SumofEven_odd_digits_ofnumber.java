//prints the even & odd digits sum of a given number(Integer)
import java.util.*;
public class SumofEven_odd_digits_ofnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();int m, evenSum=0,oddSum=0;
        while(n>0){
         m=n%10;
         if(m%2==0)
         evenSum+=m;
        
         else
         oddSum+=m;
       
         n=n/10;
        }
         System.out.println("EvenSum="+evenSum);
           System.out.println("OddSum="+oddSum);
           s.close();
    }
}

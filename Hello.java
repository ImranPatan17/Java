import java.util.*;

class Hello{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        int count = 0;

        while (count < n) {
            int evenNumber = 2 * i;
            if (evenNumber % 3 == 0) {
                System.out.print(evenNumber + " ");
                count++;
            }
            i++;
        }
        sc.close();
    }
}

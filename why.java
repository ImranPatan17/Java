import java.util.*;
class why{
    public static void main(String[] args) {
        System.out.println("Enter no\n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int j = 0;
        
        while((j>0 && j<n)&& ((j/2)==0))
        {
            System.out.println(j);
            j++;
        }
        sc.close();
    }
}
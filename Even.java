import java.util.*;
public class Even{
    public static void main(String[] args) {
        int n ; // Change this value to print a different number of even numbers
Scanner sc = new Scanner(System.in);
System.out.println("Enter n:");
n=sc.nextInt();
int count=1;
int sum=0,num=0;
//System.out.println("The even nos are:");
while(count<=n){
num+=2;
//System.out.print(num+"\t");
count++;
if(num%3 == 0)
sum+=num;
}

System.out.println("\nThe sum is :"+sum);
 

        sc.close();
        
    }
}
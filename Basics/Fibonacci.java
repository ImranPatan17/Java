//prints the nth fibonacci number
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=0;int b=1;
		int n=s.nextInt();
		for(int i=0;i<n;i++){
				a=a+b;
				b=a-b;
		}
		System.out.println(a);
        s.close();
	}

}
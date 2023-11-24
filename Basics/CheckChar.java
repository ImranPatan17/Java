//checks the entered character if it is an alphabet
// (uppercase) prints 1
//lowercase prints 0
//not an alphabet prints -1

import java.util.*;
public class CheckChar {
    
    public static void main(String[] args) {
        // Write your code here
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z'){
    System.out.println("1");
}
else if(ch>='a' && ch<='z'){
    System.out.println("0");
}
else
System.out.println("-1");
sc.close();
    }
}
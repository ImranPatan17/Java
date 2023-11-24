// compares 2 numbers and prints the condition applicable bwn them
public class Conditionsbwn2num {
    
static int x,y;
public static String compareIfElse(int a, int b) {
    // Write your code here
x=a;y=b;

if(x<y)
return ("smaller");
else if(x>y)
return ("greater");
else
return ("equal");

}
public static void main(String[] args) {
    String s = compareIfElse(5, 6);
    System.out.println("The value of "+x+" "+"is"+" "+s+" "+"compared to "+y);
}
}

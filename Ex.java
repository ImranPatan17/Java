
import java.util.Scanner;
public class Ex{
    public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = in.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=in.nextInt();
        }
       
//Initialize maximum element as first element of the array.  
int max=arr[0];
int sum=0;
mark_avg=0;
   //Traverse array elements to get the current max.
for(i=0;i<arr.length;i++)
{
  if(arr[i]<arr[0])
    max=arr[0];
  else max=arr[i];
 
}
   //Store the highest mark in the variable result.
  result=max;
  System.out.println(result);

for(i=0;i<arr.length;i++)
  sum+=arr[i];
 mark_avg=sum/s;
   //Store average mark in avgMarks.
  double avgMarks=0;
avgMarks=mark_avg;
System.out.print(avgMarks);
 

     in.close();

    }
}
public class N{
   public static boolean Composite(int x) {
        // Function to check if a number x is not prime (composite).
        if (x < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return true;
            }
        }
        return false;
    }
           
    public static void main(String[] args) {
      
        
     int   i = 0, j = 0, k = 0;
     int m,last =10,first=1;
for (m = last; m >= first; m = m - 1){
  k = k + m;
  if (Composite(m)){
    i = i + m;
  }else{
    j = j - m;
  }
}

if (k==(i-j)) {
  System.out.println("True");
}else{
 System.out.println("False");
}
    }
}
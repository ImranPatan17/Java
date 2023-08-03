public class N{
    public static void main(String[] args) {
       final void Composite(int x){
        
            
        }
            
        
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

if (k==(j-i)) {
  System.out.println("True");
}else{
 System.out.println("False");
}
    }
}
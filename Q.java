// This is the main class Question
public class Q{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		  Q q = new Q();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Q q){
		System.out.print("Well Done!");
	}
    // Define a method named 'studentMethod()' in class Question
void studentMethod(){
    Q a = this;
print(a);
}
}
// Call the method named 'print()' in class Question

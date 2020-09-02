package chapter3;

// Demonstrate dynamic initialization

public class DynInit {
    public static void main(String[] args) {
        double a = 4.0, b = 3.0;
        double c;
        
        c = a - b;  // 4 - 3 = 1, c = 1
        System.out.println("Sub: " + c);
        
        c = a + b;  // 4 + 3 = 7, c = 7
        System.out.println("Sum: " + c);
    }
}

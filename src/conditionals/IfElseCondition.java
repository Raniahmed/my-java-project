package conditionals;

public class IfElseCondition {

    public static void compare(int a, int b){
        if(a >  b){
            System.out.println(a + " is greater than " + b);
        }else {
            System.out.println(a + " is less than " + b);
        }
    }

    public static void main(String[] args) {
        compare(10, 5);
        compare(5, 10);

    }
}

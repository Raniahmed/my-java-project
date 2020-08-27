package conditionals;

public class SwitchStatement {

    public static void main(String[] args) {
        // i= 0, zero, i = 1, one i = 2 two... i = 5, five
        for (int i = 0; i <= 6; i++) { // i = -1, 0, 1, ,2 ,3

            switch (i){
                case 0:
                    System.out.println(i +"-->" + "zero"); //0-->zero
                    break;
                case 1:
                    System.out.println(i +"-->" + "one");
                    break;
                case 2:
                    System.out.println(i +"-->" + "two");
                    break;
                case 3:
                    System.out.println(i +"-->" + "three");
                    break;
                default:
                    System.out.println(i + " is greater than three");
            }
        }
    }
}

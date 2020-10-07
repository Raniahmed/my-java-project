package chapter7;

//Demonstrate method overloading
public class OverloadDemo {

    // constructor
    public OverloadDemo(){
        System.out.println("inside constructor");
    }

    public OverloadDemo(int i){
        System.out.println("i: " + i);
    }

    void test(){
        System.out.println("No Parameters");
    }
 // Overload test for one integer parameter
    void test (int a) {
        System.out.println("a : " + a);
    }

  // Overload test for two integer parameter
  void test (int a,int b){
      System.out.println("a and b : " + a + " " + b);
  }
  //Overload test for a double parameter

  double test(double a){
        System.out.println("double a :" + a);
        return a * a;
    }

}

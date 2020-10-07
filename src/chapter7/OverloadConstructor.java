package chapter7;
// Here OverloadConstruction alloows one object to another
class OverloadConstructor {
    // instance variables
    double width;
    double height;
    double depth;

    // no parameter constructor
    OverloadConstructor(OverloadConstructor olc){
        width = olc.width;   // Pass Object to constructor
        height = olc.height;
        depth = olc.depth;
    }
    // Constructor used when all dimensions specified
    OverloadConstructor(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    // Constructor used when no dimensions specified
    OverloadConstructor(){
        width = -1;
        height =-1;
        depth = -1;
    }



}

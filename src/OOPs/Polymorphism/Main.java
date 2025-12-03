package OOPs.Polymorphism;



public class Main {
//    Polymorphism - means ways to represent
//    It occurs in Inheritance

//    Types of polymorphism
//    1. Compile time or static polymorphism - Achieved by method overloading
//    Method overloading - same name but different type argument and return types, order can be different. Ex-Constructor
//    2. Runtime/Dynamic polymorphism- Achieved by method overriding;
    static void main() {
        Shapes shape = new Shapes();
       Circle circle = new Circle();
      //  Square square = new Square();
        circle.area(2);
        shape.area(2);
        System.out.println(shape);

        //Shapes obj = new Circle();
//        here above type of reference variable is Shapes class but the type of object is child class
 //       So the question is which method will call, the answer is depend on that the reference variable  is refering to
//          and here Shapes refernce variable(Shapes) is pointing to child class object(Child) -> This is known as Upcasting
//      And this Entire thing is known as Method overriding

//        this is known by java  -> Dynamic method dispatch
      //  shape.area();
        //obj.area();
      //  square.area();

    }


}

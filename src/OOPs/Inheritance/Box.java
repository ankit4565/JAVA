package OOPs.Inheritance;

public class Box {
//      the property of inheriting the property of parent class in child class is called as Inheritance.
//    It Means all the data member of parent class, child class can also use them
//    child class haves the property of parent class but it also have their own property.
//    extends keyword is use to inherit the property of parent class.

    double length;
    double height;
    double width;
// default Constructor
    Box(){
        this.length= -1;
        this.height = -1;
        this.width = -1;
    }

    Box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }
//    Parameterized Constructor
    Box(double height, double length, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

//    Copy Constructor
    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }
    public void information(){
        System.out.println("Running the Box");
    }



//    Type of Inheritance
//   1.  Single Inheritance- One class extends another class
//   2. Multilevel Inheritance - A child class of any parent class can also have its own child class
//   3. Multiple Inheritance- when one class is extending more than one class   // JAVA does not support this due confusion of choosing a class between two parent class for its child class
//   4. Hierarchical Inheritance- one class is inherited by many class.
//   5. Hybrid Inheritance- Combination of single and multiple Inheritance //but this is not allowed in java
}

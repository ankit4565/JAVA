package OOPs.Polymorphism;

public class Circle extends Shapes{

//     this will run when obj of Circle is created
//     hence it is overriding the parent method
    // this is called annotation
    @Override
    void area(int a){
        System.out.println("Area is pie * r * r");
    }
}

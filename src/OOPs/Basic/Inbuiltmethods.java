package OOPs.Basic;


import OOPs.Basic.oop.Student;


public class Inbuiltmethods {
    void main() {
       Student  ankit = new Student(12,"ak",98);

        // Student pkit = new Student(12,"ak",98);

       // Student parag = new Student(13,"pc",99);
         ankit.printInfo();
        System.out.println(ankit.population);

       greeting();
    }
 static void greeting(){
     System.out.println("Hello");
 }

}

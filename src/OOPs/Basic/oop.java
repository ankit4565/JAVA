package OOPs.Basic;

public class oop {
   void main() {

    //    Student student = new Student("Ankit");
//         Student students = new Student(12,"ak", 98);
//
//       // System.out.println(student.rno);
//        students.printInfo();
       Student std = new Student(12,"parag",100);
       Student std2 = new Student(13,"parag",110);
       Student std3 = new Student(14,"parag",120);
      // Student std1 = new Student(std);

       std3.printInfo();
    }

 public static class Student{
      int rno;
        String name ;
        float marks;

     static int population;
//        Student( ){
//            System.out.println("Default constructor is called");
//        }

     //        Student( int marks, String name){
//
//             this.marks = marks;
//             this.name = name;
//        }
        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
    public Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        this.population +=1;

    }



   public void printInfo(){
          // System.out.println(rno+ " " + name  +  " "+ marks);
         System.out.println(population);
       }
    }
    public static void printx(){
        System.out.println("Hello world from oop package");
    }

}

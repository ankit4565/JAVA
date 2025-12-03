package Basics;

import java.io.*;

class Geeks {

    // static method
    public class Hello {
        public static void greet(){

            System.out.println("Hello Geek!");
        }
    }

    public static void main (String[] args) {

        // calling the method directily
        Hello.greet();
        Suyash.main();
        // using the class name
        // Geeks.greet();
    }
}

class Suyash{
    public static void main(String[] args) {
        System.out.println("heelo");
    }
    static void main(){
        System.out.println("Heeloo");
    }

    // Java program to demonstrate the use of instance method

    class Test {
        String n = "";

        // Instance method
        public void test(String n) {
//            Test(){
//                this.n = n;
//            }

        }
    }

}

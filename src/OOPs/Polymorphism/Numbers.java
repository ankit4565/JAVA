package OOPs.Polymorphism;

public class Numbers {
//    Method Overloading
    double sum(double a, double b) {
       return  a+b;

    }

    int  sum(int a, int b, int c){
        return a+b+c;
    }

    static void main() {
        Numbers obj = new Numbers();
        obj.sum(2,4);
        obj.sum(2,5,4);
    }
}

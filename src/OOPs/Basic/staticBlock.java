package OOPs.Basic;

public class staticBlock {
    static int a = 4;
    static int b;
     int c =1;

    static{
        System.out.println("I am in static block");
        b = a*5;

    }


    static void main() {
        staticBlock obj = new staticBlock();
        System.out.println(obj.a);
        System.out.println(obj.c);
         obj.c+=2;
         obj.a+=4;
        System.out.println(obj.c +" "+ obj.a);
        staticBlock obj1 = new staticBlock();
        System.out.println(obj1.c+" "+obj1.a);




    }
}

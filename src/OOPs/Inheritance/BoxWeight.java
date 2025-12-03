package OOPs.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        this.weight = other.weight;
    }

    public BoxWeight(double h, double l, double w, double weight) {
       super(h, l, w);  //Call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }

    static void main() {
        BoxWeight obj = new BoxWeight(5,2,5,50);
        System.out.println(obj.height+" "+obj.length+" "+ obj.width+" "+ obj.weight);
    }
}

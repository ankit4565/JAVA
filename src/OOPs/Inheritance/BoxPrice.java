package OOPs.Inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

//    Constructor
    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }
  public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l,h,w,weight);
        this.cost = cost;
  }


}

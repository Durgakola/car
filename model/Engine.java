package model;

public class Engine {
 private int horsepower;
 private double displacement;

 public Engine(int horsepower,double displacement){
     this.horsepower=horsepower;
     this.displacement=displacement;
 }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", displacement=" + displacement +
                '}';
    }
}

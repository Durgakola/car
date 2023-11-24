package model;

public class Ac {
   private double capacity;
    private String Company;

    public Ac(double capacity,String Company){
        this.capacity=capacity;
        this.Company=Company;
    }

    @Override
    public String toString() {
        return "Ac{" +
                "capacity=" + capacity +
                ", Company='" + Company + '\'' +
                '}';
    }
}

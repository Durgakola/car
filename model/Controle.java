package model;

public class Controle {
    private String brakeType;
    private int gares;

    public Controle(String brakeType,int gares){
        this.brakeType=brakeType;
        this.gares=gares;
    }
    @Override
    public String toString() {
        return "Controle{" +
                "brakeType='" + brakeType + '\'' +
                ", gares=" + gares +
                '}';
    }
}

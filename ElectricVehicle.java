import model.Ac;
import model.Controle;
import model.Engine;

public class ElectricVehicle extends CarTemplate{
    private Engine engine;
    private Ac ac;
    private Controle controle;

    public ElectricVehicle(Engine engine, Ac ac,Controle controle){
        this.engine=engine;
        this.ac=ac;
        this.controle=controle;
    }
    public ElectricVehicle(){

    }
    @Override
    public void WheelType(){
        System.out.println("Pressed Steel Disc Wheel");

    }

    @Override
    public void Color(){
        System.out.println("Red Color");
    }

}

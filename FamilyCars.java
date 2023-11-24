import model.Ac;
import model.Controle;
import model.Engine;

public class FamilyCars extends  CarTemplate {
    private Engine engine;
    private Ac ac;
    private Controle controle;

    public FamilyCars(Engine engine, Ac ac, Controle controle){
        this.engine=engine;
        this.ac=ac;
        this.controle=controle;
    }
    public FamilyCars(){

    }
    @Override
    public void WheelType(){
        System.out.println("Drum Type");
    }
    @Override
    public void Color(){
        System.out.println("Black Color");
    }
}

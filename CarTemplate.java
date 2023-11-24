import model.Ac;
import model.Controle;
import model.Engine;

public abstract class CarTemplate {

    abstract void WheelType();

    abstract void Color();

    String engine;
    String ac;
    String controle;

    public final void getCar() {
        getEngine();
        getAc();
        getControle();
        WheelType();
        Color();
        System.out.println("Car Delivered to Client");
    }

    public Engine getEngine() {
        return new Engine(220, 12.45);
    }

    public Ac getAc() {
        return new Ac(1.5, "LG");
    }

    public Controle getControle() {
        return new Controle("disc brakes", 5);
    }
}

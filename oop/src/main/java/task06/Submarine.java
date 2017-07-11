package task06;

/**
 * Created by Александр on 11/07/2017.
 */
public class Submarine {

    private int fuel = 10;

    public void setFuel(int fuel) {
        this.fuel = (fuel > 0) ? fuel : 0;
    }

    String goCruise(){
        SubmarineEngine engine = new SubmarineEngine();
        return engine.run() ? "The submarine went to cruise" : "Not enough fuel";
    }

    class SubmarineEngine{
        boolean run(){
            return (fuel > 0);
        }

    }
}

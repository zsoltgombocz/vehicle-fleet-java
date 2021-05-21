package vehicle.fleet.java.vehicles;
import vehicle.fleet.java.Vehicle;

/**
 * Bicikli osztály ami a jármű szülőosztályából származik.
 * @author zsolti-pc
 */
public class Bike extends Vehicle{
    /**
     * Létrehoz egy típustalan járművet a legalapvetőbb paraméterekkel.
     * @param c_price ár
     * @param c_color szín
     * @param c_weight súly
     * @throws IllegalArgumentException Nem megfelelő paraméterek esetán kiváltandó kivétel.
     */
    public Bike(int c_price, int c_color, float c_weight) throws IllegalArgumentException{
        
        super(c_price, c_color, c_weight, 1);
    }
    /**
     * Visszaadja a jármű maximális sebességét. Bicikli esetén nem eldönthető, így -1 érték esetén nem lesz kiértékelve.
     * @return -1.
     */
    @Override
    public int getmaxSpeed(){
        return -1;
    }
}

package vehicle.fleet.java.vehicles;
import vehicle.fleet.java.Vehicle;

/**
 * Busz osztály ami a jármű szülőosztályából származik.
 * @author zsolti-pc
 */
public class Bus extends Vehicle{
    private int maxSpeed;
    private int kmTraveled;
    private float consumption;
    private float maxWeight;
    /**
     * Konstruktor
     * @param c_price ár
     * @param c_color szín
     * @param c_weight súly
     * @param c_maxPassengers szállítható személyek száma
     * @param c_maxSpeed max sebesség
     * @param c_kmTraveled megtett km
     * @param c_consumption fogyasztás
     * @param c_maxWeight szállítható súly
     * @throws IllegalArgumentException Nem megfelelő intervallumba megadott paraméter esetén kiváltja.
     */
    public Bus(int c_price, int c_color, float c_weight, int c_maxPassengers, 
            int c_maxSpeed, int c_kmTraveled, float c_consumption, float c_maxWeight) throws IllegalArgumentException{
        
        super(c_price, c_color, c_weight, c_maxPassengers);
        
        
        if(c_maxSpeed <= 0 || c_maxSpeed > 150) throw new IllegalArgumentException("Max speed must be between 0 and 150!");
        if(c_kmTraveled < 0) throw new IllegalArgumentException("KM traveled must not be negative!");
        if(c_consumption <= 0 || c_consumption > 25) throw new IllegalArgumentException("Consumption must be between 0 and 25!");
        if(c_maxWeight <= 0 || c_maxWeight > 500) throw new IllegalArgumentException("Max carry weight must be between 0 and 500!");
        
        this.maxSpeed = c_maxSpeed;
        this.kmTraveled = c_kmTraveled;
        this.consumption = c_consumption;
        this.maxWeight = c_maxWeight;
    }
    /**
     * Visszaadja a jármű maximális sebességét változó alapján.
     * @return maxSpeed változó.
     */
    @Override
    public int getmaxSpeed(){
        return maxSpeed;
    }
    /**
     * toString() metódus kibővítése a szülőosztályból.
     * @return Egy String ami tárolja a változókat szöveghez fűzve.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nMax speed: " + this.maxSpeed + "km/h");
        sb.append(" | Km traveled: " + this.kmTraveled + "km");
        sb.append(" | Consumption: " + this.consumption + "l/100km");
        sb.append(" | Carry capacity: " + this.maxWeight + " kg\n");
        
        return sb.toString();
    }
}

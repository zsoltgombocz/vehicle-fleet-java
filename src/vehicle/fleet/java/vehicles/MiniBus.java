package vehicle.fleet.java.vehicles;
import vehicle.fleet.java.Vehicle;

/**
 * Minibusz osztály ami a jármű szülőosztályából származik.
 * @author zsolti-pc
 */
public class MiniBus extends Vehicle{
    private int maxSpeed;
    private int kmTraveled;
    private float consumption;
    private float maxWeight;
    
    public MiniBus(int c_price, int c_color, float c_weight, int c_maxPassengers, 
            int c_maxSpeed, int c_kmTraveled, float c_consumption, float c_maxWeight) throws IllegalArgumentException{
        
        super(c_price, c_color, c_weight, c_maxPassengers);
        
        
        if(c_maxSpeed <= 0 || c_maxSpeed > 160) throw new IllegalArgumentException("Max speed must be between 0 and 160!");
        if(c_kmTraveled < 0) throw new IllegalArgumentException("KM traveled must not be negative!");
        if(c_consumption <= 0 || c_consumption > 15) throw new IllegalArgumentException("Consumption must be between 0 and 15!");
        if(c_maxWeight <= 0 || c_maxWeight > 300) throw new IllegalArgumentException("Max carry weight must be between 0 and 300!");
        
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

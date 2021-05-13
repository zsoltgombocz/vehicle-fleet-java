package vehicle.fleet.java.vehicles;
import vehicle.fleet.java.Vehicle;


public class Car extends Vehicle{
    private int maxSpeed;
    private int kmTraveled;
    private float consumption;
    private float maxWeight;
    
    public Car(int c_price, int c_color, float c_weight, int c_maxPassengers, 
            int c_maxSpeed, int c_kmTraveled, float c_consumption, float c_maxWeight) throws IllegalArgumentException{
        
        super(c_price, c_color, c_weight, c_maxPassengers);
        
        
        if(c_maxSpeed <= 0 || c_maxSpeed > 200) throw new IllegalArgumentException("Max speed must be between 0 and 200!");
        if(c_kmTraveled < 0) throw new IllegalArgumentException("KM traveled must not be negative!");
        if(c_consumption <= 0 || c_consumption > 15) throw new IllegalArgumentException("Consumption must be between 0 and 15!");
        if(c_maxWeight <= 0 || c_maxWeight > 200) throw new IllegalArgumentException("Max carry weight must be between!");
        
        this.maxSpeed = c_maxSpeed;
        this.kmTraveled = c_kmTraveled;
        this.consumption = c_consumption;
        this.maxWeight = c_maxWeight;
    }
    
    @Override
    public int getmaxSpeed(){
        return maxSpeed;
    }
    
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

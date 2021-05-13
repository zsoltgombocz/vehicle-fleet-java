package vehicle.fleet.java.vehicles;
import vehicle.fleet.java.Vehicle;


public class Bike extends Vehicle{
    public Bike(int c_price, int c_color, float c_weight) throws IllegalArgumentException{
        
        super(c_price, c_color, c_weight, 1);
    }
    
    @Override
    public int getmaxSpeed(){
        return -1;
    }
}

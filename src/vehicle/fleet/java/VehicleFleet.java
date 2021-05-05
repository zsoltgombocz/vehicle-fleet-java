
package vehicle.fleet.java;

import java.util.ArrayList;

public class VehicleFleet {
    public void VehicleFleet(){}
    
    static public void add(Vehicle veh){
        _vehicles.add(veh);
    }
    
    static public void delete(int id){
        if(VehicleFleet.amount() <= 1){
            _vehicles.removeAll(_vehicles);
        }else{
            _vehicles.set(id, null);
        }
        
        return;
    }
    
    static public Vehicle getVehicle(int id){
        if(VehicleFleet.amount() == 0) throw new IndexOutOfBoundsException("Empty arraylist!");
        return _vehicles.get(id);
    }
    
    static public int amount(){
        return _vehicles.size();
    }
    
    static final private VehicleFleet INSTANCE = new VehicleFleet();
    static public VehicleFleet getInstance() { return INSTANCE; }
    
    static private ArrayList<Vehicle> _vehicles = new ArrayList<Vehicle>();
}

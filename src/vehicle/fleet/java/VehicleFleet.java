
package vehicle.fleet.java;

import java.util.ArrayList;
/**
 * Jármű flotta osztálya, itt tárolódnak a járművek.
 */
public class VehicleFleet {
    /**
     * Üres konstruktor
     */
    private void VehicleFleet(){}
    
    /**
     * Arraylisthez adás függvénnyel.
     * @param veh Szülő osztály típusú objektum
     */
    public void add(Vehicle veh){
        _vehicles.add(veh);
    }
    /**
     * Kivétel ay arrazlistből.
     * @param id Jármű id-je.
    */
    public void delete(int id){
        if(VehicleFleet.amount() <= 1){
            _vehicles.removeAll(_vehicles);
        }else{
            _vehicles.set(id, null);
        }
        
        return;
    }
    /**
     * Visszaad egy járművet id alapján
     * @param id Jármű id-je.
     * @return Jármű objektum
     */
    static public Vehicle getVehicle(int id){
        if(VehicleFleet.amount() == 0) throw new IndexOutOfBoundsException("Empty arraylist!");
        return _vehicles.get(id);
    }
    /**
     * A tárolt járművek számát adja a vissza.
     * @return Arraylist mérete
     */
    static public int amount(){
        return _vehicles.size();
    }
    /**
     * A feladat megoldását számolja ki.
     * @return A feladat megoldása szerint a szállítható emberek számát.
     * @throws Exception Üres arraylist esetén. 
     */
    public int calculate() throws Exception{
        int transportable_pass = 0;
        if(_vehicles.size() < 0) throw new Exception("No vehicle in the fleet!");
        
        for(int i = 0; i < _vehicles.size(); i++){
            int speed = getInstance().getVehicle(i).getmaxSpeed();
            int pass = getInstance().getVehicle(i).getPassengersAmount();
            if(speed != -1) {
                int rounds = 8*speed/10/2;
                transportable_pass =+ rounds*pass;
                
            }else System.out.println("Ignored vehicle:" + getInstance().getVehicle(i).toString());
        }
        
        return transportable_pass;
    }
    
    
    
    static final private VehicleFleet INSTANCE = new VehicleFleet();
    static public VehicleFleet getInstance() { return INSTANCE; }
    
    static private ArrayList<Vehicle> _vehicles = new ArrayList<Vehicle>();
}

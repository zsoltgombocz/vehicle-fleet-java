package vehicle.fleet.java;

abstract public class Vehicle{
    private int price;
    private int color;
    private float weight;
    private int maxPassengers;
    /*
    1	Black
    2	Red
    3	White
    4	Green
    5	Brown
    6	Blue
    7	Orange
    8	Yellow
    9	Purple
    10	Gray
    11	Pink
    12	Tan
    */
    public Vehicle(int c_price, int c_color, float c_weight, int c_maxPassengers) throws IllegalArgumentException{
        if(c_price <= 0) throw new IllegalArgumentException("Price must not be negative or zero!");
        if(c_color < 1 || c_color > 12) throw new IllegalArgumentException("Color must be between 1 and 12!");
        if(c_weight <= 0) throw new IllegalArgumentException("Weight must not be negative or zero!");
        if(c_maxPassengers <= 0) throw new IllegalArgumentException("Passengers amount must not be negative or zero!");
        
        this.price = c_price;
        this.color = c_color;
        this.weight = c_weight;
        this.maxPassengers = c_maxPassengers;
    }
    
    public String getColor(){
        switch(this.color){
            case 1:
                return "Black";
            case 2:
                return "Red";
            case 3:
                return "White";
            case 4:
                return "Green";
            case 5:
                return "Brown";
            case 6:
                return "Black";
            case 7:
                return "Orange";
            case 8:
                return "Yellow";
            case 9:
                return "Purple";
            case 10:
                return "Gray";
            case 11:
                return "Pink";
            case 12:
                return "Tan";
        }
        
        return "Black";
    }
    
    public int getPassengersAmount(){
        return this.maxPassengers;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Basic information: \n");
        sb.append("Color: " + this.getColor());
        sb.append(" | Weight: " + this.weight + "kg");
        sb.append(" | Max passengers (driver incl:): " + this.maxPassengers);
        sb.append(" | Price: " + this.price + " coin\n");
        int size = sb.length();
        for(int i = 0; i < size; i++){
            sb.append("-");
        }
        
        return sb.toString();
    }
    
    public String type(){
        return getClass().getSimpleName();
    }
}

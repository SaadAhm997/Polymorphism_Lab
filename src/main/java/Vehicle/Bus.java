package Vehicle;

public class Bus extends Vehicle{
    public Bus(String name, boolean travelsOnRoad, boolean forPublic, int numOfWheelsOrWings, int maxOccupancy){
        super(name, travelsOnRoad, forPublic, numOfWheelsOrWings, maxOccupancy);
        this.forPublic = true;
    }

}

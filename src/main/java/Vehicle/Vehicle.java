package Vehicle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Vehicle {

    protected String name;
    public boolean travelsOnRoad;
    boolean forPublic;
    int numOfWheelsOrWings;
    int maxOccupancy;

    public Vehicle(String name, boolean travelsOnRoad, boolean forPublic, int numOfWheelsOrWings, int maxOccupancy){
        this.name = name;
        this.travelsOnRoad = travelsOnRoad;
        this.forPublic = forPublic;
        this.numOfWheelsOrWings = numOfWheelsOrWings;
        this.maxOccupancy = maxOccupancy;
    }

    public static void main(String[] args) {

        List<String> manufacturer = new ArrayList<String>();

        Set<String> VehicleColour = new HashSet<String>();

        manufacturer.add("Ferrari");
        manufacturer.add("Volvo");
        manufacturer.add("Airbus");
        manufacturer.add("CrossCountry");
        manufacturer.add("Helicopter");

        VehicleColour.add("Red");
        VehicleColour.add("Green");
        VehicleColour.add("Blue");
        VehicleColour.add("Black");
        VehicleColour.add("White");


        }
        public String getName() {return this.name;};
        public boolean isTravelsOnRoad() {return this.travelsOnRoad;};
        public boolean isForPublic() {return this.forPublic;}
        public Integer getNumOfWheelsOrWings() {return this.numOfWheelsOrWings;}
        public Integer getMaxOccupancy() {return this.maxOccupancy;}

}

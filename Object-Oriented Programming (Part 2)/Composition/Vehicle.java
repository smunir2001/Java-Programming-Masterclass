public class Vehicle {
    
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String result = "vehicle.name: " + this.name;
        return result;
    }
}
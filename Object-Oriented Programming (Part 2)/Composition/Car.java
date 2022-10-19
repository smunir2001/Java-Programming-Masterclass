public class Car extends Vehicle {
    
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    @Override
    public String toString() {
        String result = super.getName() + "\n\tcar.doors: " + this.doors + 
            "\n\tcar.engineCapacity: " + this.engineCapacity;
        return result;
    }
}
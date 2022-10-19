public class Motherboard {
    
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getRamSlots() {
        return this.ramSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public String getBios() {
        return this.bios;
    }
}
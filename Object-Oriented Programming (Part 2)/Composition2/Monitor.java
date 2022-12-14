public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at (" + x + "," + y + ") in color [" + color + "]...");
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

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }

    public Resolution getNativeResolution() {
        return this.nativeResolution;
    }
}
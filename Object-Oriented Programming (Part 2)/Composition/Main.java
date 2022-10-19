public class Main {
    public static void main(String args[]) {
        Vehicle v1 = new Vehicle("Honda");
        System.out.print("Vehicle v1: ");
        System.out.println(v1 + "\n");

        Vehicle v2 = new Vehicle("Mercedes-Benz");
        System.out.print("Vehicle v2: ");
        System.out.println(v2 + "\n");

        Vehicle v3 = new Vehicle("BMW");
        System.out.print("Vehicle v3: ");
        System.out.println(v3 + "\n");

        Car c1 = new Car(v1.getName(), 4, 4);
        System.out.print("Car c1: ");
        System.out.println(c1 + "\n");
    }
}
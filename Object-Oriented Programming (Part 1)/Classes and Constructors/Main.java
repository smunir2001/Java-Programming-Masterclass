public class Main {
    public static void main(String args[]) {
        Car porsche = new Car();
        Car bmw = new Car();

        porsche.setModel("911 Carrera GTS4");
        System.out.println("porsche.getModel(): " + porsche.getModel());
        System.out.println("bmw.getModle(): " + bmw.getModel());
    }    
}
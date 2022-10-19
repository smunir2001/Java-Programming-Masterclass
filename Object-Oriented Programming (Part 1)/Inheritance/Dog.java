public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog (String name, int size, int weight) {
        super(name, 1, 1, size, weight);
    }

    public Dog (String name, int size, int weight,
        int eyes, int legs, int tail, int teeth, String coat) {
            super(name, 1, 1, size, weight);
            this.eyes = eyes;
            this.legs = legs;
            this.tail = tail;
            this.teeth = teeth;
            this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called...");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called...");
        chew();
        super.eat();
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called...");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called...");
        moveLegs(speed);
        super.move(speed); // call super move-method in super-class
    }

    public void walk() {
        System.out.println("Dog.walk() called...");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called...");
        move(10); // call move-metod in the current class
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return this.eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTail() {
        return this.tail;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getCoat() {
        return this.coat;
    }
}
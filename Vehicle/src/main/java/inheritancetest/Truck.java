package inheritancetest;

public class Truck extends Vehicle {
    final private int load;

    public Truck(String s, int numWheels, double maxSpeed, int capacity) {
        super(s, numWheels, maxSpeed);
        this.load = capacity;
    }

    public int getCapacity() {
        return this.load;
    }

    public String honk() {
        return "Make way for truck " +
                this.getId() +
                ", running at " +
                this.getSpeed() +
                " mph, carrying " +
                this.getCapacity() +
                " tonnes of cargo.";
    }
}
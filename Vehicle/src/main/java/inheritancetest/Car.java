package inheritancetest;

public class Car extends Vehicle {
    final private int passengers;

    public Car(String s, int numPassengers, double mS) {
        super(s, 4, mS);
        this.passengers = numPassengers;
    }

    public int getCapacity() {
        return this.passengers;
    }

    public String honk() {
        return "Make way for car " +
                this.getId() +
                ", running at " +
                this.getSpeed() +
                " mph, carrying " +
                this.getCapacity() +
                " passengers.";
    }
}

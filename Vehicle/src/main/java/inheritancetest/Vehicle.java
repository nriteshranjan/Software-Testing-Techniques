package inheritancetest;

public abstract class Vehicle {
    private int numWheels;
    private double speed;
    private double maxSpeed;
    private boolean state;
    final private String id;

    public Vehicle(String s, int n, double maxS) {
        this.id = s;
        this.numWheels = n;
        this.maxSpeed = maxS;
        this.state = false;
    }

    public String getId() {
        return this.id;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int n) {
        this.numWheels = n;
    }

    public boolean isRunning() {
        return this.state;
    }

    public void turnOn() {
        if (!this.state) {
            this.state = true;
            return;
        }
        System.out.println("Vehicle is already running.");
    }

    public void turnOff() {
        if (this.state) {
            this.state = false;
            return;
        }
        System.out.println("Vehicle is not running.");
    }

    public double getSpeed() {
        return this.speed;
    }

    public boolean setSpeed(double s) {
        if (s <= this.maxSpeed) {
            this.speed = s;
            return true;
        }
        return false;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double n) {
        this.maxSpeed = n;
    }

    public String honk() {
        return "Make way";
    }

    abstract public int getCapacity();
}
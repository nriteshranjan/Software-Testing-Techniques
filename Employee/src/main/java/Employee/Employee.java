package Employee;

public class Employee {
    public String name;
    public float payRate;

    public Employee(String name, float payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float pay(float hoursWorked) {
        return hoursWorked * payRate;
    }
}

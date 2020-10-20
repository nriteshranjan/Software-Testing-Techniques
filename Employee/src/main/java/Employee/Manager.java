package Employee;

public class Manager extends Employee {
    Boolean isSalaried;

    public Manager(String name, float payRate, Boolean isSalaried) {
        super(name, payRate);
        this.isSalaried = isSalaried;
    }

    public Boolean getSalaried() {
        return isSalaried;
    }

    public void setSalaried(Boolean salaried) {
        isSalaried = salaried;
    }

    @Override
    public float pay(float hoursWorked) {
        if(isSalaried) return payRate;
        return super.pay(hoursWorked);
    }
}

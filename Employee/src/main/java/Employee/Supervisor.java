package Employee;

public class Supervisor extends Employee {

    private String deptName;
    public Boolean isSalaried = true;

    public Supervisor(String name, float payRate) {
        super(name, payRate);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public float pay(float hoursWorked) {
        return super.pay(hoursWorked);
    }
}

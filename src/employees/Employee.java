package employees;

public class Employee extends Person {
    private static int nextId = 1;

    private int id = nextId++;
    private int dept;
    private double payRate;

    public Employee(String firstName, String lastName, int dept, double payRate) {
        super(firstName, lastName);
        setDept(dept);
        setPayRate(payRate);
    }

    public int getId() { return id; }
    public int getDept() { return dept; }
    public void setDept(int dept) { if (dept > 0) this.dept = dept; }
    public double getPayRate() { return payRate; }
    public void setPayRate(double payRate) { if (payRate >= 0) this.payRate = payRate; }
    public String getPayInfo() {
        return "employees.Employee " + id + " dept " + dept + " " + getFullName() + " paid " + payRate;
    }
}

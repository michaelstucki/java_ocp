package employees;

import finance.Payable;

public abstract class Employee extends Person implements Payable {
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
    public abstract String getPayInfo();
}

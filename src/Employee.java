public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPayInfo() {
        return getFullName() + ", " + employeeID + ", " + dept + ", " + payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}

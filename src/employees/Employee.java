package employees;

/**
 * Models an employee
 */
public class Employee {
    private static int nextId = 1;
    private int id = nextId++;

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }
    public static int getNextId() { return nextId; }

    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    /**
     *  constructor: default
     */
    public Employee() {}

    /**
     * constructor: first name, last name
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     */
    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * constructor: first name, last name, department number
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param dept: employee's department number
     */
    public Employee(String firstName, String lastName, int dept) {
        this(firstName, lastName);
        setDept(dept);
    }

    /**
     * constructor: first name, last name, hourly pay rate
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param payRate: employee's hourly pay rate
     */
    public Employee(String firstName, String lastName, double payRate) {
        this(firstName, lastName);
        setPayRate(payRate);
    }

    /**
     * constructor: first name, last name, department number, hourly pay rate
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param dept: employee's department number
     * @param payRate: employee's hourly pay rate
     */
    public Employee(String firstName, String lastName, int dept, double payRate) {
        this(firstName, lastName, dept);
        setPayRate(payRate);
    }

    /**
     * Get employee's ID
     * @return employee's ID
     */
    public int getId() { return id; }

    /**
     * Get employee's first name
     * @return employee's first name
     */
    public String getFirstName() { return firstName; }

    /**
     * Set employee's first name
     * @param firstName: employee's first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Get employee's last name
     * @return employee's last name
     */
    public String getLastName() { return lastName; }

    /**
     * Set employee's last name
     * @param lastName: employee's last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Get employee's department number
     * @return employee's department number
     */
    public int getDept() { return dept; }

    /**
     * Set employee's department number
     * @param dept: employee's department number
     */
    public void setDept(int dept) {
        if (dept > 0) this.dept = dept;
    }

    /**
     * Get employees hourly pay rate
     * @return employee's hourly pay rate
     */
    public double getPayRate() { return payRate; }

    /**
     * Set employee's hourly pay rate
     * @param payRate: employee's hourly pay rate
     */
    public void setPayRate(double payRate) {
        if (payRate >= 0) this.payRate = payRate;
    }

    /**
     * Get employee's full name
     * @return employee's full name
     */
    public String getFullName() { return firstName + " " + lastName; }

    /**
     * Get employee's pay information
     * @return employee pay information
     */
    public String getPayInfo() {
        return "employees.Employee " + id + " dept " + dept + " " + getFullName() + " paid " + payRate;
    }
}

public class Payroll {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setDept(2);
        e1.setPayRate(6000.0);
        System.out.println(e1.getPayInfo());

        Employee e2 = new Employee("Jane", "Smith", 15, 6500.0);
        System.out.println(e2.getPayInfo());
    }
}

package inherit.encapsulation.emppackage;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp=new Employee("Prajjawal",30,36000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Tanmay");
        emp.setAge(24);
        emp.setSalary(25000);
        System.out.println(emp.getEmployeeDetails());

    }
}

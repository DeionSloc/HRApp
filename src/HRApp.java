public class HRApp {
    public static void main(String[] args) {
        System.out.println("Application starting");

        Employee e1 = new Employee("Darrell Knowles");
        e1.setEmployeeId(53);
        e1.setSalary(89000.31);

        Department d1 = new Department("IT", 10);
        d1.setCapacity(10);
        d1.setName("IT");

        System.out.println("Mr. " + e1.getName() + " employee id is " + e1.getEmployeeId() + " and has a salary of " + e1.getSalary());
        System.out.println("The " + d1.getName() + " department has a total of " + d1.getCapacity() + " employees.");


    }
}
import java.util.Arrays;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("Application starting");

        Employee e1 = new Employee("Darrell Knowles", 1, 89000);

        Employee e2 = new Employee("Sarah Cotlin", 2, 90200 );

        Department d1 = new Department("IT");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addEmployee(new Employee("Jason Myers", 3, 101090));

        Employee[] emps = d1.getEmployees();
        for(Employee emp : emps){
            System.out.println(emp);
        }
        System.out.println(d1.getAverageSalary());
        System.out.println(d1.getTotalSalary());
        System.out.println("Employee: " + d1.getEmployeeById(5));
    }
}
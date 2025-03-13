import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddeddEmployeeIndex = -1;

    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Department " + name;
    }

    public Employee[] getEmployees(){
        Employee[] actualEmployees = new Employee[lastAddeddEmployeeIndex+1];
        for(int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public void addEmployee(Employee anEmployee){
        if(lastAddeddEmployeeIndex < employees.length)
            lastAddeddEmployeeIndex++;
        employees[lastAddeddEmployeeIndex] = anEmployee;
    }

    public int getEmployeeCount(){
        return lastAddeddEmployeeIndex;
    }

    public double getTotalSalary(){
        double totalSalary = 0.0;
        for(int i = 0; i <= lastAddeddEmployeeIndex; i++){
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary(){
        double avgSalary = 0.0;
        if(lastAddeddEmployeeIndex > -1){
            return getTotalSalary() / (lastAddeddEmployeeIndex + 1);
        }
        return 0.0;
    }

    public Employee getEmployeeById(int empID){
        for(Employee employee : employees){
            if(employee != null)
                if(employee.getEmployeeId() == (empID)){
                    return employee;
                }
        }
        return null;
    }

}



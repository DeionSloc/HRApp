public class Department {
    private String name;
    private Employee[] employees;
    private int capacity = 10;

    public Department(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Employee[] getEmployees(){
        for(Employee employee : employees){
            name = name + employee.getName();
        }
        return employees;
    }

    public void addEmployee(Employee[] someEmployees){
        employees = someEmployees;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

}



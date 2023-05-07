public class Employee {
   final private String person; //ФИО сотрудника;
    int department; //отдел сотрудника
    int salary;//зарплата сотрудника
    private  int id;//id сотрудника
    private static int counterID = 0;

    public String getPerson() {
        return person;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setDepartment() {
        this.department = department;
        return department;
    }

    public int setSalary() {
        this.salary = salary;
        return salary;
    }

    public Employee(String person,int department,int salary){
        this.person = person;
        this.department = department;
        this.salary = salary;
        this.id = counterID++;
    }

    @Override
    public String toString() {
        return "Employee: " +  person + ", Department=" + department + ", Salary=" + salary + ", id=" + id ;
    }
}
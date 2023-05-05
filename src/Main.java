public class Main {

   private static Employee[] employees = new Employee[10];
    public static int counterId = 0;    public static void main(String[] args) {

        employees[0] = new Employee("John J Doe", 1, 800);
        employees[1] = new Employee("Jane J Doe", 1, 1300);
        employees[2] = new Employee("James K Stone", 2, 970);
        employees[3] = new Employee("Jerome A Coulson", 2, 3400);
        employees[4] = new Employee("Holly P Smith", 3, 1600);
        employees[5] = new Employee("Zoe E Pratt", 3, 1500);
        employees[6] = new Employee("Bruce K Karstark", 4, 1900);
        employees[7] = new Employee("Pedro Adriano", 4, 1750);
        employees[8] = new Employee("Karl Petricce", 5, 1300);
        employees[9] = new Employee("Samanta de Antonio", 5, 3500);
        printEmployee();
        System.out.println(getSalaryCosts());
        System.out.println("Employee with Min Salary - " + getMinSalaryEmployee().getPerson() + " id= " + getMinSalaryEmployee().getId());
        System.out.println("Employee with Max Salary - " + getMaxSalaryEmployee().getPerson() + " id= " + getMaxSalaryEmployee().getId());
        System.out.println(getAverageSalary());
        getFullNames();
    }

        private static void printEmployee() {
            for (Employee employee : employees){
                System.out.println(employee);
            }
        }


        private static int getSalaryCosts() {
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee getMinSalaryEmployee() {
        int minSalary = Integer.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    private static Employee getMaxSalaryEmployee() {
        int maxSalary = Integer.MIN_VALUE;
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxEmployee = employee;
            }
        }
            return maxEmployee;
    }

    private static int getAverageSalary() {
        int average = 0;
        for (Employee employee : employees) {
            average = average + employee.setSalary() / employees.length;
        }
        return average;
    }
    private static void getFullNames() {
        for (Employee employee : employees){
            System.out.println(employee.getPerson());
        }
    }
}
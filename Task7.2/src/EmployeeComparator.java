import java.util.Comparator;

class EmployeeComparator {
    public static Comparator<Employee> bySalaryAscending = Comparator.comparingDouble(Employee::getSalary);
    public static Comparator<Employee> bySalaryDescending = Comparator.comparingDouble(Employee::getSalary).reversed();
    public static Comparator<Employee> byName = Comparator.comparing(Employee::getName);
    public static Comparator<Employee> byDepartment = Comparator.comparing(Employee::getDepartment);
}

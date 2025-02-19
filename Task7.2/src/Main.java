import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 60000));
        employees.add(new Employee(102, "Bob", "Engineering", 75000));
        employees.add(new Employee(103, "Charlie", "Marketing", 50000));
        employees.add(new Employee(104, "David", "Engineering", 80000));
        employees.add(new Employee(105, "Eve", "HR", 65000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by salary (ascending)
        Collections.sort(employees, EmployeeComparator.bySalaryAscending);
        System.out.println("\nSorted by Salary (Ascending):");
        employees.forEach(System.out::println);

        // Sort by salary (descending)
        Collections.sort(employees, EmployeeComparator.bySalaryDescending);
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);

        // Sort by name (alphabetical order)
        Collections.sort(employees, EmployeeComparator.byName);
        System.out.println("\nSorted by Name (Alphabetical Order):");
        employees.forEach(System.out::println);

        // Sort by department (alphabetical order)
        Collections.sort(employees, EmployeeComparator.byDepartment);
        System.out.println("\nSorted by Department (Alphabetical Order):");
        employees.forEach(System.out::println);
    }
}

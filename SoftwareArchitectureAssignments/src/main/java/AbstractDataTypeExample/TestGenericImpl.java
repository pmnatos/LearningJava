package AbstractDataTypeExample;

import java.util.ArrayList;
import java.util.List;

public class TestGenericImpl {
    public static void main(String[] args) {
        ObjectManagement<Employee> employeeObjectManagement = new ObjectManagementImpl<>();
        Employee employee1 = new Employee("1", "A", 35, "S");
        Employee employee2 = new Employee("2", "B", 36, "T");
        Employee employee3 = new Employee("3", "C", 38, "U");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeObjectManagement.addAll(employeeList);
        List<Employee> existingEmployeeList = employeeObjectManagement.getAllObjectDetails();
        Integer employeeCount = employeeObjectManagement.getCount();
        System.out.println("Count of number of employees: " + employeeCount);
        existingEmployeeList.forEach(employee -> System.out.println("Employee Details: " + employee));
    }
}

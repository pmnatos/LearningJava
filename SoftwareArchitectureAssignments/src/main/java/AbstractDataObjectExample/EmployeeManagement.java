package AbstractDataObjectExample;

import java.util.List;

public interface EmployeeManagement {
    /**
     * Method to add a new Employee
     * @param e
     */
    void add(Employee e);

    /**
     * Method to add a new list of Employees
     * @param e
     */
    void addAll(List<Employee> e);

    /**
     *
     * @return The count of the number of employees
     */
    Integer getEmployeeHeadCount();

    /**
     *
     * @return The list of all the employees if list is not empty. Else returns an empty list.
     */
    List<Employee> getAllEmployeeDetails();
}

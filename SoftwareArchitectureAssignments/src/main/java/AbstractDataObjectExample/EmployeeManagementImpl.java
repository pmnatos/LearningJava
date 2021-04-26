package AbstractDataObjectExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementImpl implements EmployeeManagement{
    private List<Employee> employeeList;

    EmployeeManagementImpl(){
        employeeList = new ArrayList<>();
    }

    @Override
    public void add(Employee e) {
        this.employeeList.add(e);
    }

    @Override
    public void addAll(List<Employee> e) {
        this.employeeList.addAll(e);
    }

    @Override
    public Integer getEmployeeHeadCount() {
        return employeeList.size();
    }

    @Override
    public List<Employee> getAllEmployeeDetails() {
        return employeeList.size() !=0? employeeList:new ArrayList<>();
    }
}

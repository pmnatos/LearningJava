package AbstractDataTypeExample;

public class Employee {
    String id;
    String name;
    Integer age;
    String department;

    Employee(String id, String name, Integer age, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

package Compare;

public class Employee {

    int emp_id;
    String emp_name;
    int age;

    Employee (int emp_id, String emp_name, int age){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.age = age;
    }
//getter setter method
    public int getEmp_id(int emp_id){
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

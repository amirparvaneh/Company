package company;

import department.Department;

import java.util.Date;

public class Manager extends Employee {


    public Manager(String name, Date hireDate, Department department) {
        super(name, hireDate, department);
    }



    @Override
    public long getSalary() {
        return 10000;
    }
    @Override
    public String toString() {
        return "Manager [name= " + getName() + ", department= " + getDepartment().getName() + ", salary= "
                + getSalary() + ", hireDate= " + getHireDate() + "]";
    }
}

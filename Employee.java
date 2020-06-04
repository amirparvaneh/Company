package company;

import department.Department;
import enums.DeveloperType;

import java.util.Date;

public abstract class Employee {
    protected DeveloperType developerType;
    private String name ;
    private Date hireDate;
    private Department department;

    public Employee(String name, Date hireDate, Department department){
        super();
        this.name = name;
        this.hireDate = hireDate;
        this.department = department;

    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setHireDate(Date hireDate){
        this.hireDate = hireDate;

    }
    public Date getHireDate(){
        return hireDate;
    }
    public Department getDepartment(){
        return department;
    }
    public abstract long getSalary();
    @Override
    public String toString(){
        return  "Employee [ name = "+ name + " , hireDate = "+ hireDate
                + ", salary = " + getSalary() + ", department = "+getDepartment() + "]";
    }
}
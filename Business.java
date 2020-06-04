package company;

import department.Department;

import java.util.Date;

public class Business extends Employee {
    private String media;
    public Business(String name, Date hireDate, Department department, String media) {

        super(name,hireDate,department);
        this.media = media;
    }
    public String getMedia(){
        return media;
    }
    public void setMedia(String media){
        this.media = media;
    }

    @Override
    public long getSalary() {
        return 4000;
    }
    @Override
    public String toString(){
        return "Bussiness [name= " + getName() + ", media= " + media + ", salary= " + getSalary()
                + ", department= " + getDepartment().getName() + ", hireDate= " + getHireDate() + "]";
    }
}

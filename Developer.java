package company;

import department.Department;
import enums.DeveloperLanguage;
import enums.DeveloperType;

import java.util.Date;

public class Developer extends Employee {
    public Developer(String name, Date hireDate, Department department, DeveloperLanguage developerLanguag ,
                     DeveloperType developerType) {
        super(name, hireDate, department);
        Object developerLanguage;
        this.developerLanguage = developerLanguage;
        this.developerType = developerType;
    }
    public void set





    @Override
    public long getSalary() {
        return 8000;
    }
}

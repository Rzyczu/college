import Enums.UniversityType;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String Name;
    public UniversityType Type;
    public String Country;
    public String City;
    public List<Department> Departments;

    public University(String name, UniversityType type, String country, String city, List<String> departments) {
        Name = name;
        Type = type;
        Country = country;
        City = city;
        Departments = new ArrayList<Department>();
    }

    //todo poprawić
    public String getInfo() {
        return Name + ", " + Type + ", " + Country + ", " + City + ", " + Departments;
    }

    public String getLocalization() {
        return Country + ", " + City;
    }

    public List<Department> getDepartments() {
        return Departments;
    }

    public void addDepartment(Department department) {
        Departments.add(department);
    }

    public void removeDepartment(Department department) {
        Departments.remove(department);
    }
}

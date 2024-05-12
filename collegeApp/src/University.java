import Enums.UniversityType;

import java.util.ArrayList;
import java.util.List;

public
class University {
    private String Name;
    private UniversityType Type;
    private String Country;
    private String City;
    private List<Department> Departments;

    public University(String name, UniversityType type, String country, String city, List<Department> departments) {
        Name = name;
        Type = type;
        Country = country;
        City = city;
        Departments = departments != null ? departments: new ArrayList<>();
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(Name).append("\n");
        info.append("Type: ").append(Type).append("\n");
        info.append("Country: ").append(Country).append("\n");
        info.append("City: ").append(City).append("\n");
        info.append("Departments: ");
        for (Department department : Departments){
            info.append(department.getName()).append(", ");
        }
        return info.toString();
    }

    public String getLocalization() {
        return "Country: " + Country + ", City: " + City;
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

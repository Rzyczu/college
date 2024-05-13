package University;

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
        info.append("Type: ").append(Type.getName()).append("\n");
        info.append("Country: ").append(Country).append("\n");
        info.append("City: ").append(City).append("\n");
        info.append("Departments: ").append("\n");
        info.append("\u001B[32m");
        for (Department department : Departments) {
            info.append(department.getInfo()).append("\n");
        }
        info.append("\u001B[0m");
        return info.toString();
    }

    public String getLocalization() {
        return "Country: " + Country + ", City: " + City;
    }

    public List<Department> getDepartments() {
        return Departments;
    }

    public Department getDepartmentByName(String departmentName) {
        for (Department department : getDepartments()) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }

    public void setDepartment(List<Department> departmentList) {
        Departments.addAll(departmentList);
    }

    public void addDepartment(Department department) {
        Departments.add(department);
    }

    public void removeDepartment(Department department) {
        Departments.remove(department);
    }
}

package University;

import Enums.UniversityType;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a University entity.
 */
public class University {
    private String Name;
    private UniversityType Type;
    private String Country;
    private String City;
    private List<Department> Departments;

    /**
     * Constructor to initialize a University object.
     * @param name The name of the university.
     * @param type The type of the university (e.g., public, private).
     * @param country The country where the university is located.
     * @param city The city where the university is located.
     * @param departments The list of departments associated with the university.
     */
    public University(String name, UniversityType type, String country, String city, List<Department> departments) {
        Name = name;
        Type = type;
        Country = country;
        City = city;
        Departments = departments != null ? departments: new ArrayList<>();
    }

    /**
     * Generates information about the university.
     * @return Information about the university.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("University Name: ").append(Name).append("\n");
        info.append("Type: ").append(Type.getName()).append("\n");
        info.append("Country: ").append(Country).append("\n");
        info.append("City: ").append(City).append("\n");
        info.append("Departments: ").append("\n");
        info.append("\u001B[32m");
        for (Department department : Departments){
            info.append(department.getInfo()).append("\n");
        }
        info.append("\u001B[0m");
        return info.toString();
    }

    /**
     * Gets the localization of the university.
     * @return Localization of the university (Country and City).
     */
    public String getLocalization() {
        return "Country: " + Country + ", City: " + City;
    }

    /**
     * Gets the list of departments associated with the university.
     * @return List of departments.
     */
    public List<Department> getDepartments() {
        return Departments;
    }

    /**
     * Retrieves a department from the university by its name.
     * @param departmentName The name of the department to retrieve.
     * @return The department with the specified name, or null if not found.
     */
    public Department getDepartmentByName(String departmentName) {
        for (Department department : getDepartments()){
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }

    /**
     * Sets the list of departments associated with the university.
     * @param departmentList The list of departments to set.
     */
    public void setDepartment(List<Department> departmentList) {
        Departments.addAll(departmentList);
    }

    /**
     * Adds a department to the list of departments associated with the university.
     * @param department The department to add.
     */
    public void addDepartment(Department department) {
        Departments.add(department);
    }

    /**
     * Removes a department from the list of departments associated with the university.
     * @param department The department to remove.
     */
    public void removeDepartment(Department department) {
        Departments.remove(department);
    }
}

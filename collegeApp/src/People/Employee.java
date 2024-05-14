package People;

/**
 * Represents an employee in an organization.
 */
public interface Employee {
    /**
     * Gets the salary of the employee.
     * @return The salary of the employee.
     */
    Double getSalary();

    /**
     * Changes the salary of the employee.
     * @param amount The new salary amount.
     */
    void changeSalary(Double amount);
}

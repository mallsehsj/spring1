// Write your code here
package com.example.employee;

import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee getbyId(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);

    void delete(int employeeId);

}

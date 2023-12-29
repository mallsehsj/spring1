/*
 * You can use the following import statements
 * 
import org.springframework.web.bind.annotation.*;
 
 * 
 */

// Write your code here
package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;
import com.example.employee.Employee;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);

    }

    @GetMapping("/employees/{employeeId}")
    public Employee getbyId(@PathVariable("employeeId") int employeeId) {
        return employeeService.getbyId(employeeId);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);

    }

    @DeleteMapping("/employees/{employeeId}")
    public void delete(@PathVariable("employeeId") int employeeId) {
        employeeService.delete(employeeId);
    }

}

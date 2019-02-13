package com.izdebski.service;

import com.izdebski.entities.Employee;

public interface EmployeeService {

    public abstract void createEmployee(Employee employee);
    public abstract Employee getEmployeeById(int EmployeeId);
    public abstract void updateEmployeeById(int employeeId, Double newSal);
    public abstract void deleteEmployeeById(Integer employeeId);
}
package com.izdebski.dao;

import com.izdebski.entities.Employee;

public interface EmloyeeDAO {

    public abstract void addEmployee(Employee employee);
    public abstract Employee fetchEmployeeById(int employeeId);
    public abstract void updateEmployeeById(int employeeId, Double newSal);
    public abstract void deleteEmployeeById(Integer employeeId);
}
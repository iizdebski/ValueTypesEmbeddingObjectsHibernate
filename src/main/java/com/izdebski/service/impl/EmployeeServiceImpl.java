package com.izdebski.service.impl;

import com.izdebski.dao.impl.EmployeeDAOImpl;
import com.izdebski.entities.Employee;
import com.izdebski.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void createEmployee(Employee employee) {
        new EmployeeDAOImpl().addEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int EmployeeId) {
        return new EmployeeDAOImpl().fetchEmployeeById(EmployeeId);
    }

    @Override
    public void updateEmployeeById(int employeeId, Double newSal) {
        new EmployeeDAOImpl().updateEmployeeById(employeeId, newSal);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        new EmployeeDAOImpl().deleteEmployeeById(employeeId);
    }
}
package com.csi.dao;


import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    @Override
    public Employee saveData(Employee employee) {

        return employeeRepoImpl.save(employee);
    }

    @Override
    public List<Employee> getAllData() {

        return employeeRepoImpl.findAll();
    }

    @Override
    public Optional<Employee> getDataById(int empId) {

        return employeeRepoImpl.findById(empId);
    }

    @Override
    public Employee getDataByName(String empName) {
        return employeeRepoImpl.findByEmpName(empName);

    }

    @Override
    public Employee updateDataById(int empId, Employee employee) {


        return employeeRepoImpl.save(employee);
    }

    @Override
    public void deleteDataById(int empId) {

         employeeRepoImpl.deleteById(empId);
    }
}

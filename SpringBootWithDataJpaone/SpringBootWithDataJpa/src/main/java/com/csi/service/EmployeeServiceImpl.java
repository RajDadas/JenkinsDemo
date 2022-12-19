package com.csi.service;


import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeDaoImpl employeeDaoImpl;
    @Override
    public Employee saveData(Employee employee) {


        return employeeDaoImpl.saveData(employee);
    }

    @Override
    public List<Employee> getAllData() {

        return employeeDaoImpl.getAllData();
    }

    @Override
    public Optional<Employee> getDataById(int empId) {


        return employeeDaoImpl.getDataById(empId);
    }

    @Override
    public Employee getDataByName(String empName) {

        return employeeDaoImpl.getDataByName(empName);
    }

    @Override
    public Employee updateDataById(int empId, Employee employee) {

        return employeeDaoImpl.updateDataById(empId,employee);
    }

    @Override
    public void deleteDataById(int empId) {
        employeeDaoImpl.deleteDataById(empId);

    }
}

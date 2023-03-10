package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    public Employee saveData(Employee employee);
    public List<Employee> getAllData();
    public Optional<Employee> getDataById(int empId);
    public  Employee getDataByName(String empName);
    public Employee updateDataById(int empId,Employee employee);
    public  void deleteDataById(int empId);

}

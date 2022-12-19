package com.csi.controller;


import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @GetMapping
    public  String show(){
        return "hello";
    }
    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){
       return employeeServiceImpl.saveData(employee);
    }
    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }@GetMapping("/getdatabyId/{empId}")
    public Optional<Employee> getDataById(@PathVariable int empId){
        return employeeServiceImpl.getDataById(empId);
    }
    @GetMapping("/getdatabyname/{empName}")
    public Employee getDataByName(@PathVariable String empName){
        return employeeServiceImpl.getDataByName(empName);
    }
    @PutMapping("/updatedata/{empId}")
    public Employee updateDataById(@PathVariable int empId,@RequestBody Employee employee){
        return employeeServiceImpl.updateDataById(empId,employee);
    }
   @DeleteMapping("/deletedata/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return " Data Deleted Sucessfully";
   }
}

package com.example.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.website.entity.Employee;
import com.example.website.service.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired 
    EmployeeService ser;

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee)
    {
        System.out.println(employee);
        ser.saveEmployee(employee);
    }

    @GetMapping("/showEmployee")
    public List<Employee> getAllUsers()
    {
        return ser.getEmployees();
    }

    @DeleteMapping("/deleteEmployee")
    public void removeEmployee(@RequestParam int id)
    {
        System.out.print("To be Deleted: "+id);
        ser.deleteEmployee(id);
    }

    @PutMapping("/changeEmployee")
    public void putMethodName(@RequestBody Employee employee) {
        System.out.println("Employee Recieved: "+employee);
        ser.changeEmployeeData(employee);
    }

    @PatchMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        ser.updateEmployeeData(employee);
    }



    
}

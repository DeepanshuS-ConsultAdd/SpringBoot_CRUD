package com.example.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.entity.Employee;
import com.example.website.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee(Employee employee)
    {
       repository.save(employee);
    }

    public List<Employee> getEmployees()
    {
        return (List<Employee>) repository.findAll();
    }

    public void deleteEmployee(int id)
    {
        Employee emp = repository.findById(id).get();
        System.out.println(emp); 
        repository.delete(emp);
    } 

    public void changeEmployeeData(Employee employee)
    {
        int id=employee.getId();
        Employee emp= repository.findById(id).get();
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        repository.save(emp);
        // System.out.println("Employee Id"+id);
        // System.out.println("Fetched Employee Data"+emp);
    }

    public void updateEmployeeData(Employee employee)
    {
        int id=employee.getId();
        Employee emp= repository.findById(id).get();
        if(employee.getName()!=null)
        {
            emp.setName(employee.getName());
        }
        if(employee.getSalary()!=null)
        {
            emp.setSalary(employee.getSalary());
        }
        repository.save(emp);
    }


}

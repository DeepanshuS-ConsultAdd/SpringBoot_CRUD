package com.example.website.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.website.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

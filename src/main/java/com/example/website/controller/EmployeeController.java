package com.example.website.controller;

//import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.website.entity.Employee;
import com.example.website.model.MyUserDetailService;
import com.example.website.service.EmployeeService;
import com.example.website.webtoken.JwtService;
import com.example.website.webtoken.LoginForm;


@RestController
public class EmployeeController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired 
    EmployeeService ser;

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee)
    {
        System.out.println(employee);
        ser.saveEmployee(employee);
    }

    @PostMapping("/admin/addEmployee")
    public void addEmployee1(@RequestBody Employee employee)
    {
        System.out.println(employee);
        ser.saveEmployee(employee);
    }
    
    @GetMapping("/admin/showEmployee")
    public List<Employee> getAllUsers()
    {
        return ser.getEmployees();
    }

    @GetMapping("/user/showEmployee")
    public List<Employee> getAllUsers1()
    {
        return ser.getEmployees();
    }

    @GetMapping("/home")
    public String display()
    {
        return "<h1>Basic Home Accessible to all</h1>";
    }
    
    @GetMapping("/admin/home")
    public String display1()
    {
        return "<h1>Admin Home</h1>";
    }

    @GetMapping("/user/home")
    public String display2()
    {
        return "<h1>User Home</h1>";
    }

    @PostMapping("/authenticate")
    public String authenticateAndGetToken(@RequestBody LoginForm loginForm)
    {
       Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
            loginForm.username(), loginForm.password()
            ));

            if(authentication.isAuthenticated())
            {
                return jwtService.generateToken(myUserDetailService.loadUserByUsername(loginForm.username()));
            }else{
                throw new UsernameNotFoundException("Invalid Credentials");
            }
    }
    

    @DeleteMapping("/admin/deleteEmployee")
    public void removeEmployee(@RequestParam int id)
    {
        System.out.print("To be Deleted: "+id);
        ser.deleteEmployee(id);
    }

    @PutMapping("/admin/changeEmployee")
    public void putMethodName(@RequestBody Employee employee) {
        System.out.println("Employee Recieved: "+employee);
        ser.changeEmployeeData(employee);
    }

    @PatchMapping("/admin/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        ser.updateEmployeeData(employee);
    }



    
}

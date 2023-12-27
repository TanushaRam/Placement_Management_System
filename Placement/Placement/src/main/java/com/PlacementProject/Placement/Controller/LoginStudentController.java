package com.PlacementProject.Placement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Service.LoginStudentService;

@RestController
@RequestMapping("/StudentLogin")
public class LoginStudentController {
    @Autowired
    private LoginStudentService loginStudentService;
   @GetMapping("/{emailId}/{regestrationNumber}")
    public String studentLogin(@PathVariable("emailId")String emailId, @PathVariable("regestrationNumber")String regestrationNumber)
    {
        StudentRegestration studentRegestration=loginStudentService.studentLogin(emailId,regestrationNumber);
        
         if (studentRegestration != null) {
            return "Login";
        } else {
            // Handle the case where the repository is not initialized
            throw new IllegalStateException("Student is not initialized.");
        }
    }
    }
    


    
    


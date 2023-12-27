package com.PlacementProject.Placement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Service.StudentRegistrationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Student")
public class StudentRegistrationController {

  @Autowired
    private StudentRegistrationService studentRegistrationService;

   @PostMapping("/StudentRegistrations")
    public String studentRegistration(@Valid @RequestBody StudentRegestration studentRegestration)
   {
      studentRegistrationService.studentRegistration(studentRegestration);
      return "Registered Successfull";
   }

}

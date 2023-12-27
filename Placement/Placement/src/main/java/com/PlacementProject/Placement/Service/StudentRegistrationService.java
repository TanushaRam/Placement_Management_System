package com.PlacementProject.Placement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Repository.StudentRegistrationRepository;

@Service
public class StudentRegistrationService {
   @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

   
    public String studentRegistration(StudentRegestration studentRegestration) {

        studentRegistrationRepository.save(studentRegestration);
        return null;
    }
    
}

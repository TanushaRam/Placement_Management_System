package com.PlacementProject.Placement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Repository.LoginStudentRepository;

@Service
public class LoginStudentService {

    @Autowired
    private LoginStudentRepository loginStudentRepository;
    public StudentRegestration studentLogin(String emailId, String regestrationNumber) {

        StudentRegestration studentRegestration=loginStudentRepository.findByEmailIdAndRegestrationNumber(emailId, regestrationNumber);
        return studentRegestration;
    }
    
}

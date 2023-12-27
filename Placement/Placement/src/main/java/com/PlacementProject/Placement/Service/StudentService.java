package com.PlacementProject.Placement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.CompanyDetails;
import com.PlacementProject.Placement.Repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public CompanyDetails getAllDetailsById(String companyName) {

        CompanyDetails companyDetails=studentRepository.findByCompanyName(companyName);


        return companyDetails;
    }

    public List<CompanyDetails> getAllComapnyDetails() {

       List<CompanyDetails> companyDetails=studentRepository.findAll()
;        
        return companyDetails;


    }

    
}

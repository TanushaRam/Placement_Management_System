package com.PlacementProject.Placement.Controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementProject.Placement.Model.CompanyDetails;
import com.PlacementProject.Placement.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

     @Autowired
    private StudentService studentService;
    
    @GetMapping("/{CompanyName}")
    public ResponseEntity<CompanyDetails> getAllDetailsById(@PathVariable("CompanyName") String CompanyName)
    {
       CompanyDetails companyDetails=studentService.getAllDetailsById(CompanyName);
      
       if(Objects.nonNull(companyDetails))
       {
        return ResponseEntity.ok(companyDetails);
       }
       else{
        return ResponseEntity.notFound().build();
       }
    
    }

    @GetMapping("/allCompanys")
    public ResponseEntity<List<CompanyDetails>> getAllComapnyDetails(){


       List<CompanyDetails>  companyDetails=studentService.getAllComapnyDetails();
        return ResponseEntity.ok(companyDetails);

        
    }




    
}

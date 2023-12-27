package com.PlacementProject.Placement.Controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Service.StudentDetailsService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/studentDetails")
public class StudentDetailsController {
    @Autowired
    private StudentDetailsService studentDetailsService;

  

    @GetMapping("/{id}")
    public ResponseEntity<Optional<StudentRegestration>> getStudentDetailsById(@PathVariable("id") String regestrationNumber)
    {

        Optional<StudentRegestration> sOptional=studentDetailsService.getStudentDetailsById(regestrationNumber);
        if (sOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(sOptional);
        }
    }
    @GetMapping("/")
    public ResponseEntity<List<StudentRegestration>> getAllStudentDetails(){
     List< StudentRegestration> sOptional=studentDetailsService.getAllStudentDetails();
          if(Objects.nonNull(sOptional))
        {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(sOptional);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    } 

    @PutMapping("/updateStudentDetails/{regestrationNumber}")
    public String updateStudentDetails(@PathVariable("regestrationNumber") String regestrationNumber,@RequestBody StudentRegestration studentRegestration)
    {
        studentDetailsService.updateStudentDetails(regestrationNumber,studentRegestration);
        return "Updated";
    }

    @DeleteMapping("/{regestrationNumber}")
    @Transactional
    public String deleteStudentDetails(@PathVariable("regestrationNumber") String regestrationNumber)
    {
        studentDetailsService.deleteStudentDetails(regestrationNumber);
        return "Deleted";
    }
     
}

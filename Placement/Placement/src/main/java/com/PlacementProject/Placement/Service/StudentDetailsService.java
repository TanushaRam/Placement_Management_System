package com.PlacementProject.Placement.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.StudentRegestration;
import com.PlacementProject.Placement.Repository.StudentDetailsRepository;

@Service
public class StudentDetailsService {
    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public Optional<StudentRegestration> getStudentDetailsById(String regestrationNumber) {
   
          Optional<StudentRegestration> studentRegestration=studentDetailsRepository.findByRegestrationNumber(regestrationNumber);

        return studentRegestration;
    }

    public List<StudentRegestration> getAllStudentDetails() {

        List<StudentRegestration> studentRegestration=studentDetailsRepository.findAll();

        return studentRegestration;
    }

   public String updateStudentDetails(String regestrationNumber, StudentRegestration studentRegestration) {
    Optional<StudentRegestration> sOptional = studentDetailsRepository.findByRegestrationNumber(regestrationNumber);
    if (sOptional.isPresent()) {
        StudentRegestration stu = sOptional.get();
        stu.setFirstName(studentRegestration.getFirstName());
        stu.setLastName(studentRegestration.getLastName());
        stu.setRegestrationNumber(studentRegestration.getRegestrationNumber());
        stu.setEmailId(studentRegestration.getEmailId());
        stu.setPhoneNumber(studentRegestration.getPhoneNumber());
        stu.setCollege(studentRegestration.getCollege());
        stu.setBranch(studentRegestration.getBranch());
        stu.setTenthpercentage(studentRegestration.getTenthpercentage());
        stu.setInterpercentage(studentRegestration.getInterpercentage());
        stu.setBtechpercentage(studentRegestration.getBtechpercentage());
        studentDetailsRepository.save(stu);
        return "Updated";
    } else {
        return "Student not found";
    }
}

public void deleteStudentDetails(String regestrationNumber) {

     studentDetailsRepository.deleteByRegestrationNumber(regestrationNumber);
}
}

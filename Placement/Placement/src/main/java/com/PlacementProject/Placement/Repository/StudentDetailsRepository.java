package com.PlacementProject.Placement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementProject.Placement.Model.StudentRegestration;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentRegestration,Long>{

    public Optional<StudentRegestration> findByRegestrationNumber(String regestrationNumber);

    public void deleteByRegestrationNumber(String regestrationNumber);
    
}

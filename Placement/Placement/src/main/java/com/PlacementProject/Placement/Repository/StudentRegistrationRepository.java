package com.PlacementProject.Placement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementProject.Placement.Model.StudentRegestration;
@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegestration,Long>{
    
}

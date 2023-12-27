package com.PlacementProject.Placement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementProject.Placement.Model.CompanyDetails;
@Repository
public interface CompanyRepository extends JpaRepository<CompanyDetails,Long>{

    
} 
    


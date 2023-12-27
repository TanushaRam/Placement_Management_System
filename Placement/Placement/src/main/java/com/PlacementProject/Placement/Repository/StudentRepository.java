package com.PlacementProject.Placement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementProject.Placement.Model.CompanyDetails;
import com.PlacementProject.Placement.Model.StudentRegestration;

@Repository
public interface StudentRepository extends JpaRepository<CompanyDetails,Long> {

    public CompanyDetails findByCompanyName(String companyName);

    public void save(StudentRegestration studentRegestration);


}
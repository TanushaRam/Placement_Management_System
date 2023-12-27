package com.PlacementProject.Placement.Service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.CompanyDetails;
import com.PlacementProject.Placement.Repository.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    private  CompanyRepository companyRepository;

    public String addCompanyDetails( CompanyDetails companyDetails) {

        companyRepository.save(companyDetails);
        return "DETAILS_ARE_INSERTED";
    }

    public CompanyDetails getCompanyDetailsById(Long id) {
        return companyRepository.findById(id).get();
    }

    public List<CompanyDetails> getAllCompanyDetails() {
    
        List<CompanyDetails> details=companyRepository.findAll();

         return details;
    }

    public String updateCompanyDetails(Long id, CompanyDetails companyDetails) {

        Optional<CompanyDetails> companyDetails2=companyRepository.findById(id);
        CompanyDetails comw=companyDetails2.get();


        
           comw.setCompanyName(companyDetails.getCompanyName());

          comw.setLocation(companyDetails.getLocation());
        
           comw.setDescription(companyDetails.getDescription());
       
           comw.setSalary(companyDetails.getSalary());
       
           comw.setStudentsRequired(companyDetails.getStudentsRequired());
        
        
        companyRepository.save(companyDetails); 

        return "Updated";
    }

    public String deletecompanyDetails(Long id) {
        companyRepository.deleteById(id);
        return "deleted";
    }






}

package com.PlacementProject.Placement.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementProject.Placement.Model.CompanyDetails;
import com.PlacementProject.Placement.Service.CompanyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Company")
public class CompanyController {
   

    @Autowired
    private CompanyService companyService;

    @PostMapping("/addCompany")
    public String addComapanyDetails(@Valid @RequestBody CompanyDetails companyDetails)
    {
        return companyService.addCompanyDetails(companyDetails);
    }
     @GetMapping("/getDetails/{CompanyId}")
    public CompanyDetails getCompanyDetailsById(@PathVariable("CompanyId") Long id)
    {
        return companyService.getCompanyDetailsById(id);
    }
    @GetMapping("/getAllCompanyDetails")
    public List<CompanyDetails> getAllCompanyDetails()
    {
        return companyService.getAllCompanyDetails();
    }
    @PutMapping("/updateCompanyDetails/{id}")
    public String updateCompanyDetails( @PathVariable("id")Long id ,@RequestBody CompanyDetails companyDetails)
    {
        return companyService.updateCompanyDetails(id,companyDetails);
    }
    
    @DeleteMapping("/deleteCompanyDetails/{id}")
    public String deletecompanyDetails(@PathVariable("id")Long id)
    {
        return companyService.deletecompanyDetails(id);
    }

    
    
}
    


package com.PlacementProject.Placement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="company")
public class CompanyDetails {

    @Id
    private Long id;
   @NotBlank(message = "PLEASE ENTER THE COMPANY NAME")
    private String companyName;
    private String location;
    @Column(length = 1000)
    private String description;
    
    private String salary;
    
    private String date;
    
    private String studentsRequired;

    
}

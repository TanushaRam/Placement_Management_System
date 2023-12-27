package com.PlacementProject.Placement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
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
@Table(name = "StudentRegestration")
public class StudentRegestration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String firstName;
    private String lastName;
     @NotBlank(message = "Regetration Number is required")
    private String regestrationNumber;
    @Email(message = "Email should be valid")
    private String emailId;
    private String phoneNumber;
    private String college;
    private String branch;
    private String tenthpercentage;
    private String interpercentage;
    private String btechpercentage;

    
}

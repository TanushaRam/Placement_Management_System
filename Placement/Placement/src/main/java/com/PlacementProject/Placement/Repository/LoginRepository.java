package com.PlacementProject.Placement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementProject.Placement.Model.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{

    public Login findByUsernameAndPassword(String username,String password);
   
} 

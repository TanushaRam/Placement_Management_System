package com.PlacementProject.Placement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementProject.Placement.Model.Login;
import com.PlacementProject.Placement.Repository.LoginRepository;
@Service
public class LoginService {
     @Autowired
    private LoginRepository loginRepository;

    public Login Loginn(String username, String password) {

        Login login=loginRepository.findByUsernameAndPassword(username,password);
        return login;
    }
    
}

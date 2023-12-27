package com.PlacementProject.Placement.Controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.PlacementProject.Placement.Model.Login;
import com.PlacementProject.Placement.Service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {

    @Autowired
    private LoginService loginService;
    @GetMapping("/{username}/{password}")
  public String Loginn(@PathVariable("username")String username,@PathVariable("password")String password)
    {
        
        Login login=loginService.Loginn(username,password);
        if(Objects.nonNull(login))
        {
            return "Login";
        }
        else
        {
            return "error";
        }
    }
    
}

package com.surveyor.surveyorwebservice.Controller;

import com.surveyor.surveyorwebservice.DO.User;
import com.surveyor.surveyorwebservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @param: none
 * @description: user controller
 * @author: KingJ
 * @create: 2018-11-28 00:54
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getinfo/{id}")
    public User userList(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    @GetMapping("/signIn/{name}")
    public User signIn(@PathVariable("name") String name,
                      @RequestParam("password") String password) {
        return userService.findByNameAndPassword(name, password);
    }

}

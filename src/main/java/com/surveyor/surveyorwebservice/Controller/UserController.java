package com.surveyor.surveyorwebservice.Controller;

import com.surveyor.surveyorwebservice.DO.User;
import com.surveyor.surveyorwebservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @param: none
 * @description: user controller
 * @author: KingJ
 * @create: 2018-11-28 00:54
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String userList(){
        return "user";
    }

    @GetMapping("/login")
    public String index(){
        return "login";
    }

    @ResponseBody
    @GetMapping("/getinfo/{id}")
    public User userList(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    @GetMapping("/signIn")
    public String signIn(@RequestParam("name") String name,
                       @RequestParam("password") String password,
                       Model model) {
        User user = userService.findByNameAndPassword(name, password);
        model.addAttribute("user", user);
        return "user";
    }

    @ResponseBody
    @GetMapping("/update")
    public User changePassword(@RequestParam("id") Integer id,
                                 @RequestParam("name") String name) {
        userService.updatePassword(id, name);
        User user = userService.findOne(id);
        return user;
    }

}

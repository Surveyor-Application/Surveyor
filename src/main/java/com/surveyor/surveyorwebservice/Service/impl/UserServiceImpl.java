package com.surveyor.surveyorwebservice.Service.impl;

import com.surveyor.surveyorwebservice.Bean.User;
import com.surveyor.surveyorwebservice.Repository.UserRepository;
import com.surveyor.surveyorwebservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: KingJ
 * @create: 2018-11-23 20:52
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Integer id){return userRepository.findById(id).get();}

    @Override
    public List<User> findByOrderId(Integer oId){return userRepository.findByOrderId(oId);}

    @Override
    public List<User> findAllUser(){return userRepository.findAll();}

    @Override
    public User findByName(String name){return userRepository.findByName(name);}

    @Override
    public User findByNameAndPassword(String name, String password){
        return userRepository.findByNameAndPassword(name, password);
    }

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    @Override
    public void updatePassword(User user) {
        userRepository.save(user);
    }
}

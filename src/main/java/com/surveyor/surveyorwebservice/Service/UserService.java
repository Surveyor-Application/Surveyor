package com.surveyor.surveyorwebservice.Service;

import com.surveyor.surveyorwebservice.Bean.User;

import java.util.List;

public interface UserService {

    User findOne(Integer id);

    List<User> findAllUser();

    User findByName(String name);

    List<User> findByOrderId(Integer oId);

    User findByNameAndPassword(String name, String password);

    User createUser(User user);

    void deleteUser(Integer id);

    void updatePassword(User user);
}

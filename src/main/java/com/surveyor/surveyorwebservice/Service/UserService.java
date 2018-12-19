package com.surveyor.surveyorwebservice.Service;

import com.surveyor.surveyorwebservice.DO.User;

import java.util.List;

public interface UserService {

    User findOne(Integer id);

    List<User> findAllUser();

    User findByName(String name);

    User findByNameAndPassword(String name, String password);

    User createUser(User user);

    void deleteUser(Integer id);

    void updatePassword(User user);
}

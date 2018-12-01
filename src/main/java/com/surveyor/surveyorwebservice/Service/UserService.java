package com.surveyor.surveyorwebservice.Service;

import com.surveyor.surveyorwebservice.DO.User;

public interface UserService {

    User findOne(Integer id);

    User findByNameAndPassword(String name, String password);

    User createUser(User user);

    void deleteUserById(Integer id);
}

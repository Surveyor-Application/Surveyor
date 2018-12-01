package com.surveyor.surveyorwebservice.Repository;

import com.surveyor.surveyorwebservice.DO.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @param: none
 * @description: 对数据库中User表进行操作
 * @author: KingJ
 * @create: 2018-11-17 17:15
 **/
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNameAndPassword(String name, String password);
}

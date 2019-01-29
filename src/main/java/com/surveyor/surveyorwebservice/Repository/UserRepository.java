package com.surveyor.surveyorwebservice.Repository;

import com.surveyor.surveyorwebservice.Bean.User;
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

    User findByName(String name);

    List<User> findByOrderId(Integer oId);

//    @Query(value = "update user set name=?2 where id=?1", nativeQuery = true)
//    @Modifying
//    public void updatePassword(@Param(value="id") Integer id, @Param(value="name") String name);
}

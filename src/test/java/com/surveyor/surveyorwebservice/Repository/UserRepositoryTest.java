package com.surveyor.surveyorwebservice.Repository;

import com.surveyor.surveyorwebservice.DO.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void findOneTest(){
        User user = repository.findById(1).get();
        System.out.println(user.toString());
    }

    @Test
    public void saveTest(){
        User user = new User("789", "789");
        User result = repository.save(user);
        Assert.assertNotNull(result);
    }

    @Test
    public void deleteTest(){
        repository.deleteById(3);
    }

    @Test
    public void findByNameTest() {
        User result = repository.findByNameAndPassword("123","123");
        Assert.assertNotNull(result);
    }
}
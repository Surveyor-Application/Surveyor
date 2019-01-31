package com.surveyor.surveyorwebservice.Service.impl;

import com.surveyor.surveyorwebservice.DAO.AnswerDAO;
import com.surveyor.surveyorwebservice.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description:
 * @author: KingJ
 * @create: 2019-01-29 18:10
 **/
@Service
public class AnswerServiceImpl implements AnswerService {

    /**
     *
     * @Autowired注解: 在Service层自动装配Spring工厂中创建的DAO类
     * Impl中重写Service的接口方法，主要是调用DAO层的方法实现数据库操作
     * Service在简单的业务逻辑下不必要，但设计复杂的场景下需要（涉及到事务控制、AOP切面编程等）
     * 总的来说，DAO层负责数据库操作，Service负责业务逻辑，Controller负责控制前端请求转发
     *
     **/

    @Autowired
    private AnswerDAO answerDAO;

    @Override
    public void saveAnswer(Integer surid, Integer queid, String answer){
        answerDAO.saveAnswer(surid, queid, answer);
    }
}

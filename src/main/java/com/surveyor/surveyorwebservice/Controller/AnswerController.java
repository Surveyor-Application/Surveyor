package com.surveyor.surveyorwebservice.Controller;

import com.surveyor.surveyorwebservice.Bean.Answer;
import com.surveyor.surveyorwebservice.Service.impl.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @param: none
 * @description: Answer Controller
 * @author: KingJ
 * @create: 2019-01-29 18:21
 **/
@RestController
@RequestMapping("/answer")
public class AnswerController {

    /**
     *
     * 因为是纯后端项目，所以用@RestController注解将所有数据返回格式统一成json格式
     * Controller层收到前端url请求并转发给相应方法
     * @RequestMapping: 表示与前端请求对应的url，即通过这个格式的url：localhost:8080/answer/insert 才能访问到相应的保存answer的方法
     * @RequestParam: 表示前端发来的请求url中带的参数
     * 调用Service层完成相应操作
     *
     **/

    @Autowired
    AnswerServiceImpl answerService;

    @PostMapping("/insert")
    public void SaveAnswer(@RequestBody Answer answer){
        answerService.saveAnswer(answer.getSurid(), answer.getQueid(), answer.getContent());
    }
}

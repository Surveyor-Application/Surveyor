package com.surveyor.surveyorwebservice.Controller;

import com.surveyor.surveyorwebservice.Bean.Question;
import com.surveyor.surveyorwebservice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @param: none
 * @description:
 * @author: KingJ
 * @create: 2019-02-05 15:10
 **/
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/list")
    List<Question> queryQuestionList(@RequestParam("surid")Integer surid) {
        List<Question> questionList = questionService.queryQuesitonList(surid);

        return questionList;
    }
}

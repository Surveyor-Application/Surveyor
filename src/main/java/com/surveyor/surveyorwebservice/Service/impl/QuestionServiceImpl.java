package com.surveyor.surveyorwebservice.Service.impl;

import com.surveyor.surveyorwebservice.Bean.Question;
import com.surveyor.surveyorwebservice.DAO.QuestionDAO;
import com.surveyor.surveyorwebservice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param: none
 * @description:
 * @author: KingJ
 * @create: 2019-02-05 15:04
 **/
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO questionDAO;

    @Override
    public List<Question> queryQuesitonList(Integer surid) {
        return questionDAO.queryQuestionList(surid);
    }
}

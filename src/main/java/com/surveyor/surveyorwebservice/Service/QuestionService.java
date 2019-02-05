package com.surveyor.surveyorwebservice.Service;

import com.surveyor.surveyorwebservice.Bean.Question;

import java.util.List;

public interface QuestionService {

    List<Question> queryQuesitonList(Integer surid);
}

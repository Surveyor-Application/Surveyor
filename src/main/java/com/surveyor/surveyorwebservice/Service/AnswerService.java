package com.surveyor.surveyorwebservice.Service;

public interface AnswerService {

    /**
     *
     * Service层需要Service接口和ServiceImp类（我也不知道为什么，按套路来的一直是。。
     * 在Service层声明方法，在Impl层Override
     * 只有Impl层需要@Service注解
     *
     **/
    void saveAnswer(String answer, Integer surid, Integer queid);
}

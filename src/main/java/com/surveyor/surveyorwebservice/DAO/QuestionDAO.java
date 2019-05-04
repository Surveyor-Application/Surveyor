package com.surveyor.surveyorwebservice.DAO;

import com.surveyor.surveyorwebservice.Bean.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionDAO {

    @Select("SELECT sequence, content FROM question WHERE surid = #{surid}")
    List<Question> queryQuestionList(@Param("surid")Integer surid);
}

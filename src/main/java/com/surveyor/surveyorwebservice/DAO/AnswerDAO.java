package com.surveyor.surveyorwebservice.DAO;

import org.apache.ibatis.annotations.*;

/**
 * @param: none
 * @description: 对数据库中User表进行操作
 * @author: KingJ
 * @create: 2018-11-17 17:15
 **/
@Mapper
public interface AnswerDAO {

    /**
     *
     * DAO层即原来的Repository层，Mybatis所有数据库操作在DAO层完成，需要写原生sql语句
     * sql语句： insert
     * sql教程参见菜鸟教程 sql 部分
     * 大写部分是insert的sql语句格式，小写部分VALUES之前是表名以及字段名，之后是前端传过来的参数值
     * 传过来的参数格式参见第二行的括号中的格式，需要加注解@Param
     *
     **/
    @Insert("INSERT INTO answer(surid, queid, content) VALUES(#{surid}, #{queid}, #{answer}")
    void saveAnswer(@Param("answer")String answer, @Param("surid")Integer surid, @Param("queid")Integer queid);
}

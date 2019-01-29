package com.surveyor.surveyorwebservice.Bean;

/**
 * @param: none
 * @description: 对应数据表的问卷Answer类
 * @author: KingJ
 * @create: 2019-01-29 16:10
 **/
public class Question {

    private Integer id;
    /** 属于哪一个问卷的id */
    private Integer surid;
    /** 题目序号 */
    private Integer sequence;
    /** 题目内容 */
    private String content;
    /** 题目类型 */
    private String type;
    /** 是否为必答题 */
    private Integer must;
    /** 存下一道题目的id */
    private Integer next;
    /** 选项a内容 */
    private String choicea;
    /** 选项b内容 */
    private String choiceb;
    /** 选项c内容 */
    private String choicec;
    /** 选项d内容 */
    private String choiced;
    /** 选项e内容 */
    private String choicee;
}

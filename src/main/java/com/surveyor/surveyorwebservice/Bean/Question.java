package com.surveyor.surveyorwebservice.Bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @param: none
 * @description: 对应数据表的问卷Answer类
 * @author: KingJ
 * @create: 2019-01-29 16:10
 **/
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    /** 属于哪一个问卷的id */
    @Column(name = "surid")
    private Integer surid;

    /** 题目序号 */
    @Column(name = "sequence")
    private Integer sequence;

    /** 题目内容 */
    @Column(name = "content")
    private String content;

    /** 题目类型 */
    @Column(name = "type")
    private String type;

    /** 是否为必答题 */
    @Column(name = "must")
    private Integer must;

    /** 存下一道题目的id */
    @Column(name = "next")
    private Integer next;

    /** 选项a内容 */
    @Column(name = "choicea")
    private String choicea;

    /** 选项b内容 */
    @Column(name = "choiceb")
    private String choiceb;

    /** 选项c内容 */
    @Column(name = "choicec")
    private String choicec;

    /** 选项d内容 */
    @Column(name = "choiced")
    private String choiced;

    /** 选项e内容 */
    @Column(name = "choicee")
    private String choicee;
}

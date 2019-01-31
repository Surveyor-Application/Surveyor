package com.surveyor.surveyorwebservice.Bean;

/**
 * @param: none
 * @description: 对应数据表的问卷Answer类
 * @author: KingJ
 * @create: 2019-01-29 16:10
 **/
public class Answer {

    /**
     *
     * 准备工作！
     * pom.xml 中加入
     * <dependency>
     *     <groupId>org.mybatis.spring.boot</groupId>
     *     <artifactId>mybatis-spring-boot-starter</artifactId>
     *     <version>1.3.2</version>
     * </dependency>
     * 并重新导入：右键pom.xml → Maven → Reimport
     * yml中只改你们自己的用户名，其他的配置和我一样就ok
     *
     **/

    private Integer id;
    /** 该答案属于哪个问卷 */
    private Integer surid;
    /** 该答案回答的是这张问卷哪一道问题的 */
    private Integer queid;
    /** 答案序号。。也许没什么用 */
    private Integer sequence;
    /** 作答内容 */
    private String content;
    /** 作答者是谁 */
    private Integer uid;

}

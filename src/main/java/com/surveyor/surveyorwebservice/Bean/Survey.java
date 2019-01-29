package com.surveyor.surveyorwebservice.Bean;

import java.util.Date;

/**
 * @param: none
 * @description: 对应数据表的问卷Survey类
 * @author: KingJ
 * @create: 2019-01-29 15:23
 **/
public class Survey {

    private Integer id;
    /** 用户id */
    private Integer uid;
    /** 题数 */
    private Integer num;
    /** 悬赏金额 */
    private Double price;
    /** 需要的问卷数 */
    private Integer need;
    /** 回收的问卷数 */
    private Integer get;
    /** 问卷的状态：已发布/待发布/已结束 */
    private String status;
    /** 问卷标题 */
    private String title;
    /** 发布者的微信账号 */
    private Integer wid;
    /** 记录多少人赞过这张问卷 */
    private Integer like;
    /** 发布时间 */
    private Date time;

}

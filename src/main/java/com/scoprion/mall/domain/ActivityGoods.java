package com.scoprion.mall.domain;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author by kunlun
 * @created on 2017/11/8.
 */
public class ActivityGoods extends Goods {

    /**
     * 主键
     */
    private Long id;

    /**
     * 活动ID
     */
    @JSONField(name = "activity_id")
    private Long activityId;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动类型
     */
    @JSONField(name = "activity_type")
    private String activityType;
    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "create_date")
    private Date createDate;

    /**
     * 商品ID
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * 商品库存
     */
    private int stock;
    /**
     * 0正常，1删除
     */
    private String status;

    /**
     * 活动人数
     */
    private Integer num;

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ActivityGoods{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", name='" + name + '\'' +
                ", activityType='" + activityType + '\'' +
                ", createDate=" + createDate +
                ", goodId=" + goodId +
                ", stock=" + stock +
                ", status='" + status + '\'' +
                ", num=" + num +
                '}';
    }
}

package com.jhmarryme.pojo;

import javax.persistence.*;

public class Coder {
    @Id
    private Integer id;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "rotation_order")
    private Integer rotationOrder;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return rotation_order
     */
    public Integer getRotationOrder() {
        return rotationOrder;
    }

    /**
     * @param rotationOrder
     */
    public void setRotationOrder(Integer rotationOrder) {
        this.rotationOrder = rotationOrder;
    }
}
package com.qtu404.sirius.model;

import lombok.Data;

/**
 * @author DingXing wb-dx470808@alibaba-inc.com
 * @date 2019/3/4 上午10:28
 */
public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

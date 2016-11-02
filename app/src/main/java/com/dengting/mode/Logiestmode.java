package com.dengting.mode;

import java.io.Serializable;

/**
 * Created by dengting on 2016/11/2.
 */

public class Logiestmode  implements Serializable{
    private String name;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

package com.dengting.mode;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dengting on 2016/11/2.
 */

public class MyDate<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public String id;
    public String type;
    public List Logiestmodelist;
    public Logiestmode Logiestmode;//多种类型数据，一般是List集合，比如获取所有员工列表
}

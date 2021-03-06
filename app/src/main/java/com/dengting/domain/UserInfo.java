package com.dengting.domain;

import java.io.Serializable;

/**
 * Created by dengting on 2017/7/26.
 */

public class UserInfo implements Serializable {

    private long id;
    /**
     * 用户帐号
     */
    private String userName;
    /**
     * 用户密码
     */
    private String passWord;
    /**
     * 用户姓名
     */
    private String realName;

    /**
     * 所属岗位（角色编号，之间用逗号隔开）
     */
    private String roleIDs;
    /**
     * 所属职位【暂不使用】
     */
    private String position;
    /**
     * 联系方式
     */
    private String tel;
    /**
     * 手机号码
     */
    private String phoneNo;
    /**
     * email
     */
    private String email;
    /**
     * 描述信息
     */
    private String rmk;
    /**
     * 状态
     */
    private String status;
    /**
     * 是否删除（1：删除；0：没有删除）
     */
    private String isDeleted;
    /**
     * 注册时间
     */
    private String addTime;

    private String mmsi;
    /**
     * 验证码
     */
    private String code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRoleIDs() {
        return roleIDs;
    }

    public void setRoleIDs(String roleIDs) {
        this.roleIDs = roleIDs;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRmk() {
        return rmk;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

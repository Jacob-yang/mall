package com.xy.model;

public class User {
    /**
     * 对应数据库 user.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 user.login_name
     * 登录名
     */
    private String loginName;

    /**
     * 对应数据库 user.password
     * 密码
     */
    private String password;

    /**
     * 对应数据库 user.status
     * 状态 默认1：正常 2：封禁
     */
    private Integer status;

    private Integer role;

    private String roleName;

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
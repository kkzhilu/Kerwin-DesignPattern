package com.design.template.work;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/9 0:20
 * description:  SSOConfig
 * version:      V1.0
 * ******************************
 */
public class SSOConfig {

    private String implClassName;

    private String loginUrl;

    private String userUrl;

    private String logoutUrl;

    private String callBackUrl;

    public String getImplClassName() {
        return implClassName;
    }

    public void setImplClassName(String implClassName) {
        this.implClassName = implClassName;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}

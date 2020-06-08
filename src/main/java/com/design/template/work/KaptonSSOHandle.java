package com.design.template.work;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/9 0:27
 * description:  凯通SSO
 * version:      V1.0
 * ******************************
 */
public class KaptonSSOHandle implements SSOContextAnalysis{

    @Override
    public void toLogin(SSOConfig ssoConfig) {

    }

    @Override
    public Object getToken(SSOConfig ssoConfig) {
        return null;
    }

    @Override
    public String getUserInfo(SSOConfig ssoConfig, Object arg) {
        return null;
    }

    @Override
    public String getAccount(SSOConfig ssoConfig, Object userInfo) {
        return null;
    }

    @Override
    public boolean tologout(SSOConfig ssoConfig) {
        return false;
    }
}

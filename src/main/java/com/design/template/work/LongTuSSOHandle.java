package com.design.template.work;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/9 0:21
 * description:  龙图SSO
 * version:      V1.0
 * ******************************
 */
public class LongTuSSOHandle implements SSOContextAnalysis{

    @Override
    public void toLogin(SSOConfig ssoConfig) {
        // 跳转SSO鉴权地址, 配置回调地址
    }

    @Override
    public Object getToken(SSOConfig ssoConfig) {
        // 根据客户的加密算法等获取Token信息
        return null;
    }

    @Override
    public String getUserInfo(SSOConfig ssoConfig, Object arg) {
        // 组装报文, 发起用户请求, 获取用户数据
        return null;
    }

    @Override
    public String getAccount(SSOConfig ssoConfig, Object userInfo) {
        // 基于用户数据, 获取本平台用户数据, 完成SSO流程
        return null;
    }

    @Override
    public boolean tologout(SSOConfig ssoConfig) {
        // 根据退出地址进行退出操作等等
        return false;
    }
}

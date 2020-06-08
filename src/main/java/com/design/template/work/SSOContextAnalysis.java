package com.design.template.work;


public interface SSOContextAnalysis {

    /** 跳转登录*/
    void toLogin(SSOConfig ssoConfig);

    /** 获取token */
    Object getToken(SSOConfig ssoConfig);

    /***
     * 获取用户信息
     * @param ssoConfig 配置
     * @return 用户信息加密串
     */
    String getUserInfo(SSOConfig ssoConfig, Object arg);

    /***
     * 解析sso context
     * @return user name
     */
    String getAccount(SSOConfig ssoConfig, Object userInfo);

    /** 进行退出 */
    boolean tologout(SSOConfig ssoConfig);
}

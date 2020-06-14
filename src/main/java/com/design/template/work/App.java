package com.design.template.work;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/9 0:24
 * description:  App
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * PS: 公司代码不方便直接公布, 仅仅提供一个思路，如果需要细聊可以根据ReadMe加我好友
     *
     * 推荐阅读顺序：
     *
     * @see SSOContextAnalysis
     * @see LongTuSSOHandle
     * @see KaptonSSOHandle
     */
    public static void main(String[] args) {
        // 可以使用方便的方式构建实现类, 比如我们公司使用的是数据库配置 + CGLIB（代理）
        SSOContextAnalysis sso = new LongTuSSOHandle();

        // Do AnyThings...
    }
}

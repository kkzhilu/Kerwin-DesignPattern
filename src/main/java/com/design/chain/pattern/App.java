package com.design.chain.pattern;


import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:19
 * description:  责任链模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 责任链模式
     *     责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦
     *     这种类型的设计模式属于行为型模式,在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推
     *
     * 多种形式
     *     A. 当前pattern下类似日志级别形式, 只要等级比A大，那B,C都会处理
     *     B. 如A->B->C 由低到高级别执行，只要执行就返回等
     *     最高级形式: 低级发起请求后, 高级任一处理后，请求反馈即可(涉及到异步相关,线程通信)
     *
     * 主要解决
     *     职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了
     * 何时使用
     *     在处理消息的时候以过滤很多道
     * 如何解决
     *     拦截的类都实现统一接口
     *
     * 优点
     *     1、降低耦合度。它将请求的发送者和接收者解耦
     *     2、简化了对象。使得对象不需要知道链的结构
     *     3、增强给对象指派职责的灵活性，通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任
     *     4、增加新的请求处理类很方便
     *
     * 缺点
     *     1、不能保证请求一定被接收
     *     2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用
     *     3、可能不容易观察运行时的特征，有碍于除错
     *
     * 使用场景
     *     1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定
     *     2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求
     *     3、可动态指定一组对象处理请求
     *
     * 实际应用
     *     如拦截器,日志级别打印等
     */
    public static void main(String[] args){
        AbstractLogger log = getChainOfLoggers();
        log.logMessage(AbstractLogger.INFO, "i am info");

        CodeUtils.spilt();

        log.logMessage(AbstractLogger.DEBUG, "i am debug");

        CodeUtils.spilt();

        log.logMessage(AbstractLogger.ERROR, "i am error");
    }

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger error = new ErrorLoger(AbstractLogger.ERROR);
        AbstractLogger debug = new DebugLoger(AbstractLogger.DEBUG);
        AbstractLogger info = new InfoLoger(AbstractLogger.INFO);

        error.setNextLogger(debug);
        debug.setNextLogger(info);
        return error;
    }
}

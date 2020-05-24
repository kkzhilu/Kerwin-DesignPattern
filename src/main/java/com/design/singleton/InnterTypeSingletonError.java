package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 10:29
 * description:  单例模式之静态内部类 神奇报错
 * version:      V1.0
 * ******************************
 */
public class InnterTypeSingletonError {

    private InnterTypeSingletonError(){
        System.out.println(5 / 0);
    }

    private static class SingletonHolder{
        private final static InnterTypeSingletonError app = new InnterTypeSingletonError();
    }

    static InnterTypeSingletonError getInstance(){
        System.out.println("APP - 静态内部类方式(Holder)");
        return SingletonHolder.app;
    }

    public static void main(String[] args){
        try {
            InnterTypeSingletonError.getInstance();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        try {
            InnterTypeSingletonError.getInstance();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

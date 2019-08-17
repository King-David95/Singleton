package com.study.singleton;

/**
 * 恶汉式
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton01 {

    /**
     * 定义静态实例对象，类加载时会初始化
     */
    private static Singleton01 instance = new Singleton01();

    /**
     * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
     */
    private Singleton01() {
    }

    /**
     * 提供唯一实例全局访问的方法（线程安全）
     *
     * @return 实例
     */
    public static Singleton01 getInstance() {
        return instance;
    }

}

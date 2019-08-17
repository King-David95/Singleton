package com.study.singleton;

/**
 * 懒汉式
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton02 {

    /**
     * 定义静态实例对象，但不初始化
     */
    private static Singleton02 instance = null;

    /**
     * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
     */
    private Singleton02() {
    }

    /**
     * 提供唯一实例全局访问的方法（线程非安全）
     *
     * @return 实例
     */
    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

}

package com.study.singleton;

/**
 * Double Check + volatile
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton05 {

    /**
     * 定义静态实例对象，但不初始化，声明volatile保证有序性（禁止指令重排优化）
     */
    private static volatile Singleton05 instance = null;

    /**
     * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
     */
    private Singleton05() {
    }

    /**
     * 提供唯一实例全局访问的方法（线程安全）
     *
     * @return 实例
     */
    public static Singleton05 getInstance() {
        //当且仅当instance==null时，才会进入同步块
        if (instance == null) {
            //只有一个线程能够进入同步块
            synchronized (Singleton05.class) {
                //再次判断instance==null时，创建对象
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}

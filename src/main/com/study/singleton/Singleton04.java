package com.study.singleton;

/**
 * 懒汉式 + Double Check
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton04 {

    /**
     * 定义静态实例对象，但不初始化
     */
    private static Singleton04 instance = null;

    /**
     * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
     */
    private Singleton04() {
    }

    /**
     * 提供唯一实例全局访问的方法（线程非安全）
     *
     * @return 实例
     */
    public static Singleton04 getInstance() {
        //当且仅当instance==null时，才会进入同步块
        if (instance == null) {
            //只有一个线程能够进入同步块
            synchronized (Singleton04.class) {
                //再次判断instance==null时，创建对象
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }

}

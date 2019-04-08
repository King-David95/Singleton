package com.study.singleton;

/**
 * 懒汉式 + synchronized
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton03 {

	/**
	 * 定义静态实例对象，但不初始化
	 */
	private static Singleton03 instance = null;

	/**
	 * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
	 */
	private Singleton03() {
	}

	/**
	 * 提供唯一实例全局访问的方法（线程安全）
	 *
	 * @return 实例
	 */
	public synchronized static Singleton03 getInstance() {
		if (instance == null) {
			instance = new Singleton03();
		}
		return instance;
	}

}

package com.study.singleton;

/**
 * 懒汉式 + 内部类 Holder（推荐）
 *
 * @author song_wei
 * @date 2019-04-08
 */
public final class Singleton06 {

	/**
	 * 在静态内部类中持有Singleton对象
	 */
	private static class Holder {
		private static Singleton06 INSTANCE = new Singleton06();
	}

	/**
	 * 私有构造方法，不允许外部类直接new对象（但是可通过反射）
	 */
	private Singleton06() {
	}

	/**
	 * 提供唯一实例全局访问的方法（线程安全）
	 *
	 * @return 实例
	 */
	public static Singleton06 getInstance() {
		return Holder.INSTANCE;
	}

}

package com.study.singleton;

/**
 * 恶汉式 + 枚举（推荐）
 *
 * @author song_wei
 * @date 2019-04-08
 */
public enum Singleton07 {

	/**
	 * 全局唯一实例（线程安全，且无法通过反射创建对象，会报错）
	 */
	INSTANCE;

}

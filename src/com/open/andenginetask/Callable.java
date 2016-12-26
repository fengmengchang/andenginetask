/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:25:48
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.andenginetask;

/**
 ***************************************************************************************************************************************************************************** 
 * 回调接口,回调方法运行于异步线程
 * 
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:25:48
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public interface Callable<T> {
	/**
	 * 请求预加载 同于AsyncTask的doInBackground
	 * @return
	 * @throws Exception
	 */
	public T call() throws Exception;
}

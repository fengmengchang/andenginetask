/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:26:34
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.andenginetask;

/**
 ***************************************************************************************************************************************************************************** 
 *  观察者  
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:26:34
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public interface IProgressListener {
	/**
	 * 进度发生改变的时候调用
	 * 
	 * @param pProgress
	 */
	public void onProgressChanged(final int pProgress);
}

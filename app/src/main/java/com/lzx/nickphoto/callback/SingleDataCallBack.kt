package com.lzx.nickphoto.callback

/**
 * Created by lzx on 2017/7/5.
 */
interface SingleDataCallBack<T> : BaseDataCallBack {
    fun OnSuccess(result: T)
}
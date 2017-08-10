package com.supermario.saber.okhttplibrary.interfaze;

/**
 * Created by saber on 2017/8/9.
 */

public interface IOkHttpUploadcallback extends IOkHttpUpdate{
    /**
     * 显示进度
     * @param bytesRead 当前读取进度
     * @param contentLength 总进度
     * @param done 是否完成
     */
    @Override
    public void onUpdate(long bytesRead, long contentLength, boolean done);

    /**
     * 加载失败
     */
    void loadError();
    /**
     * 加载成功
     */
    void onLoadSuccess(Object object);
}

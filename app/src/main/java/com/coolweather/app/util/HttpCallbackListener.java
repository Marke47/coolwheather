package com.coolweather.app.util;

/**
 * Created by Lenovo on 2016/8/5.
 */
public interface HttpCallbackListener {
    void onFinshin(String response);

    void onError(Exception e);
}

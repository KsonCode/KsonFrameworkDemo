package com.bwie.lib_core.utils;

import android.util.Log;

import com.bwie.lib_core.common.Constants;

public class LogUtil {

    private static final String TAG = LogUtil.class.getSimpleName();

    public static void v(String msg){

        if (!Constants.IS_RELEASE){//false的时候
            Log.v(TAG,msg);
        }

    }



}

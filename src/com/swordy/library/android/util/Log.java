package com.swordy.library.android.util;

import com.swordy.library.android.BuildConfig;

public final class Log
{
    public static void d(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.d(tag, msg);
    }
    
    public static void d(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.d(tag, msg, tr);
    }
    
    public static void e(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.e(tag, msg);
    }
    
    public static void e(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.e(tag, msg, tr);
    }
    
    public static void i(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.i(tag, msg);
    }
    
    public static void i(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.i(tag, msg, tr);
    }
    
    public static void v(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.v(tag, msg);
    }
    
    public static void v(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.v(tag, msg, tr);
    }
    
    public static void w(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.w(tag, msg);
    }
    
    public static void w(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.w(tag, msg, tr);
    }
    
    public static void w(String tag, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.w(tag, tr);
    }
    
    public static void wtf(String tag, String msg)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.wtf(tag, msg);
    }
    
    public static void wtf(String tag, String msg, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.wtf(tag, msg, tr);
    }
    
    public static void wtf(String tag, Throwable tr)
    {
        if (BuildConfig.DEBUG)
            android.util.Log.wtf(tag, tr);
    }
    
}
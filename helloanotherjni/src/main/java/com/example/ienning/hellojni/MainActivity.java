package com.example.ienning.hellojni;

import android.util.Log;

/**
 * Created by ienning on 16-11-21.
 */

public class MainActivity {
    static {
        System.loadLibrary("native-lib");
    }
    public static String test() {
        //调用第三方so库的，要求这个动态库里有JNI可以调用时，
        //才可以使用System.loadLibrary()这种方法加载使用，不然就采取另外一种
        //另外一种方法是自己写一个JNI接口，然后通过dlopen()方法加载第三方so库
        Log.i("Ienning", "test: " + stringFromJNI());
        return "ok";
    }
    public native static String stringFromJNI();
}

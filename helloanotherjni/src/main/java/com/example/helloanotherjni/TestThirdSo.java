package com.example.helloanotherjni;

import android.util.Log;

/**
 * Created by ienning on 16-11-21.
 */

public class TestThirdSo {
    static {
        System.loadLibrary("JniThird-test");
    }
    public static String test() {
        TestThirdSo testThirdSo = new TestThirdSo();
        return testThirdSo.get();
    }
    public native static String get();
}

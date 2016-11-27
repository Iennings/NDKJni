//
// Created by ienning on 16-11-21.
//
#include "com_example_helloanotherjni_TestThirdSo.h"
#include <dlfcn.h>
#include <stdio.h>
JNIEXPORT jstring JNICALL Java_com_example_helloanotherjni_TestThirdSo_get
        (JNIEnv *env, jclass thiz) {
    void *handle = dlopen("/data/data/com.example.helloanotherjni/lib/libnative-lib.so", RTLD_NOW);
    if (!handle) {
        return env->NewStringUTF("not found your third so library");
    }
    char *(*testLib)() = NULL;
    testLib = (char *(*)()) dlsym(handle, "_Z7testLibv");
    if(!testLib)
    {
        return env->NewStringUTF("not found testThird method!");
    }
    return env->NewStringUTF(testLib());
}


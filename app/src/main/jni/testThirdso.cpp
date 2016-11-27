//
// Created by ienning on 16-11-20.
//
#include <stdio.h>
#include <jni.h>
#include "com_example_ienning_hellojni_MainActivity.h"

//这个函数同时是为了下面使用这个文件生成的so库后，让该so库作为第三方动态链接库时，该函数被调用的测试。
char* testLib() {
    return "testLib";
}

JNIEXPORT jstring JNICALL Java_com_example_ienning_hellojni_MainActivity_stringFromJNI
(JNIEnv *env, jobject thzz) {
    return env->NewStringUTF(testLib());
}

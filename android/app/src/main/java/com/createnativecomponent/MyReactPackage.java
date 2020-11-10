package com.createnativecomponent;


import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.facebook.react.uimanager.ViewManager;
import com.createnativecomponent.MyTextViewManager;

public class MyReactPackage implements ReactPackage {

    // 创建模块 返回类型: List<NativeModule>
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new MyTextViewManager(reactContext));
        return modules;
    }


    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.asList(
                new MyTextViewManager(reactContext)
        );
    }
}


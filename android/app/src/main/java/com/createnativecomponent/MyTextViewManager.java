package com.createnativecomponent;

import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;


// 视图管理者
public class MyTextViewManager extends SimpleViewManager<TextView> {
    ReactApplicationContext mCallerContext;

    public MyTextViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return "MyTextView";
    }

    @Override
    protected TextView createViewInstance(ThemedReactContext context) {
        TextView textView = new TextView(context);
        return textView;
    }

    @ReactProp(name = "text")
    public void setText(TextView view, String text) {
        Toast.makeText(mCallerContext, "测试:" + text, Toast.LENGTH_LONG).show();
        view.setText(text);
//        view.setHeight(100);
//        view.setWidth(100);
    }

    @ReactProp(name = "textSize")
    public void setTextSize(TextView view, float fontSize) {
        view.setTextSize(fontSize);
    }

    @ReactProp(name = "textColor", defaultInt = Color.BLACK)
    public void setTextColor(TextView view, int textColor) {
        view.setTextColor(textColor);
    }

    @ReactProp(name = "isAlpha", defaultBoolean = false)
    public void setTextAlpha(TextView view, boolean isAlpha) {
        if (isAlpha) {
            view.setAlpha(0.5f);
        }
    }

}

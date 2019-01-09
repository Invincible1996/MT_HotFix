package com.mt_hotfix;

import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.robust.patch.annotaion.Modify;

public class MyTextViewManager extends SimpleViewManager<TextView> {

    public static final String REACT_CLASS = "RCTTextView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected TextView createViewInstance(ThemedReactContext reactContext) {
        return new TextView(reactContext);
    }

    @ReactProp(name = "text")
    @Modify
    public void setText(TextView view, String text) {
        String mText = text + "123456789";
        view.setText(mText);
    }

    @ReactProp(name = "textSize", defaultFloat = 20f)
    public void setTextSize(TextView view, float size) {
        view.setTextSize(size);
    }

    @ReactProp(name = "textColor", defaultInt = 0xFF0000)
    public void setTextColor(TextView view, int color) {
        view.setTextColor(Color.BLUE);
    }

}

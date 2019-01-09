package com.mt_hotfix;

import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

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
    public void setText(TextView view, String text) {
        Log.d(REACT_CLASS, text);
        String mText = text + "1122365";
        view.setText(mText);
    }

    @ReactProp(name = "textSize", defaultFloat = 20f)
    public void setTextSize(TextView view, float size) {
        Log.d(REACT_CLASS, size + "");
        view.setTextSize(size);
    }

    @ReactProp(name = "textColor", defaultInt = 0xFF0000)
    public void setTextColor(TextView view, int color) {
        Log.d(REACT_CLASS, color + "");
        view.setTextColor(Color.BLUE);
    }

}

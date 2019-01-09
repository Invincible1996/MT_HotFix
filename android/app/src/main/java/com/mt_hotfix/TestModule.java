package com.mt_hotfix;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.mt_hotfix.robust.RobustActivity;

public class TestModule extends ReactContextBaseJavaModule {
    public TestModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Test";
    }

    @ReactMethod
    public void startActivity(){
        Intent intent = new Intent(getCurrentActivity(),RobustActivity.class);
        getCurrentActivity().startActivity(intent);
    }
}

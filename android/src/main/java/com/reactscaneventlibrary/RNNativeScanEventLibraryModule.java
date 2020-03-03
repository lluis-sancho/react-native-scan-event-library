
package com.reactscaneventlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNNativeScanEventLibraryModule extends ReactContextBaseJavaModule {
  public static final String m_Broadcastname = "com.barcode.sendBroadcast";// all logging should use this tag
  private final ReactApplicationContext reactContext;

  public RNNativeScanEventLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;

  final IntentFilter intentFilter = new IntentFilter();
  intentFilter.addAction(m_Broadcastname);
  reactContext.registerReceiver(receiver, intentFilter);
  }

  @ReactMethod
  public void test() {
    return "test hola"
    //return value
  }

  void sendEvent(String code) {
      if (this.reactContext.hasActiveCatalystInstance()) {
          this.reactContext
                  .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                  .emit("readedValue", code);
      }
  }
  @Override
  public String getName() {
    return "RNNativeScanEventLibrary";
  }

  BroadcastReceiver receiver = new BroadcastReceiver() {
    @Override
    public void onReceive(Context arg0, Intent arg1) {
      if (arg1.getAction().equals(m_Broadcastname)) {
        String str = arg1.getStringExtra("BARCODE");
        if (!"".equals(str)) {
          RNNativeScanEventLibraryModule.sendEvent(str)
        }
      }
    }
  };

}
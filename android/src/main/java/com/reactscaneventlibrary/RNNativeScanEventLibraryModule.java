
package com.reactscaneventlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNNativeScanEventLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNNativeScanEventLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;

	final IntentFilter intentFilter = new IntentFilter();
	m_Broadcastname = "com.barcode.sendBroadcast";// com.barcode.sendBroadcastScan
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
	                .emit('readedValue', code);
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
					this.code_readed = str
					RNNativeScanEventLibraryModule.sendEvent(str)
				}
			}
		}
	};

}
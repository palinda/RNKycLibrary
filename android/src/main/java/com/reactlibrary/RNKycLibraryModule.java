
package com.reactlibrary;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.ust.lib.kyclib.KycVerifyActivity;

public class RNKycLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNKycLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNKycLibrary";
  }

  @ReactMethod
  void navigateToKYCApp(String referenceID, String apiToken) {
    ReactApplicationContext context = getReactApplicationContext();
    Intent intent = new Intent(context, KycVerifyActivity.class);
    context.startActivity(intent);
  }
}
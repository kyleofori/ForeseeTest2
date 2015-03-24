package foreseetest2.detroitlabs.com.foreseetest2;

import android.app.Application;

import com.foresee.sdk.ForeSee;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ForeSee.setMaskingDebugEnabled(true);
        ForeSee.start(this);
    }
}

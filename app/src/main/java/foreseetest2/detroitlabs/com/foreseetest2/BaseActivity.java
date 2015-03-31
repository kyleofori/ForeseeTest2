package foreseetest2.detroitlabs.com.foreseetest2;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.ViewGroup;

import com.foresee.sdk.ForeSee;

public abstract class BaseActivity extends ActionBarActivity {

    @Override
    public void onStart() {
        super.onStart();
        Log.d(BaseActivity.class.getSimpleName(), "onStart");
        ForeSee.activityStarted(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(BaseActivity.class.getSimpleName(), "onPause");
        ForeSee.activityPaused(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(BaseActivity.class.getSimpleName(), "onResume");

        ForeSee.activityResumed(this);

        final ViewGroup rootViewGroup = (ViewGroup) ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);
        ForeSeeUtil.recursivelyUpdateViewMasks(rootViewGroup);
    }

}

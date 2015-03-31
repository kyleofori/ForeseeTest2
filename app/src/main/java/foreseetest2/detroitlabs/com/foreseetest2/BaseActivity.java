package foreseetest2.detroitlabs.com.foreseetest2;

import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;

import com.foresee.sdk.ForeSee;

public class BaseActivity extends ActionBarActivity {

    @Override
    public void onStart() {
        super.onStart();
        ForeSee.activityStarted(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        ForeSee.activityPaused(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        ForeSee.activityResumed(this);

        final ViewGroup rootViewGroup = (ViewGroup) ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);
        ForeSeeUtil.recursivelyUpdateViewMasks(rootViewGroup);
    }

}

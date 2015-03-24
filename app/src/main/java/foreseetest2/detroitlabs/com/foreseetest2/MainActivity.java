package foreseetest2.detroitlabs.com.foreseetest2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.foresee.sdk.ForeSee;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // if I build without this line, there's no crash, but the EditText also seems not to be masked by default...
        ForeSee.maskView(findViewById(R.id.maskEditText));
    }

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
    }

}

package foreseetest2.detroitlabs.com.foreseetest2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

import com.foresee.sdk.ForeSee;

public class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ForeSee.registerFragmentView(getView());
    }

    @Override
    public void onResume() {
        super.onResume();

        final ViewGroup rootViewGroup = (ViewGroup) getView();
        ForeSeeUtil.recursivelyUpdateViewMasks(rootViewGroup);
    }

}

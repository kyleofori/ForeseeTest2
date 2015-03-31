package foreseetest2.detroitlabs.com.foreseetest2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foresee.sdk.ForeSee;

public class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);
        ForeSee.registerFragmentView(v);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

        final ViewGroup rootViewGroup = (ViewGroup) getView();
        ForeSeeUtil.recursivelyUpdateViewMasks(rootViewGroup);
    }

}

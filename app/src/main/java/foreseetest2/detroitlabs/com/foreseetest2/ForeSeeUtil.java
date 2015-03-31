package foreseetest2.detroitlabs.com.foreseetest2;

import android.view.View;
import android.view.ViewGroup;

public class ForeSeeUtil {

    public static void recursivelyUpdateViewMasks(final ViewGroup viewGroup) {
        if (viewGroup instanceof MaskableView) {
            ((MaskableView) viewGroup).refreshMask();
        }

        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            final View child = viewGroup.getChildAt(i);

            if (child instanceof ViewGroup) {
                recursivelyUpdateViewMasks((ViewGroup) child);
            } else if (child instanceof MaskableView) {
                ((MaskableView) child).refreshMask();
            }
        }
    }

}

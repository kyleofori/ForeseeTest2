package foreseetest2.detroitlabs.com.foreseetest2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.foresee.sdk.ForeSee;

public class MaskableTextView extends TextView implements MaskableView {

    public MaskableTextView(Context context) {
        super(context);
    }

    public MaskableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaskableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshMask() {
        ForeSee.maskView(this);
    }

}

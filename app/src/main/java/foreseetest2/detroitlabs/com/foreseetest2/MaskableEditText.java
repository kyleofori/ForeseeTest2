package foreseetest2.detroitlabs.com.foreseetest2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.foresee.sdk.ForeSee;

public class MaskableEditText extends EditText implements MaskableView {

    public MaskableEditText(Context context) {
        super(context);
    }

    public MaskableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaskableEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshMask() {
        ForeSee.maskView(this);
    }

}

package com.autonomousapps.reactivestopwatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class StopwatchView extends TextView implements TimeTeller {

    public StopwatchView(Context context) {
        super(context);
    }

    public StopwatchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StopwatchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public StopwatchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setTime(long timeInMillis) {
        setText("" + timeInMillis);
    }
}

package com.autonomousapps.reactivestopwatch.ui;

import com.autonomousapps.reactivestopwatch.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class StopwatchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, StopwatchFragment.newInstance(), StopwatchFragment.TAG)
                    .commit();
        }
    }
}

package com.crazy.lhp.crazyidea.textview;/**
 * Author：Lianghp on 2016/5/26 08:06
 */

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-26
 * Time: 08:06
 * Note:  There is nothing about it!
 * FIXME
 */
public class Text_ClockActivity extends BaseActivity {
    private final static String TAG = "lianghp Text_ClockActivity";

    private Chronometer chronometer;
    private Button start;
    private Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textclock);
        chronometer = (Chronometer)findViewById(R.id.ch_test_0);
        start = (Button)findViewById(R.id.btn_test_0);
        stop = (Button)findViewById(R.id.btn_test_1);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(0);
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                start.setEnabled(false);
                stop.setEnabled(true);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
                start.setEnabled(true);
                stop.setEnabled(false);
            }
        });
    }
}

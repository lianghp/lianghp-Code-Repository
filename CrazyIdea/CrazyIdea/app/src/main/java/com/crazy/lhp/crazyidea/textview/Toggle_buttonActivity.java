package com.crazy.lhp.crazyidea.textview;/**
 * Author：Lianghp on 2016/5/25 08:14
 */

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-25
 * Time: 08:14
 * Note:  There is nothing about it!
 * FIXME
 */
public class Toggle_buttonActivity extends BaseActivity{
    private final static String TAG = "Toggle_buttonActivity";

    private ToggleButton toggleButton;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);

        toggleButton = (ToggleButton)findViewById(R.id.tbtn_test_0);
        aSwitch = (Switch)findViewById(R.id.swh_test_0);
        final LinearLayout linearLayout = (LinearLayout)findViewById(R.id.ll_test_0);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    linearLayout.setOrientation(1);
                    toggleButton.setChecked(true);
                    aSwitch.setChecked(true);
                }else {
                    linearLayout.setOrientation(0);
                    toggleButton.setChecked(false);
                    aSwitch.setChecked(false);
                }
            }
        };
        toggleButton.setOnCheckedChangeListener(listener);
        aSwitch.setOnCheckedChangeListener(listener);
    }
}

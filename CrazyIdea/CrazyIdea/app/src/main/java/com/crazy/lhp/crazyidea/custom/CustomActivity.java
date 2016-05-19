package com.crazy.lhp.crazyidea.custom;/**
 * Author：Lianghp on 2016/5/18 08:37
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-18
 * Time: 08:37
 * Note:  There is nothing about it!
 * FIXME
 */
public class CustomActivity extends BaseActivity implements View.OnClickListener {
    private final static String TAG = "lianghp CustomActivity";
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        Log.d(TAG, "CustomActivity onStart()");
        initWidget();
    }

    public void initWidget(){
        btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_back:
                finish();
                break;
            default:
                break;
        }
    }
}

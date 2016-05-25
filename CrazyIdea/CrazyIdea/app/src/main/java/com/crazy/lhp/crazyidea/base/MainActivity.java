package com.crazy.lhp.crazyidea.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.custom.CustomActivity;
import com.crazy.lhp.crazyidea.layout.FrameActivity;
import com.crazy.lhp.crazyidea.layout.GridTestLayout;
import com.crazy.lhp.crazyidea.textview.Edit_TextViewActivity;
import com.crazy.lhp.crazyidea.textview.Text_ViewActivity;
import com.crazy.lhp.crazyidea.textview.Toggle_buttonActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "lianghp MainActivity";

    private Button btn_tl_test_1;//自定义控件，小球随着手指在屏幕上移动而移动
    private Button btn_tl_tr_test_1; // 霓虹灯效果 FrameLayout
    private Button btn_tl_tr_test_2;//计算器页面(一个失败的例子)
    private Button btn_tl_test_2;//各种textView
    private Button btn_tl_tr_test_4;//模仿登陆界面
    private Button btn_tl_tr_test_5;//横竖屏切换


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity onStart()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "MainActivity onCreate()");
        setContentView(R.layout.activity_main);
        initwidget();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"MainActivity onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity onDestory()");
    }

    public void initwidget(){
        Log.d(TAG, "MainActivity initwidget()");
        btn_tl_test_1 = (Button)findViewById(R.id.btn_tl_test_1);
        btn_tl_tr_test_1 = (Button)findViewById(R.id.btn_tl_tr_test_1);
        btn_tl_tr_test_2 = (Button)findViewById(R.id.btn_tl_tr_test_2);
        btn_tl_test_2 = (Button)findViewById(R.id.btn_tl_test_2);
        btn_tl_tr_test_4 = (Button)findViewById(R.id.btn_tl_tr_test_4);
        btn_tl_tr_test_5 = (Button)findViewById(R.id.btn_tl_tr_test_5);

        btn_tl_test_1.setOnClickListener(this);
        btn_tl_tr_test_1.setOnClickListener(this);
        btn_tl_tr_test_2.setOnClickListener(this);
        btn_tl_test_2.setOnClickListener(this);
        btn_tl_tr_test_4.setOnClickListener(this);
        btn_tl_tr_test_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int Id = view.getId();
        switch (Id){
            case R.id.btn_tl_test_1:
                Log.d(TAG, "MainActivity initwidget()");
                Intent intent = new Intent(this, CustomActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_tl_tr_test_1:
                Intent intent1 = new Intent(this, FrameActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_tl_tr_test_2:
                Intent intent2 = new Intent(this, GridTestLayout.class);
                startActivity(intent2);
                break;
            case R.id.btn_tl_test_2:
                Intent intent3 = new Intent(this, Text_ViewActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_tl_tr_test_4:
                Intent intent4 = new Intent(this, Edit_TextViewActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_tl_tr_test_5:
                Intent intent5 = new Intent(this, Toggle_buttonActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}

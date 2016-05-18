package com.crazy.lhp.crazyidea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crazy.lhp.crazyidea.custom.CustomActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "lianghp MainActivity";

    private Button btn_tl_test_1;//自定义控件，小球随着手指在屏幕上移动而移动

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
        btn_tl_test_1 = (Button)findViewById(R.id.btn_tl_test_1);
    }

    @Override
    public void onClick(View view) {
        int Id = view.getId();
        switch (Id){
            case R.id.btn_tl_test_1:
                Intent intent = new Intent(this, CustomActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

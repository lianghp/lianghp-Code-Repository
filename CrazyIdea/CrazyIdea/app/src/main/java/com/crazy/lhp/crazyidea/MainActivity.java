package com.crazy.lhp.crazyidea;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "lianghp MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"MainActivity onStart()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"MainActivity onCreate()");
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn_main_show);
        clickHandler(btn);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity onResume()");
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
        Log.d(TAG,"MainActivity onDestory()");
    }
    public void clickHandler(View source){
        TextView tv = (TextView)findViewById(R.id.tv_main_showtime);
        tv.setText("Hello Android - " + new java.util.Date());
    }
}

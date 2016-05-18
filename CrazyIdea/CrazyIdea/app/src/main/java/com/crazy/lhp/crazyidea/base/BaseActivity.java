package com.crazy.lhp.crazyidea.base;/**
 * Author：Lianghp on 2016/5/18 18:29
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.crazy.lhp.crazyidea.R;

/**
 * Date: 2016-05-18
 * Time: 18:29
 * Note:  There is nothing about it!
 * FIXME
 */
public class BaseActivity extends Activity {
    final static String TAG = "lianghp BaseActivity";
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "BaseActivity onStart()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "BaseActivity onCreate()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "BaseActivity onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "BaseActivity onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "BaseActivity onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "BaseActivity onDestory()");
    }

}

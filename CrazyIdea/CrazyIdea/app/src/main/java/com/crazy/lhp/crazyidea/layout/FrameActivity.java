package com.crazy.lhp.crazyidea.layout;/**
 * Author：Lianghp on 2016/5/19 08:04
 */

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Date: 2016-05-19
 * Time: 08:04
 * Note:  霓虹灯效果!
 * FIXME
 */
public class FrameActivity extends BaseActivity implements View.OnClickListener {
    private final static String TAG = "lianghp FrameActivity";

    private int currentColor = 0;
    private Button btn_back;
    //定义一个颜色数组
    final int[] colors = new int[]{
            R.color.colorRed,
            R.color.colorGreen_light,
            R.color.colorYellow,
            R.color.colorBlue,
            R.color.colorPurple,
            R.color.colorBlue_light
    };

    final int[] names = new int[]{
            R.id.tv_test_0,
            R.id.tv_test_1,
            R.id.tv_test_2,
            R.id.tv_test_3,
            R.id.tv_test_4,
            R.id.tv_test_5
    };
    TextView[] views = new TextView[names.length];
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 0x123){
                for(int i = 0; i < names.length; i++){
                    views[i].setBackgroundResource(colors[(i
                            + currentColor) %names.length]);
                }
                currentColor++;
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        for(int i = 0; i < names.length; i ++){
            views[i] = (TextView)findViewById(names[i]);
        }
        //定义一个线程周期性的改变currentColor变量值
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 200);

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

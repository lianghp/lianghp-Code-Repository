package com.crazy.lhp.crazyidea.view;/**
 * Author：Lianghp on 2016/6/3 08:11
 */

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;


/**
 * Date: 2016-06-03
 * Time: 08:11
 * Note:  There is nothing about it!
 * FIXME
 */
public class Image_ViewActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "lianghp Image_ViewActivity";

    private Button btn_imag_test_0;
    private Button btn_imag_test_1;
    private Button btn_imag_test_2;

    private ImageView imag_test_0;
    private ImageView imag_test_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        initWidget();
    }

    private void initWidget(){
        btn_imag_test_0 = (Button)findViewById(R.id.btn_imag_test_0);
        btn_imag_test_1 = (Button)findViewById(R.id.btn_imag_test_1);
        btn_imag_test_2 = (Button)findViewById(R.id.btn_imag_test_2);

        imag_test_0 = (ImageView)findViewById(R.id.imag_test_0);
        imag_test_1 = (ImageView)findViewById(R.id.imag_test_1);

        btn_imag_test_0.setOnClickListener(this);
        btn_imag_test_1.setOnClickListener(this);
        btn_imag_test_2.setOnClickListener(this);

        imag_test_0.setOnClickListener(this);
        imag_test_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_imag_test_0:
                break;
            case R.id.btn_imag_test_1:
                break;
            case R.id.btn_imag_test_2:
                break;
            default:
                break;
        }
    }
}

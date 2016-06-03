package com.crazy.lhp.crazyidea.view;/**
 * Author：Lianghp on 2016/5/24 08:07
 */

import android.os.Bundle;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-24
 * Time: 08:07
 * Note:  inputType属性控制键盘的默认显示!
 * FIXME
 */
public class Edit_TextViewActivity extends BaseActivity{
    private final static String TAG = "Edit_TextViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editview);
    }
}

package com.crazy.lhp.crazyidea.layout;/**
 * Author：Lianghp on 2016/5/19 18:13
 */

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-19
 * Time: 18:13
 * Note:  计算器界面!
 * FIXME
 */
public class GridTestLayout extends BaseActivity {
    private final static String TAG = "lainghp GridTestLayout";

    GridLayout gridTestLayout;

    String[] strings = new String[]{
            "7" , "8" , "9" , "÷",
            "4" , "5" , "6" , "×",
            "1" , "2" , "3" , "-",
            "." , "0" , "=" , "+"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gridTestLayout = (GridLayout)findViewById(R.id.gl_root);

        for(int i = 0; i < strings.length; i ++){
            Button btn = new Button(this);
            btn.setText(strings[i]);
            btn.setTextSize(R.dimen.font_size_40);
            btn.setPadding(R.dimen.layout_padding_5, R.dimen.layout_padding_35,
                    R.dimen.layout_padding_5, R.dimen.layout_padding_35);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,columnSpec);
            params.setGravity(Gravity.FILL);
            gridTestLayout.addView(btn,params);
        }
    }
}

package com.crazy.lhp.crazyidea.custom;
 /**
  * Author：Lianghp on 2016/5/16 08:26
  */

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Date: 2016-05-16
 * Time: 08:26
 * Note:自定义控件
 * FIXME
 */
public class DrawView extends View {
    public float currentX = 40;
    public float currentY = 50;

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}

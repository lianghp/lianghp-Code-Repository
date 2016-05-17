package com.crazy.lhp.crazyidea.custom;
 /**
  * Author：Lianghp on 2016/5/16 08:26
  */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
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

    //定义并创建画笔
    Paint p = new Paint();
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
        //设置画笔颜色
        p.setColor(Color.RED);
        //绘制图形
        canvas.drawCircle(currentX, currentY, 40, p);
    }
    //为该组件重写触碰事件并重写事件处理方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改currentX，currentY两个属性
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘自己
        invalidate();
        //返回true表示自己已处理事件
        return true;
    }

}

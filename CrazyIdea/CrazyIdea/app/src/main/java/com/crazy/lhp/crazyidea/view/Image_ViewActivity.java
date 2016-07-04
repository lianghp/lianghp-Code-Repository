package com.crazy.lhp.crazyidea.view;/**
 * Author：Lianghp on 2016/6/3 08:11
 */

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
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
public class Image_ViewActivity extends BaseActivity  {
    private static final String TAG = "lianghp Image_ViewActivity";

    int[] imags = new int[]{
            R.drawable.viewtree,
            R.drawable.hostlayout,
            R.drawable.viewtree,
            R.drawable.hostlayout,
            R.drawable.viewtree,
            R.drawable.hostlayout
    };

    //默认显示的图片
    int currentimag = 2;
    //初始的透明度
    private int alpha = 255;

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

        btn_imag_test_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imag_test_0.setImageResource(imags[++currentimag % imags.length]);
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn_imag_test_0){
                    alpha  += 20;
                }
                if(view == btn_imag_test_1){
                    alpha -= 20;
                }
                if(alpha > 255){
                    alpha = 255;
                }
                if(alpha  < 0){
                    alpha = 0;
                }

                imag_test_0.setImageAlpha(alpha);
            }
        };

        btn_imag_test_0.setOnClickListener(listener);
        btn_imag_test_1.setOnClickListener(listener);

        imag_test_0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable)imag_test_0.getDrawable();
                //获取第一个图片显示框中的位图
                Bitmap bitmap = bitmapDrawable.getBitmap();
                //bitmap 图片实际大小与第一个imageiew的缩放比例
                double scale = 1.0 * bitmap.getHeight() / imag_test_0.getHeight();
                //获取需要显示的图片的开始点
                int x = (int)(motionEvent.getX() * scale);
                int y = (int)(motionEvent.getY() * scale);

                if(x + 120 > bitmap.getWidth()){
                    x = bitmap.getWidth() - 120;
                }
                if(y + 120 > bitmap.getHeight()){
                    y = bitmap.getHeight() - 120;
                }
                imag_test_1.setImageBitmap(Bitmap.createBitmap(bitmap, x, y , 120, 120));
                imag_test_1.setImageAlpha(alpha);

                return false;
            }
        });

    }
}

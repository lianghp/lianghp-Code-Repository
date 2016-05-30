package com.crazy.lhp.crazyidea.textview;/**
 * Author：Lianghp on 2016/5/27 07:55
 */

import android.os.Bundle;

import com.crazy.lhp.crazyidea.R;
import com.crazy.lhp.crazyidea.base.BaseActivity;

/**
 * Date: 2016-05-27
 * Time: 07:55
 * Note:  view: view是一种界面层的控件的一种抽象，代表了一个控件。
 *
 *      整个View树的绘图流程是在ViewRoot.java类的performTraversals()函数展开的，该函数做的执行过程可简单概况为
 *      根据之前设置的状态，判断是否需要重新计算视图大小(measure)、是否重新需要安置视图的位置(layout)、
 *      以及是否需要重绘 (draw).
 *
 * FIXME
 */
public class View_Activity extends BaseActivity {
    private final static String TAG = "lianghp View_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

package com.crazy.lhp.crazyidea.view;/**
 * Author：Lianghp on 2016/5/27 07:55
 */

import android.os.Bundle;
import android.view.View;

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
 *      流程一：  mesarue()过程:主要作用：为整个View树计算实际的大小.调用measure()方法去计算View树的大小，回调
 *              View/ViewGroup对象的onMeasure()方法.  view调用setMeasuredDimension()方法设置实际宽高。
 *              ViewGroup重写onMeasure()方法 。对其子视图measure()。
 *
 *      流程二、 layout布局过程：主要作用 ：为将整个根据子视图的大小以及布局参数将View树放到合适的位置上。
 *              host.layout()开始View树的布局，继而回调给View/ViewGroup类中的layout()方法 。
 *              接下来回调onLayout()。
 *      流程三、 draw()绘图过程
 *              由ViewRoot对象的performTraversals()方法调用draw()方法发起绘制该View树，值得注意的是每次发起绘图时，并不
 *              会重新绘制每个View树的视图，而只会重新绘制那些“需要重绘”的视图，View类内部变量包含了一个标志位DRAWN，当该
 *              视图需要重绘时，就会为该View添加该标志位。
 *              onDraw()、dispatchDraw ()、drawChild()。（ dispatch 派遣、分派）
 *
 *      在这三个流程中，Google已经帮我们把draw()过程框架已经写好了，自定义的ViewGroup只需要实现
 *      measure()过程和layout()过程即可 。
 *
 *      invalidate()、requsetLaytout()、requestFocus()
 *
 *      invalidate()方法，请求重绘View树，只绘制那些“需要重绘的”。
 *          调用情况。直接调用invalidate()方法、setSelection()方法、setVisibility()方法、
 *          （？  setEnabled()方法 ： 请求重新draw()，但不会重新绘制任何视图包括该调用者本身。）
 *
 *      requsetLaytout()    会导致调用measure()过程 和 layout()过程 。
 *
 *      requestFocus()   请求View树的draw()过程，但只绘制“需要重绘”的视图
 *
 *
 * FIXME
 */
public class View_Activity extends BaseActivity {
    private final static String TAG = "lianghp View_Activity";

    private View mView;
   // private DecorView;   Decor(装饰)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

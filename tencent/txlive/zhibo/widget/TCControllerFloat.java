package tencent.txlive.zhibo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCControllerFloat extends RelativeLayout implements IController, View.OnClickListener {
    public int appBarHeight;
    private long endTime;
    private ImageView floatBG;
    private TXCloudVideoView floatVideoView;
    public int floatWidth;
    public int floatX;
    public int floatY;
    public int floatheight;
    private IControllerCallback mControllerCallback;
    private float screenHeight;
    private float screenWidth;
    private long startTime;
    private int statusBarHeight;
    private float xInScreen;
    private float xInView;
    private float yInScreen;
    private float yInView;

    public TCControllerFloat(Context context) {
    }

    private int getStatusBarHeight() {
    }

    private void initView(Context context) {
    }

    private void updateViewPosition() {
    }

    public int getAppBarHeight() {
    }

    public TXCloudVideoView getFloatVideoView() {
    }

    public int getFloatWidth() {
    }

    public int getFloatX() {
    }

    public int getFloatY() {
    }

    public int getFloatheight() {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void hideVideo() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void release() {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void setCallback(IControllerCallback iControllerCallback) {
    }

    public void setFloatBG(boolean z, boolean z2) {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void setWatermark(Bitmap bitmap, float f2, float f3) {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void showVideo() {
    }

    @Override // tencent.txlive.zhibo.widget.IController
    public void updatePlayState(int i2) {
    }

    public TCControllerFloat(Context context, AttributeSet attributeSet) {
    }

    public TCControllerFloat(Context context, AttributeSet attributeSet, int i2) {
    }
}

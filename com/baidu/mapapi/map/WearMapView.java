package com.baidu.mapapi.map;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.platform.comapi.map.MapSurfaceView;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(20)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WearMapView extends ViewGroup implements View.OnApplyWindowInsetsListener {
    public static final int BT_INVIEW = 1;
    private static final String b = null;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static int f1866d;

    /* renamed from: e  reason: collision with root package name */
    private static int f1867e;
    private static int s;
    private static int t;
    private static int u;
    private static final SparseArray<Integer> x = null;
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    public ScreenShape f1868a;

    /* renamed from: f  reason: collision with root package name */
    private MapSurfaceView f1869f;

    /* renamed from: g  reason: collision with root package name */
    private BaiduMap f1870g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1871h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap f1872i;

    /* renamed from: j  reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.ac f1873j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1874k;

    /* renamed from: l  reason: collision with root package name */
    private Point f1875l;

    /* renamed from: m  reason: collision with root package name */
    private Point f1876m;
    public AnimationTask mTask;
    public Timer mTimer;
    public a mTimerHandler;

    /* renamed from: n  reason: collision with root package name */
    private RelativeLayout f1877n;

    /* renamed from: o  reason: collision with root package name */
    private SwipeDismissView f1878o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1879p;
    private TextView q;
    private ImageView r;
    private boolean v;
    private Context w;
    private boolean y;
    private boolean z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnimationTask extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WearMapView f1880a;

        public AnimationTask(WearMapView wearMapView) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ScreenShape {
        public static final ScreenShape RECTANGLE = null;
        public static final ScreenShape ROUND = null;
        public static final ScreenShape UNDETECTED = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ ScreenShape[] f1881a = null;

        private ScreenShape(String str, int i2) {
        }

        public static ScreenShape valueOf(String str) {
        }

        public static ScreenShape[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WearMapView f1882a;
        private final WeakReference<Context> b;

        public a(WearMapView wearMapView, Context context) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public WearMapView(Context context) {
    }

    public static /* synthetic */ float a(WearMapView wearMapView, float f2) {
    }

    public static /* synthetic */ MapSurfaceView b(WearMapView wearMapView) {
    }

    public static /* synthetic */ float c(WearMapView wearMapView) {
    }

    public static /* synthetic */ ImageView d(WearMapView wearMapView) {
    }

    public static /* synthetic */ TextView e(WearMapView wearMapView) {
    }

    public static /* synthetic */ TextView f(WearMapView wearMapView) {
    }

    public static /* synthetic */ com.baidu.mapsdkplatform.comapi.map.ac g(WearMapView wearMapView) {
    }

    @Deprecated
    public static void setCustomMapStylePath(String str) {
    }

    @Deprecated
    public static void setIconCustom(int i2) {
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i2) {
    }

    @Deprecated
    public static void setMapCustomEnable(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public final BaiduMap getMap() {
    }

    public final int getMapLevel() {
    }

    public int getScaleControlViewHeight() {
    }

    public int getScaleControlViewWidth() {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
    }

    public void onCreate(Context context, Bundle bundle) {
    }

    public final void onDestroy() {
    }

    public final void onDismiss() {
    }

    public final void onEnterAmbient(Bundle bundle) {
    }

    public void onExitAmbient() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(20)
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
    }

    public void setCustomStyleFilePathAndMode(String str, int i2) {
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
    }

    public void setMapCustomStyleEnable(boolean z) {
    }

    public void setMapCustomStylePath(String str) {
    }

    public void setOnDismissCallbackListener(OnDismissCallback onDismissCallback) {
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setScaleControlPosition(Point point) {
    }

    public void setShape(ScreenShape screenShape) {
    }

    public void setViewAnimitionEnable(boolean z) {
    }

    public void setZoomControlsPosition(Point point) {
    }

    public void showScaleControl(boolean z) {
    }

    public void showZoomControls(boolean z) {
    }

    public static /* synthetic */ SparseArray a() {
    }

    public static /* synthetic */ void b(WearMapView wearMapView, boolean z) {
    }

    private void c(Context context) {
    }

    private void d(Context context) {
    }

    private void e(Context context) {
    }

    public static /* synthetic */ void a(WearMapView wearMapView, String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    private void b(Context context) {
    }

    public static /* synthetic */ void a(WearMapView wearMapView, String str, String str2) {
    }

    public static /* synthetic */ boolean a(WearMapView wearMapView) {
    }

    public static /* synthetic */ boolean a(WearMapView wearMapView, boolean z) {
    }

    private static void a(Context context) {
    }

    private void d() {
    }

    public WearMapView(Context context, AttributeSet attributeSet) {
    }

    private int a(int i2, int i3) {
    }

    private void b() {
    }

    private void a(String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    private void c() {
    }

    public WearMapView(Context context, AttributeSet attributeSet, int i2) {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
    }

    public WearMapView(Context context, BaiduMapOptions baiduMapOptions) {
    }

    private void e() {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str) {
    }

    private void a(boolean z) {
    }

    private void a(int i2) {
    }

    private void a(View view) {
    }

    private void a(View view, boolean z) {
    }

    private void a(String str, String str2) {
    }
}

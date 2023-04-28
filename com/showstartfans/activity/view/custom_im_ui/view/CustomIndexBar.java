package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.component.CustomLinearLayoutManager;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.helper.IIndexBarDataHelper;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomIndexBar extends View {

    /* renamed from: p  reason: collision with root package name */
    private static final String f7164p = null;
    public static String[] q;
    private boolean b;
    private List<String> c;

    /* renamed from: d  reason: collision with root package name */
    private int f7165d;

    /* renamed from: e  reason: collision with root package name */
    private int f7166e;

    /* renamed from: f  reason: collision with root package name */
    private int f7167f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f7168g;

    /* renamed from: h  reason: collision with root package name */
    private int f7169h;

    /* renamed from: i  reason: collision with root package name */
    private IIndexBarDataHelper f7170i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7171j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7172k;

    /* renamed from: l  reason: collision with root package name */
    private List<? extends BaseIndexPinyinBean> f7173l;

    /* renamed from: m  reason: collision with root package name */
    private CustomLinearLayoutManager f7174m;

    /* renamed from: n  reason: collision with root package name */
    private int f7175n;

    /* renamed from: o  reason: collision with root package name */
    private IndexBar.onIndexPressedListener f7176o;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements IndexBar.onIndexPressedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomIndexBar f7177a;

        public a(CustomIndexBar customIndexBar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar.onIndexPressedListener
        public void onIndexPressed(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar.onIndexPressedListener
        public void onMotionEventEnd() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void onIndexPressed(int i2, String str);

        void onMotionEventEnd();
    }

    public CustomIndexBar(Context context) {
    }

    public static /* synthetic */ TextView a(CustomIndexBar customIndexBar) {
    }

    public static /* synthetic */ CustomLinearLayoutManager b(CustomIndexBar customIndexBar) {
    }

    public static /* synthetic */ int c(CustomIndexBar customIndexBar, String str) {
    }

    private void d() {
    }

    private int e(String str) {
    }

    private void f(Context context, AttributeSet attributeSet, int i2) {
    }

    private void g() {
    }

    private void h() {
    }

    private void q() {
    }

    public IIndexBarDataHelper getDataHelper() {
    }

    public int getHeaderViewCount() {
    }

    public IndexBar.onIndexPressedListener getOnIndexPressedListener() {
    }

    public boolean i() {
    }

    public CustomIndexBar j(IIndexBarDataHelper iIndexBarDataHelper) {
    }

    public CustomIndexBar k(int i2) {
    }

    public CustomIndexBar l(CustomLinearLayoutManager customLinearLayoutManager) {
    }

    public CustomIndexBar m(boolean z) {
    }

    public CustomIndexBar n(TextView textView) {
    }

    public CustomIndexBar o(List<? extends BaseIndexPinyinBean> list) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public CustomIndexBar p(boolean z) {
    }

    public void setOnIndexPressedListener(IndexBar.onIndexPressedListener onindexpressedlistener) {
    }

    public CustomIndexBar(Context context, AttributeSet attributeSet) {
    }

    public CustomIndexBar(Context context, AttributeSet attributeSet, int i2) {
    }
}

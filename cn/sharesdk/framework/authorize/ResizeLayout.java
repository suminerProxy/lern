package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ResizeLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private OnResizeListener f161a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnResizeListener {
        void OnResize(int i2, int i3, int i4, int i5);
    }

    public ResizeLayout(Context context) {
    }

    public void a(OnResizeListener onResizeListener) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
    }
}

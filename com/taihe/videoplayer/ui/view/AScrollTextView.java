package com.taihe.videoplayer.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AScrollTextView extends AppCompatTextView {

    /* renamed from: d  reason: collision with root package name */
    private static final String f7927d = "AutoScrollTextView";
    private boolean b;
    private a c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Runnable {
        private WeakReference<AScrollTextView> b;

        public a(AScrollTextView aScrollTextView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AScrollTextView(Context context) {
    }

    public static /* synthetic */ boolean a(AScrollTextView aScrollTextView) {
    }

    private void init() {
    }

    @Override // android.view.View
    public boolean isFocused() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    public void setEnableFocus(boolean z) {
    }

    public AScrollTextView(Context context, AttributeSet attributeSet, int i2) {
    }

    public AScrollTextView(Context context, AttributeSet attributeSet) {
    }
}

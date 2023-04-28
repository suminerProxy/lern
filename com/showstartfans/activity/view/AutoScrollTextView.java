package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import skin.support.widget.SkinCompatTextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AutoScrollTextView extends SkinCompatTextView {

    /* renamed from: d  reason: collision with root package name */
    private static final String f6605d = "AutoScrollTextView";
    private boolean b;
    private a c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Runnable {
        private WeakReference<AutoScrollTextView> b;

        public a(AutoScrollTextView autoScrollTextView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AutoScrollTextView(Context context) {
    }

    public static /* synthetic */ boolean a(AutoScrollTextView autoScrollTextView) {
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

    public AutoScrollTextView(Context context, AttributeSet attributeSet, int i2) {
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet) {
    }
}

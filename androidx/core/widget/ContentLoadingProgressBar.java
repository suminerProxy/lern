package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    public boolean mDismissed;
    public boolean mPostedHide;
    public boolean mPostedShow;
    public long mStartTime;

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ContentLoadingProgressBar this$0;

        public AnonymousClass1(ContentLoadingProgressBar contentLoadingProgressBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ContentLoadingProgressBar this$0;

        public AnonymousClass2(ContentLoadingProgressBar contentLoadingProgressBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ContentLoadingProgressBar(@NonNull Context context) {
    }

    private void removeCallbacks() {
    }

    public synchronized void hide() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
    }

    public synchronized void show() {
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}

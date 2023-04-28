package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AsyncLayoutInflater {
    private static final String TAG = "AsyncLayoutInflater";
    public Handler mHandler;
    private Handler.Callback mHandlerCallback;
    public InflateThread mInflateThread;
    public LayoutInflater mInflater;

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ AsyncLayoutInflater this$0;

        public AnonymousClass1(AsyncLayoutInflater asyncLayoutInflater) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BasicInflater extends LayoutInflater {
        private static final String[] sClassPrefixList = null;

        public BasicInflater(Context context) {
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InflateRequest {
        public OnInflateFinishedListener callback;
        public AsyncLayoutInflater inflater;
        public ViewGroup parent;
        public int resid;
        public View view;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InflateThread extends Thread {
        private static final InflateThread sInstance = null;
        private ArrayBlockingQueue<InflateRequest> mQueue;
        private Pools.SynchronizedPool<InflateRequest> mRequestPool;

        private InflateThread() {
        }

        public static InflateThread getInstance() {
        }

        public void enqueue(InflateRequest inflateRequest) {
        }

        public InflateRequest obtainRequest() {
        }

        public void releaseRequest(InflateRequest inflateRequest) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public void runInner() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnInflateFinishedListener {
        void onInflateFinished(@NonNull View view, @LayoutRes int i2, @Nullable ViewGroup viewGroup);
    }

    public AsyncLayoutInflater(@NonNull Context context) {
    }

    @UiThread
    public void inflate(@LayoutRes int i2, @Nullable ViewGroup viewGroup, @NonNull OnInflateFinishedListener onInflateFinishedListener) {
    }
}

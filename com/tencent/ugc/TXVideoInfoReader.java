package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.tencent.ugc.TXVideoEditConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVideoInfoReader {
    private static final int RETRY_MAX_COUNT = 3;
    private static TXVideoInfoReader sInstance;
    private final String TAG;
    private Context mContext;
    private int mCount;
    private a mGenerateImageThread;
    private volatile WeakReference<OnSampleProgrocess> mListener;
    private final Handler mMainHandler;
    private final AtomicInteger mRetryTimes;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnSampleProgrocess {
        void sampleProcess(int i2, Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoInfoReader f14246a;
        private final String b;
        private volatile Bitmap c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14247d;

        public a(TXVideoInfoReader tXVideoInfoReader, String str) {
        }

        public static /* synthetic */ void a(OnSampleProgrocess onSampleProgrocess, int i2, Bitmap bitmap) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
        }

        public static /* synthetic */ void a(a aVar, String str) {
        }
    }

    private TXVideoInfoReader(Context context) {
    }

    public static /* synthetic */ WeakReference access$000(TXVideoInfoReader tXVideoInfoReader) {
    }

    public static /* synthetic */ int access$100(TXVideoInfoReader tXVideoInfoReader) {
    }

    public static /* synthetic */ AtomicInteger access$200(TXVideoInfoReader tXVideoInfoReader) {
    }

    public static /* synthetic */ Handler access$300(TXVideoInfoReader tXVideoInfoReader) {
    }

    private void cancelThread() {
    }

    private long getContentUrlFileSize(String str) {
    }

    @Deprecated
    public static TXVideoInfoReader getInstance() {
    }

    public void cancel() {
    }

    public Bitmap getSampleImage(long j2, String str) {
    }

    public void getSampleImages(int i2, String str, OnSampleProgrocess onSampleProgrocess) {
    }

    public TXVideoEditConstants.TXVideoInfo getVideoFileInfo(String str) {
    }

    public static TXVideoInfoReader getInstance(Context context) {
    }

    private TXVideoInfoReader() {
    }
}

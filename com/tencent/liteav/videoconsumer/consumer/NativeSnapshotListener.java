package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeSnapshotListener implements TakeSnapshotListener {
    private long mNativeVideoSnapListener;

    @CalledByNative
    private NativeSnapshotListener(long j2) {
    }

    private native void nativeDestroy(long j2);

    private native void nativeOnComplete(long j2, Bitmap bitmap);

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.liteav.videobase.base.TakeSnapshotListener
    public void onComplete(Bitmap bitmap) {
    }
}

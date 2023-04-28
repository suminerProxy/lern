package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED = null;
    @Deprecated
    public static final DrmSessionManager DUMMY = null;

    /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements DrmSessionManager {
        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        @Nullable
        public DrmSession acquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        @Nullable
        public Class<UnsupportedMediaCrypto> getExoMediaCryptoType(Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ DrmSessionReference preacquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void prepare() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void release() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = null;

        void release();
    }

    @Nullable
    DrmSession acquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    @Nullable
    Class<? extends ExoMediaCrypto> getExoMediaCryptoType(Format format);

    DrmSessionReference preacquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    void prepare();

    void release();
}

package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.Map;
import java.util.UUID;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = null;
    private final ConditionVariable conditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final HandlerThread handlerThread;

    /* renamed from: com.google.android.exoplayer2.drm.OfflineLicenseHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements DrmSessionEventListener {
        public final /* synthetic */ OfflineLicenseHelper this$0;

        public AnonymousClass1(final OfflineLicenseHelper this$0) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception e2) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionReleased(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    @Deprecated
    public OfflineLicenseHelper(UUID uuid, ExoMediaDrm.Provider mediaDrmProvider, MediaDrmCallback callback, @Nullable Map<String, String> optionalKeyRequestParameters, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public static /* synthetic */ ConditionVariable access$000(OfflineLicenseHelper offlineLicenseHelper) {
    }

    private byte[] blockingKeyRequest(int licenseMode, @Nullable byte[] offlineLicenseKeySetId, Format format) throws DrmSession.DrmSessionException {
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private DrmSession openBlockingKeyRequest(int licenseMode, @Nullable byte[] offlineLicenseKeySetId, Format format) {
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
    }

    public void release() {
    }

    public synchronized void releaseLicense(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
    }

    public synchronized byte[] renewLicense(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, @Nullable Map<String, String> optionalKeyRequestParameters, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }
}

package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    @Nullable
    private ExoMediaDrm exoMediaDrm;
    private final ExoMediaDrm.Provider exoMediaDrmProvider;
    private final Set<DefaultDrmSession> keepaliveSessions;
    private final HashMap<String, String> keyRequestParameters;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    public volatile MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    @Nullable
    private DefaultDrmSession noMultiSessionDrmSession;
    @Nullable
    private byte[] offlineLicenseKeySetId;
    @Nullable
    private DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private Handler playbackHandler;
    private Looper playbackLooper;
    private final Set<PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final ProvisioningManagerImpl provisioningManagerImpl;
    private final ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final List<DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final UUID uuid;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private ExoMediaDrm.Provider exoMediaDrmProvider;
        private final HashMap<String, String> keyRequestParameters;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean multiSession;
        private boolean playClearSamplesWithoutKeys;
        private long sessionKeepaliveMs;
        private int[] useDrmSessionsForClearContentTrackTypes;
        private UUID uuid;

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
        }

        public Builder setKeyRequestParameters(@Nullable Map<String, String> keyRequestParameters) {
        }

        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        public Builder setMultiSession(boolean multiSession) {
        }

        public Builder setPlayClearSamplesWithoutKeys(boolean playClearSamplesWithoutKeys) {
        }

        public Builder setSessionKeepaliveMs(long sessionKeepaliveMs) {
        }

        public Builder setUseDrmSessionsForClearContent(int... useDrmSessionsForClearContentTrackTypes) {
        }

        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider exoMediaDrmProvider) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public final /* synthetic */ DefaultDrmSessionManager this$0;

        private MediaDrmEventListener(final DefaultDrmSessionManager this$0) {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm md, @Nullable byte[] sessionId, int event, int extra, @Nullable byte[] data) {
        }

        public /* synthetic */ MediaDrmEventListener(DefaultDrmSessionManager defaultDrmSessionManager, AnonymousClass1 anonymousClass1) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MediaDrmHandler extends Handler {
        public final /* synthetic */ DefaultDrmSessionManager this$0;

        public MediaDrmHandler(final DefaultDrmSessionManager this$0, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MissingSchemeDataException extends Exception {
        public /* synthetic */ MissingSchemeDataException(UUID uuid, AnonymousClass1 anonymousClass1) {
        }

        private MissingSchemeDataException(UUID uuid) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Mode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        @Nullable
        private final DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        @Nullable
        private DrmSession session;
        public final /* synthetic */ DefaultDrmSessionManager this$0;

        public PreacquiredSessionReference(@Nullable final DefaultDrmSessionManager this$0, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        }

        private /* synthetic */ void a(Format format) {
        }

        private /* synthetic */ void c() {
        }

        public void acquire(Format format) {
        }

        public /* synthetic */ void b(Format format) {
        }

        public /* synthetic */ void d() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {
        @Nullable
        private DefaultDrmSession provisioningSession;
        private final Set<DefaultDrmSession> sessionsAwaitingProvisioning;

        public ProvisioningManagerImpl(final DefaultDrmSessionManager this$0) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception error, boolean thrownByExoMediaDrm) {
        }

        public void onSessionFullyReleased(DefaultDrmSession session) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession session) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        public final /* synthetic */ DefaultDrmSessionManager this$0;

        private ReferenceCountListenerImpl(final DefaultDrmSessionManager this$0) {
        }

        public static /* synthetic */ void a(DefaultDrmSession defaultDrmSession) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(DefaultDrmSession session, int newReferenceCount) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession session, int newReferenceCount) {
        }

        public /* synthetic */ ReferenceCountListenerImpl(DefaultDrmSessionManager defaultDrmSessionManager, AnonymousClass1 anonymousClass1) {
        }
    }

    public /* synthetic */ DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap hashMap, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ DefaultDrmSession access$1000(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ DefaultDrmSession access$1002(DefaultDrmSessionManager defaultDrmSessionManager, DefaultDrmSession defaultDrmSession) {
    }

    public static /* synthetic */ ProvisioningManagerImpl access$1100(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ void access$1200(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ Set access$1300(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ Looper access$1400(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ DrmSession access$1500(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
    }

    public static /* synthetic */ List access$400(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ long access$500(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ Set access$600(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ Handler access$700(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ int access$800(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ DefaultDrmSession access$900(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    public static /* synthetic */ DefaultDrmSession access$902(DefaultDrmSessionManager defaultDrmSessionManager, DefaultDrmSession defaultDrmSession) {
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(DrmSession session) {
    }

    private boolean canAcquireSession(DrmInitData drmInitData) {
    }

    private DefaultDrmSession createAndAcquireSession(@Nullable List<DrmInitData.SchemeData> schemeDatas, boolean isPlaceholderSession, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private DefaultDrmSession createAndAcquireSessionWithRetry(@Nullable List<DrmInitData.SchemeData> schemeDatas, boolean isPlaceholderSession, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, boolean shouldReleasePreacquiredSessionsBeforeRetrying) {
    }

    private static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData drmInitData, UUID uuid, boolean allowMissingData) {
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(Looper playbackLooper) {
    }

    @Nullable
    private DrmSession maybeAcquirePlaceholderSession(int trackType, boolean shouldReleasePreacquiredSessionsBeforeRetrying) {
    }

    private void maybeCreateMediaDrmHandler(Looper playbackLooper) {
    }

    private void maybeReleaseMediaDrm() {
    }

    private void releaseAllPreacquiredSessions() {
    }

    private void undoAcquisition(DrmSession session, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @Nullable
    public DrmSession acquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @Nullable
    public Class<? extends ExoMediaCrypto> getExoMediaCryptoType(Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
    }

    public void setMode(int mode, @Nullable byte[] offlineLicenseKeySetId) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters, boolean multiSession) {
    }

    @Nullable
    private DrmSession acquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean shouldReleasePreacquiredSessionsBeforeRetrying) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters, boolean multiSession, int initialDrmRequestRetryCount) {
    }

    private DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider exoMediaDrmProvider, MediaDrmCallback callback, HashMap<String, String> keyRequestParameters, boolean multiSession, int[] useDrmSessionsForClearContentTrackTypes, boolean playClearSamplesWithoutKeys, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long sessionKeepaliveMs) {
    }
}

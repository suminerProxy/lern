package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultDrmSession implements DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    public final MediaDrmCallback callback;
    @Nullable
    private ExoMediaDrm.KeyRequest currentKeyRequest;
    @Nullable
    private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final HashMap<String, String> keyRequestParameters;
    @Nullable
    private DrmSession.DrmSessionException lastException;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    private ExoMediaCrypto mediaCrypto;
    private final ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final ProvisioningManager provisioningManager;
    private int referenceCount;
    private final ReferenceCountListener referenceCountListener;
    @Nullable
    private RequestHandler requestHandler;
    @Nullable
    private HandlerThread requestHandlerThread;
    public final ResponseHandler responseHandler;
    @Nullable
    public final List<DrmInitData.SchemeData> schemeDatas;
    @Nullable
    private byte[] sessionId;
    private int state;
    public final UUID uuid;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception error, boolean thrownByExoMediaDrm);

        void provisionRequired(DefaultDrmSession session);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession session, int newReferenceCount);

        void onReferenceCountIncremented(DefaultDrmSession session, int newReferenceCount);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class RequestHandler extends Handler {
        @GuardedBy("this")
        private boolean isReleased;
        public final /* synthetic */ DefaultDrmSession this$0;

        public RequestHandler(final DefaultDrmSession this$0, Looper backgroundLooper) {
        }

        private boolean maybeRetryRequest(Message originalMsg, MediaDrmCallbackException exception) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }

        public void post(int what, Object request, boolean allowRetry) {
        }

        public synchronized void release() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long taskId, boolean allowRetry, long startTimeMs, Object request) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ResponseHandler extends Handler {
        public final /* synthetic */ DefaultDrmSession this$0;

        public ResponseHandler(final DefaultDrmSession this$0, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable cause) {
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm mediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, @Nullable List<DrmInitData.SchemeData> schemeDatas, int mode, boolean playClearSamplesWithoutKeys, boolean isPlaceholderSession, @Nullable byte[] offlineLicenseKeySetId, HashMap<String, String> keyRequestParameters, MediaDrmCallback callback, Looper playbackLooper, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
    }

    public static /* synthetic */ void a(Exception exc, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public static /* synthetic */ void access$000(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
    }

    public static /* synthetic */ void access$100(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
    }

    public static /* synthetic */ LoadErrorHandlingPolicy access$200(DefaultDrmSession defaultDrmSession) {
    }

    public static /* synthetic */ void b(int i2, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private void dispatchEvent(Consumer<DrmSessionEventListener.EventDispatcher> event) {
    }

    @RequiresNonNull({"sessionId"})
    private void doLicense(boolean allowRetry) {
    }

    private long getLicenseDurationRemainingSec() {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
    }

    private void onError(Exception e2, int errorSource) {
    }

    private void onKeyResponse(Object request, Object response) {
    }

    private void onKeysError(Exception e2, boolean thrownByExoMediaDrm) {
    }

    private void onKeysRequired() {
    }

    private void onProvisionResponse(Object request, Object response) {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean openInternal() {
    }

    private void postKeyRequest(byte[] scope, int type, boolean allowRetry) {
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final ExoMediaCrypto getMediaCrypto() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
    }

    public boolean hasSessionId(byte[] sessionId) {
    }

    public void onMediaDrmEvent(int what) {
    }

    public void onProvisionCompleted() {
    }

    public void onProvisionError(Exception error, boolean thrownByExoMediaDrm) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
    }

    public void provision() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }
}

package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ExoMediaDrm {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AppManagedProvider implements Provider {
        private final ExoMediaDrm exoMediaDrm;

        public AppManagedProvider(ExoMediaDrm exoMediaDrm) {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        public ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class KeyRequest {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_UNKNOWN = Integer.MIN_VALUE;
        public static final int REQUEST_TYPE_UPDATE = 4;
        private final byte[] data;
        private final String licenseServerUrl;
        private final int requestType;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public @interface RequestType {
        }

        public KeyRequest(byte[] data, String licenseServerUrl) {
        }

        public byte[] getData() {
        }

        public String getLicenseServerUrl() {
        }

        public int getRequestType() {
        }

        public KeyRequest(byte[] data, String licenseServerUrl, int requestType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class KeyStatus {
        private final byte[] keyId;
        private final int statusCode;

        public KeyStatus(int statusCode, byte[] keyId) {
        }

        public byte[] getKeyId() {
        }

        public int getStatusCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnEventListener {
        void onEvent(ExoMediaDrm mediaDrm, @Nullable byte[] sessionId, int event, int extra, @Nullable byte[] data);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(ExoMediaDrm mediaDrm, byte[] sessionId, long expirationTimeMs);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(ExoMediaDrm mediaDrm, byte[] sessionId, List<KeyStatus> exoKeyInformation, boolean hasNewUsableKey);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Provider {
        ExoMediaDrm acquireExoMediaDrm(UUID uuid);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProvisionRequest {
        private final byte[] data;
        private final String defaultUrl;

        public ProvisionRequest(byte[] data, String defaultUrl) {
        }

        public byte[] getData() {
        }

        public String getDefaultUrl() {
        }
    }

    void acquire();

    void closeSession(byte[] sessionId);

    ExoMediaCrypto createMediaCrypto(byte[] sessionId) throws MediaCryptoException;

    Class<? extends ExoMediaCrypto> getExoMediaCryptoType();

    KeyRequest getKeyRequest(byte[] scope, @Nullable List<DrmInitData.SchemeData> schemeDatas, int keyType, @Nullable HashMap<String, String> optionalParameters) throws NotProvisionedException;

    @Nullable
    PersistableBundle getMetrics();

    byte[] getPropertyByteArray(String propertyName);

    String getPropertyString(String propertyName);

    ProvisionRequest getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    @Nullable
    byte[] provideKeyResponse(byte[] scope, byte[] response) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] response) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] sessionId);

    void release();

    void restoreKeys(byte[] sessionId, byte[] keySetId);

    void setOnEventListener(@Nullable OnEventListener listener);

    void setOnExpirationUpdateListener(@Nullable OnExpirationUpdateListener listener);

    void setOnKeyStatusChangeListener(@Nullable OnKeyStatusChangeListener listener);

    void setPropertyByteArray(String propertyName, byte[] value);

    void setPropertyString(String propertyName, String value);
}

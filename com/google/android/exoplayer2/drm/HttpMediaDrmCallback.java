package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.Map;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final HttpDataSource.Factory dataSourceFactory;
    @Nullable
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(@Nullable String defaultLicenseUrl, HttpDataSource.Factory dataSourceFactory) {
    }

    private static byte[] executePost(HttpDataSource.Factory dataSourceFactory, String url, @Nullable byte[] httpBody, Map<String, String> requestProperties) throws MediaDrmCallbackException {
    }

    @Nullable
    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException exception, int manualRedirectCount) {
    }

    public void clearAllKeyRequestProperties() {
    }

    public void clearKeyRequestProperty(String name) {
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest request) throws MediaDrmCallbackException {
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest request) throws MediaDrmCallbackException {
    }

    public void setKeyRequestProperty(String name, String value) {
    }

    public HttpMediaDrmCallback(@Nullable String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory dataSourceFactory) {
    }
}

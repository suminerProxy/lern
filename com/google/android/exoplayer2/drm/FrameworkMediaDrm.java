package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final ExoMediaDrm.Provider DEFAULT_PROVIDER = null;
    private static final String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final String MOCK_LA_URL_VALUE = "https://x";
    private static final String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final MediaDrm mediaDrm;
    private int referenceCount;
    private final UUID uuid;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
    }

    private /* synthetic */ void a(ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] data) {
    }

    private static byte[] adjustRequestData(UUID uuid, byte[] requestData) {
    }

    private static byte[] adjustRequestInitData(UUID uuid, byte[] initData) {
    }

    private static String adjustRequestMimeType(UUID uuid, String mimeType) {
    }

    private static UUID adjustUuid(UUID uuid) {
    }

    private /* synthetic */ void c(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j2) {
    }

    private /* synthetic */ void e(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
    }

    @SuppressLint({"WrongConstant"})
    private static void forceWidevineL3(MediaDrm mediaDrm) {
    }

    public static /* synthetic */ ExoMediaDrm g(UUID uuid) {
    }

    private static DrmInitData.SchemeData getSchemeData(UUID uuid, List<DrmInitData.SchemeData> schemeDatas) {
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
    }

    private static boolean needsForceWidevineL3Workaround() {
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void acquire() {
    }

    public /* synthetic */ void b(ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] sessionId) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public /* bridge */ /* synthetic */ ExoMediaCrypto createMediaCrypto(byte[] sessionId) throws MediaCryptoException {
    }

    public /* synthetic */ void d(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j2) {
    }

    public /* synthetic */ void f(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public Class<FrameworkMediaCrypto> getExoMediaCryptoType() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] scope, @Nullable List<DrmInitData.SchemeData> schemeDatas, int keyType, @Nullable HashMap<String, String> optionalParameters) throws NotProvisionedException {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    public PersistableBundle getMetrics() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String propertyName) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public String getPropertyString(String propertyName) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws MediaDrmException {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    public byte[] provideKeyResponse(byte[] scope, byte[] response) throws NotProvisionedException, DeniedByServerException {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] response) throws DeniedByServerException {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] sessionId) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void release() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] sessionId, byte[] keySetId) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(@Nullable ExoMediaDrm.OnEventListener listener) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @RequiresApi(23)
    public void setOnExpirationUpdateListener(@Nullable ExoMediaDrm.OnExpirationUpdateListener listener) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @RequiresApi(23)
    public void setOnKeyStatusChangeListener(@Nullable ExoMediaDrm.OnKeyStatusChangeListener listener) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(String propertyName, byte[] value) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(String propertyName, String value) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public FrameworkMediaCrypto createMediaCrypto(byte[] sessionId) throws MediaCryptoException {
    }
}

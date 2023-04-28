package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    @GuardedBy("valueLock")
    private static long elapsedRealtimeOffsetMs = 0;
    @GuardedBy("valueLock")
    private static boolean isInitialized = false;
    private static final Object loaderLock = null;
    @GuardedBy("valueLock")
    private static String ntpHost = "time.android.com";
    private static final Object valueLock = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InitializationCallback {
        void onInitializationFailed(IOException error);

        void onInitialized();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        @Nullable
        private final InitializationCallback callback;

        public NtpTimeCallback(@Nullable InitializationCallback callback) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }

        public /* synthetic */ NtpTimeLoadable(AnonymousClass1 anonymousClass1) {
        }
    }

    private SntpClient() {
    }

    public static /* synthetic */ Object access$100() {
    }

    public static /* synthetic */ Object access$200() {
    }

    public static /* synthetic */ boolean access$300() {
    }

    public static /* synthetic */ boolean access$302(boolean z) {
    }

    public static /* synthetic */ long access$400() throws IOException {
    }

    public static /* synthetic */ long access$502(long j2) {
    }

    private static void checkValidServerReply(byte leap, byte mode, int stratum, long transmitTime) throws IOException {
    }

    public static long getElapsedRealtimeOffsetMs() {
    }

    public static String getNtpHost() {
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback callback) {
    }

    public static boolean isInitialized() {
    }

    private static long loadNtpTimeOffsetMs() throws IOException {
    }

    private static long read32(byte[] buffer, int offset) {
    }

    private static long readTimestamp(byte[] buffer, int offset) {
    }

    public static void setNtpHost(String ntpHost2) {
    }

    private static void writeTimestamp(byte[] buffer, int offset, long time) {
    }
}

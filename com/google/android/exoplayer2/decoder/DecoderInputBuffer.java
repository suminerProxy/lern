package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;
    @Nullable
    public ByteBuffer data;
    private final int paddingSize;
    @Nullable
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface BufferReplacementMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int currentCapacity, int requiredCapacity) {
        }
    }

    public DecoderInputBuffer(int bufferReplacementMode) {
    }

    private ByteBuffer createReplacementByteBuffer(int requiredCapacity) {
    }

    public static DecoderInputBuffer newNoDataInstance() {
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int length) {
    }

    public final void flip() {
    }

    public final boolean isEncrypted() {
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int length) {
    }

    public DecoderInputBuffer(int bufferReplacementMode, int paddingSize) {
    }
}

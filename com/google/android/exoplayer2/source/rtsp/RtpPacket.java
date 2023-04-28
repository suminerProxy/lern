package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = null;
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private byte[] csrc;
        private boolean marker;
        private boolean padding;
        private byte[] payloadData;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;

        public static /* synthetic */ boolean access$200(Builder builder) {
        }

        public static /* synthetic */ boolean access$300(Builder builder) {
        }

        public static /* synthetic */ byte access$400(Builder builder) {
        }

        public static /* synthetic */ int access$500(Builder builder) {
        }

        public static /* synthetic */ long access$600(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ byte[] access$800(Builder builder) {
        }

        public static /* synthetic */ byte[] access$900(Builder builder) {
        }

        public RtpPacket build() {
        }

        public Builder setCsrc(byte[] csrc) {
        }

        public Builder setMarker(boolean marker) {
        }

        public Builder setPadding(boolean padding) {
        }

        public Builder setPayloadData(byte[] payloadData) {
        }

        public Builder setPayloadType(byte payloadType) {
        }

        public Builder setSequenceNumber(int sequenceNumber) {
        }

        public Builder setSsrc(int ssrc) {
        }

        public Builder setTimestamp(long timestamp) {
        }
    }

    public /* synthetic */ RtpPacket(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ byte[] access$000() {
    }

    @Nullable
    public static RtpPacket parse(ParsableByteArray packetBuffer) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public int writeToBuffer(byte[] target, int offset, int length) {
    }

    private RtpPacket(Builder builder) {
    }

    @Nullable
    public static RtpPacket parse(byte[] buffer, int length) {
    }
}

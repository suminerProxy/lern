package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.TreeSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtpPacketReorderingQueue {
    @VisibleForTesting
    public static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int MAX_SEQUENCE_NUMBER = 65535;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;
    @GuardedBy("this")
    private int lastDequeuedSequenceNumber;
    @GuardedBy("this")
    private int lastReceivedSequenceNumber;
    @GuardedBy("this")
    private final TreeSet<RtpPacketContainer> packetQueue;
    @GuardedBy("this")
    private boolean started;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket packet, long receivedTimestampMs) {
        }
    }

    public static /* synthetic */ int a(RtpPacketContainer rtpPacketContainer, RtpPacketContainer rtpPacketContainer2) {
    }

    private synchronized void addToQueue(RtpPacketContainer packet) {
    }

    private static int calculateSequenceNumberShift(int sequenceNumber, int previousSequenceNumber) {
    }

    private static int nextSequenceNumber(int sequenceNumber) {
    }

    private static int prevSequenceNumber(int sequenceNumber) {
    }

    public synchronized boolean offer(RtpPacket packet, long receivedTimestampMs) {
    }

    @Nullable
    public synchronized RtpPacket poll(long cutoffTimestampMs) {
    }

    public synchronized void reset() {
    }
}

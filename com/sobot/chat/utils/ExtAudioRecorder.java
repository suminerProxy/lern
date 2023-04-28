package com.sobot.chat.utils;

import android.media.AudioRecord;
import android.media.MediaRecorder;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ExtAudioRecorder {
    public static final boolean RECORDING_COMPRESSED = false;
    public static final boolean RECORDING_UNCOMPRESSED = true;
    private static final int TIMER_INTERVAL = 120;
    private static final int[] sampleRates = null;
    private int aFormat;
    private int aSource;
    private AudioRecord audioRecorder;
    private short bSamples;
    private byte[] buffer;
    private int bufferSize;
    private int cAmplitude;
    private String filePath;
    private int framePeriod;
    private MediaRecorder mediaRecorder;
    private short nChannels;
    private int payloadSize;
    private boolean rUncompressed;
    private RandomAccessFile randomAccessWriter;
    private int sRate;
    private State state;
    private AudioRecord.OnRecordPositionUpdateListener updateListener;

    /* renamed from: com.sobot.chat.utils.ExtAudioRecorder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AudioRecord.OnRecordPositionUpdateListener {
        public final /* synthetic */ ExtAudioRecorder this$0;

        public AnonymousClass1(ExtAudioRecorder extAudioRecorder) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface AudioRecorderListener {
        void onHasPermission();

        void onNoPermission();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State ERROR = null;
        public static final State INITIALIZING = null;
        public static final State READY = null;
        public static final State RECORDING = null;
        public static final State STOPPED = null;

        private State(String str, int i2) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    public ExtAudioRecorder(boolean z, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ byte[] access$000(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ AudioRecord access$100(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ RandomAccessFile access$200(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ int access$300(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ int access$302(ExtAudioRecorder extAudioRecorder, int i2) {
    }

    public static /* synthetic */ short access$400(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ short access$500(ExtAudioRecorder extAudioRecorder, byte b, byte b2) {
    }

    public static /* synthetic */ int access$600(ExtAudioRecorder extAudioRecorder) {
    }

    public static /* synthetic */ int access$602(ExtAudioRecorder extAudioRecorder, int i2) {
    }

    public static ExtAudioRecorder getInstanse(Boolean bool) {
    }

    private short getShort(byte b, byte b2) {
    }

    public int getMaxAmplitude() {
    }

    public State getState() {
    }

    public void prepare() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setOutputFile(String str) {
    }

    public void start(AudioRecorderListener audioRecorderListener) {
    }

    public void stop() {
    }
}

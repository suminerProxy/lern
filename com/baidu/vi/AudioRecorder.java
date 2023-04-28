package com.baidu.vi;

import android.media.AudioRecord;
import android.os.Handler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AudioRecorder {

    /* renamed from: j  reason: collision with root package name */
    private static Handler f2887j;

    /* renamed from: a  reason: collision with root package name */
    private volatile AudioRecord f2888a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2889d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2890e;

    /* renamed from: f  reason: collision with root package name */
    private int f2891f;

    /* renamed from: g  reason: collision with root package name */
    private int f2892g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f2893h;

    /* renamed from: i  reason: collision with root package name */
    private Object f2894i;

    /* renamed from: k  reason: collision with root package name */
    private Thread f2895k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public AudioRecorder f2896a;
        public byte[] b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AudioRecorder f2897d;

        public a(AudioRecorder audioRecorder, AudioRecorder audioRecorder2, byte[] bArr, int i2) {
        }
    }

    public AudioRecorder(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static /* synthetic */ void a(AudioRecorder audioRecorder, byte[] bArr, int i2) {
    }

    public static /* synthetic */ AudioRecord b(AudioRecorder audioRecorder) {
    }

    public static /* synthetic */ int c(AudioRecorder audioRecorder) {
    }

    public static /* synthetic */ void d(AudioRecorder audioRecorder) {
    }

    public native void onReadData(byte[] bArr, int i2);

    public native void onReadError();

    public static /* synthetic */ boolean a(AudioRecorder audioRecorder) {
    }

    private void a() {
    }

    private void a(byte[] bArr, int i2) {
    }
}

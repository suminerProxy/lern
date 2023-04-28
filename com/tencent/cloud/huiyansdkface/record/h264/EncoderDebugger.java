package com.tencent.cloud.huiyansdkface.record.h264;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import java.io.IOException;

@SuppressLint({"NewApi"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EncoderDebugger {
    public static final String TAG = "EncoderDebugger";

    /* renamed from: a  reason: collision with root package name */
    private int f11181a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private MediaCodec f11182d;

    /* renamed from: e  reason: collision with root package name */
    private int f11183e;

    /* renamed from: f  reason: collision with root package name */
    private int f11184f;

    /* renamed from: g  reason: collision with root package name */
    private int f11185g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f11186h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f11187i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f11188j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f11189k;

    /* renamed from: l  reason: collision with root package name */
    private NV21Convert f11190l;

    /* renamed from: m  reason: collision with root package name */
    private SharedPreferences f11191m;

    /* renamed from: n  reason: collision with root package name */
    private byte[][] f11192n;

    /* renamed from: o  reason: collision with root package name */
    private byte[][] f11193o;

    /* renamed from: p  reason: collision with root package name */
    private String f11194p;
    private String q;

    private EncoderDebugger(SharedPreferences sharedPreferences, int i2, int i3) {
    }

    private void a() {
    }

    private void a(boolean z) {
    }

    private void a(boolean z, String str) {
    }

    private void b() {
    }

    private boolean c() {
    }

    private void d() {
    }

    public static synchronized EncoderDebugger debug(Context context, int i2, int i3) {
    }

    public static synchronized EncoderDebugger debug(SharedPreferences sharedPreferences, int i2, int i3) {
    }

    private void e() throws IOException {
    }

    private void f() {
    }

    private long g() {
    }

    private long h() {
    }

    public int getEncoderColorFormat() {
    }

    public String getEncoderName() {
    }

    public String getErrorLog() {
    }

    public NV21Convert getNV21Convertor() {
    }

    public String toString() {
    }
}

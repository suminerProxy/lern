package com.tencent.thumbplayer.h;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.thumbplayer.h.b.c;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13261a;
    public boolean b;
    @Nullable
    private c c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.thumbplayer.h.a.a f13262d;

    /* renamed from: e  reason: collision with root package name */
    private final com.tencent.thumbplayer.h.g.a f13263e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13264f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13265g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final String f13266h;

    /* renamed from: i  reason: collision with root package name */
    private EnumC0251b f13267i;

    /* renamed from: com.tencent.thumbplayer.h.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13268a;

        public AnonymousClass1(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.h.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13269a;

        public AnonymousClass2(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a {
        public abstract void onError(@NonNull b bVar, @NonNull MediaCodec.CodecException codecException);

        public abstract void onInputBufferAvailable(@NonNull b bVar, int i2);

        public abstract void onOutputBufferAvailable(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo);

        public abstract void onOutputFormatChanged(@NonNull b bVar, @NonNull MediaFormat mediaFormat);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* renamed from: com.tencent.thumbplayer.h.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EnumC0251b {

        /* renamed from: a  reason: collision with root package name */
        public static final EnumC0251b f13271a = null;
        public static final EnumC0251b b = null;
        private static final /* synthetic */ EnumC0251b[] c = null;

        private EnumC0251b(String str, int i2) {
        }

        public static EnumC0251b valueOf(String str) {
        }

        public static EnumC0251b[] values() {
        }
    }

    @TargetApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends MediaCodec.Callback {
        @NonNull

        /* renamed from: a  reason: collision with root package name */
        private final b f13272a;
        @Nullable
        private final a b;

        public c(@NonNull b bVar, @Nullable a aVar) {
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(@NonNull MediaCodec mediaCodec, @NonNull MediaCodec.CodecException codecException) {
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, int i2) {
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(@NonNull MediaCodec mediaCodec, int i2, @NonNull MediaCodec.BufferInfo bufferInfo) {
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        }
    }

    private b(String str, EnumC0251b enumC0251b) {
    }

    public static /* synthetic */ c a(b bVar) {
    }

    public static b a(@NonNull String str) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.h.a.a b(b bVar) {
    }

    private void b(Surface surface) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.h.g.a c(b bVar) {
    }

    private void m() {
    }

    private void n() {
    }

    private void o() {
    }

    public final int a(long j2) {
    }

    public final int a(@NonNull MediaCodec.BufferInfo bufferInfo, long j2) {
    }

    public final EnumC0251b a() {
    }

    @Nullable
    @TargetApi(21)
    public final ByteBuffer a(int i2) {
    }

    public final void a(int i2, int i3, int i4, long j2, int i5) {
    }

    public final void a(int i2, int i3, @NonNull MediaCodec.CryptoInfo cryptoInfo, long j2, int i4) {
    }

    public final void a(int i2, boolean z) {
    }

    public final void a(@NonNull MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2) {
    }

    @TargetApi(19)
    public final void a(@Nullable Bundle bundle) {
    }

    @TargetApi(23)
    public final void a(@NonNull Surface surface) {
    }

    public final void a(@Nullable com.tencent.thumbplayer.h.a.a aVar) {
    }

    @TargetApi(23)
    public final void a(@NonNull a aVar, @Nullable Handler handler) {
    }

    public final void a(boolean z) {
    }

    @Nullable
    @TargetApi(21)
    public final Image b(int i2) {
    }

    public final boolean b() {
    }

    public final com.tencent.thumbplayer.h.a.a c() {
    }

    @Nullable
    @TargetApi(21)
    public final ByteBuffer c(int i2) {
    }

    public final void d(int i2) {
    }

    public final boolean d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    @NonNull
    @Nullable
    public final MediaFormat i() {
    }

    @NonNull
    @Nullable
    public final ByteBuffer[] j() {
    }

    @NonNull
    @Nullable
    public final ByteBuffer[] k() {
    }

    @NonNull
    public final String l() {
    }
}

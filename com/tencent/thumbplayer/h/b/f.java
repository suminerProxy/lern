package com.tencent.thumbplayer.h.b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.h.f.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiresApi(api = 23)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class f implements c {

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Surface, f> f13284i = null;
    private int A;
    private com.tencent.thumbplayer.h.e.a.a B;
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public b f13285a;
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13286d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final e f13287e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Surface f13288f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final com.tencent.thumbplayer.h.b.b f13289g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13290h;

    /* renamed from: j  reason: collision with root package name */
    private final String f13291j;

    /* renamed from: k  reason: collision with root package name */
    private final a.EnumC0252a f13292k;

    /* renamed from: l  reason: collision with root package name */
    private final HashSet<Integer> f13293l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<Long> f13294m;

    /* renamed from: n  reason: collision with root package name */
    private final Set<SurfaceTexture> f13295n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f13296o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final MediaCodec f13297p;
    private boolean q;
    @NonNull
    private a r;
    @Nullable
    private MediaCodecInfo.CodecCapabilities s;
    private long t;
    @Nullable
    private com.tencent.thumbplayer.h.a.a u;
    private boolean v;
    @NonNull
    private a.b w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: com.tencent.thumbplayer.h.b.f$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f13298a;

        public AnonymousClass1(f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.h.b.f$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13299a = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13300a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final a f13301d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final a f13302e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final a f13303f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final a f13304g = null;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ a[] f13305h = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13306a = null;
        public static final b b = null;
        public static final b c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final b f13307d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final b f13308e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ b[] f13309f = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    public f(@NonNull MediaCodec mediaCodec, @NonNull e eVar) {
    }

    public static /* synthetic */ MediaCodec a(f fVar) {
    }

    public static c a(@NonNull MediaCodec mediaCodec, @NonNull String str, @NonNull e eVar) {
    }

    private void a(int i2) {
    }

    private void a(int i2, int i3) {
    }

    private void a(int i2, String str, Throwable th) {
    }

    private void a(int i2, String str, Throwable th, boolean z, Surface surface) {
    }

    @TargetApi(23)
    private void a(Surface surface, boolean z, boolean z2) {
    }

    public static /* synthetic */ String b(f fVar) {
    }

    private final void b(int i2, int i3, int i4, long j2, int i5) {
    }

    private void b(@NonNull MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2) {
    }

    private void b(Surface surface) {
    }

    private boolean b(int i2, int i3) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.h.a.a c(f fVar) {
    }

    private final void c(int i2, int i3, int i4, long j2, int i5) {
    }

    @TargetApi(23)
    private void c(Surface surface) {
    }

    private int d(Surface surface) {
    }

    private boolean n() {
    }

    private void o() {
    }

    private void p() {
    }

    private void q() {
    }

    private void r() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public int a(long j2) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public int a(@NonNull MediaCodec.BufferInfo bufferInfo, long j2) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    @NonNull
    public MediaCodec a() {
    }

    @NonNull
    public abstract a.b a(@NonNull e eVar);

    @Override // com.tencent.thumbplayer.h.b.c
    public void a(int i2, int i3, int i4, long j2, int i5) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void a(int i2, boolean z) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void a(@NonNull MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    @TargetApi(23)
    public void a(@NonNull Surface surface) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void a(@Nullable com.tencent.thumbplayer.h.a.a aVar) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    @NonNull
    public a.b b(@NonNull e eVar) {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void b() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void c() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void d() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void e() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void f() {
    }

    @Override // com.tencent.thumbplayer.h.b.c
    public void g() {
    }

    @Nullable
    public final com.tencent.thumbplayer.h.a.a h() {
    }

    public final void i() {
    }

    public boolean j() {
    }

    public void k() {
    }

    public boolean l() {
    }

    public String m() {
    }

    @NonNull
    public String toString() {
    }
}

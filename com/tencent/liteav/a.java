package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.txcplayer.d;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.b.c;
import com.tencent.liteav.txcvodplayer.b.e;
import com.tencent.liteav.txcvodplayer.renderer.c;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a implements c.a {
    private Map<String, Object> A;
    private int B;
    private int C;
    private int D;
    private String E;
    private C0186a F;
    private boolean G;
    private boolean H;
    private d I;

    /* renamed from: a  reason: collision with root package name */
    public TXCloudVideoView f11311a;
    public ITXLivePlayListener b;
    public ITXVodPlayListener c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<TXVodPlayer> f11312d;

    /* renamed from: e  reason: collision with root package name */
    public TXCVodVideoView f11313e;

    /* renamed from: f  reason: collision with root package name */
    public TXVodPlayConfig f11314f;

    /* renamed from: g  reason: collision with root package name */
    public com.tencent.liteav.txcvodplayer.a.a f11315g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11316h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11317i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11318j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11319k;

    /* renamed from: l  reason: collision with root package name */
    public Surface f11320l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11321m;

    /* renamed from: n  reason: collision with root package name */
    public String f11322n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11323o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11324p;
    public int q;
    public com.tencent.liteav.txcvodplayer.b.d r;
    public boolean s;
    public boolean t;
    public boolean u;
    public float v;
    public com.tencent.liteav.txcvodplayer.renderer.c w;
    public Object x;
    private Context y;
    private float z;

    /* renamed from: com.tencent.liteav.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXLivePlayer.ITXSnapshotListener f11328a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ a c;

        public AnonymousClass4(a aVar, TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, Bitmap bitmap) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0186a {

        /* renamed from: a  reason: collision with root package name */
        public Class f11329a;
        public Class b;
        public Class c;

        /* renamed from: d  reason: collision with root package name */
        public Field f11330d;

        /* renamed from: e  reason: collision with root package name */
        public Field f11331e;

        /* renamed from: f  reason: collision with root package name */
        public Field f11332f;

        /* renamed from: g  reason: collision with root package name */
        public Field f11333g;

        /* renamed from: h  reason: collision with root package name */
        public Field f11334h;

        /* renamed from: i  reason: collision with root package name */
        public Field f11335i;

        /* renamed from: j  reason: collision with root package name */
        public Field f11336j;

        /* renamed from: k  reason: collision with root package name */
        public Field f11337k;

        /* renamed from: l  reason: collision with root package name */
        public Field f11338l;

        public C0186a(Object obj) {
        }
    }

    public a(Context context) {
    }

    private int c(String str) {
    }

    public final void a(TXVodPlayConfig tXVodPlayConfig) {
    }

    public final void b(int i2) {
    }

    public final void d() {
    }

    public final void e() {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.c.a
    public final void f() {
    }

    public final void b(float f2) {
    }

    public final void b(boolean z) {
    }

    public final void b() {
    }

    private String b(String str) {
    }

    /* renamed from: com.tencent.liteav.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f11325a;

        public AnonymousClass1(a aVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.e
        public final void a(com.tencent.liteav.txcvodplayer.b.d dVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.e
        public final void a(com.tencent.liteav.txcvodplayer.b.d dVar, String str, int i2) {
        }
    }

    public final int a(String str) {
    }

    public final int a(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
    }

    public final int a(boolean z) {
    }

    public final void c(int i2) {
    }

    public final void c() {
    }

    private void c(boolean z) {
    }

    /* renamed from: com.tencent.liteav.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f11326a;

        public AnonymousClass2(a aVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.c.a
        public final void a(com.tencent.liteav.txcvodplayer.b.c cVar, TXPlayInfoParams tXPlayInfoParams) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.c.a
        public final void a(int i2, String str) {
        }
    }

    public final void a(int i2) {
    }

    public final TextureView a() {
    }

    public final void a(float f2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.c.a
    public final void a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.c.a
    public final void a(PixelFrame pixelFrame) {
    }

    public static /* synthetic */ void a(a aVar, int i2, Bundle bundle) {
    }

    /* renamed from: com.tencent.liteav.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f11327a;

        public AnonymousClass3(a aVar) {
        }

        @Override // com.tencent.liteav.txcplayer.d
        public final void a(int i2, Bundle bundle) {
        }

        @Override // com.tencent.liteav.txcplayer.d
        public final void a(Bundle bundle) {
        }
    }
}

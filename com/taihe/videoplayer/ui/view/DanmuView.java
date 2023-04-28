package com.taihe.videoplayer.ui.view;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.tai.danmuku.danmu.widget.DanmakuView;
import h.w.a.e.a.c;
import h.w.a.e.b.b.f;
import h.w.a.e.b.b.m;
import h.w.a.e.b.b.s.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DanmuView extends DanmakuView {
    private Context b;
    private d c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7928d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f7929e;

    /* renamed from: f  reason: collision with root package name */
    private c f7930f;

    /* renamed from: g  reason: collision with root package name */
    private final h.w.a.e.b.c.a f7931g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements c.d {
        public final /* synthetic */ DanmuView b;

        public a(DanmuView danmuView) {
        }

        @Override // h.w.a.e.a.c.d
        public void danmakuShown(h.w.a.e.b.b.d dVar) {
        }

        @Override // h.w.a.e.a.c.d
        public void drawingFinished() {
        }

        @Override // h.w.a.e.a.c.d
        public void prepared() {
        }

        @Override // h.w.a.e.a.c.d
        public void updateTimer(f fVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends h.w.a.e.b.c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DanmuView f7932a;

        public b(DanmuView danmuView) {
        }

        @Override // h.w.a.e.b.c.a
        public m parse() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends Handler {
        public static final int b = 1001;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DanmuView f7933a;

        public c(DanmuView danmuView, Looper looper) {
        }

        private void a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public DanmuView(Context context) {
    }

    public static /* synthetic */ boolean a(DanmuView danmuView, boolean z) {
    }

    public static /* synthetic */ void b(DanmuView danmuView) {
    }

    public static /* synthetic */ c c(DanmuView danmuView) {
    }

    public static /* synthetic */ void d(DanmuView danmuView, String str, boolean z) {
    }

    private void e(String str, boolean z) {
    }

    private void f() {
    }

    private void g(Context context) {
    }

    public int h(Context context, float f2) {
    }

    public void i(boolean z) {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.f
    public void release() {
    }

    public DanmuView(Context context, AttributeSet attributeSet) {
    }

    public DanmuView(Context context, AttributeSet attributeSet, int i2) {
    }
}

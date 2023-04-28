package com.tencent.liteav.videoproducer.capture;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.view.Surface;
import com.tencent.liteav.base.util.t;
import java.util.Map;

@TargetApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class bd {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bd f12462a;
    private final Context b;
    private final Handler c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tencent.liteav.base.util.l f12463d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Surface, a> f12464e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12465f;

    /* renamed from: g  reason: collision with root package name */
    private MediaProjection f12466g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.liteav.base.util.t f12467h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12468i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f12469j;

    /* renamed from: k  reason: collision with root package name */
    private final MediaProjection.Callback f12470k;

    /* renamed from: l  reason: collision with root package name */
    private final t.a f12471l;

    /* renamed from: com.tencent.liteav.videoproducer.capture.bd$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends MediaProjection.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bd f12472a;

        public AnonymousClass1(bd bdVar) {
        }

        public static /* synthetic */ void a(bd bdVar) {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.bd$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements t.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bd f12473a;

        public AnonymousClass2(bd bdVar) {
        }

        @Override // com.tencent.liteav.base.util.t.a
        public final void a_() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Surface f12474a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public b f12475d;

        /* renamed from: e  reason: collision with root package name */
        public VirtualDisplay f12476e;

        private a() {
        }

        public /* synthetic */ a(byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void a(boolean z);

        void a(boolean z, boolean z2);

        void e();
    }

    private bd(Context context) {
    }

    public static bd a(Context context) {
    }

    public static /* synthetic */ com.tencent.liteav.base.util.l b(bd bdVar) {
    }

    public static /* synthetic */ void c(bd bdVar) {
    }

    public static /* synthetic */ void d(bd bdVar) {
    }

    private static void b(MediaProjection mediaProjection) {
    }

    public static /* synthetic */ void a(bd bdVar) {
    }

    private static boolean b(Context context) {
    }

    public final void a(Surface surface, int i2, int i3, MediaProjection mediaProjection, b bVar) {
    }

    public final void a(Surface surface) {
    }

    private void a() {
    }

    private void a(boolean z) {
    }

    public final void a(MediaProjection mediaProjection) {
    }

    public static /* synthetic */ void a(bd bdVar, MediaProjection mediaProjection) {
    }

    public static /* synthetic */ void a(bd bdVar, Surface surface) {
    }

    public static /* synthetic */ void a(bd bdVar, Surface surface, int i2, int i3, MediaProjection mediaProjection, b bVar) {
    }
}

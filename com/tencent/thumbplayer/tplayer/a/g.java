package com.tencent.thumbplayer.tplayer.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.thumbplayer.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class g implements ITPExtendReportController, com.tencent.thumbplayer.e.a {

    /* renamed from: k  reason: collision with root package name */
    private static final Map<Integer, Integer> f13469k = null;

    /* renamed from: a  reason: collision with root package name */
    private ITPReportInfoGetter f13470a;
    private HandlerThread b;
    private a c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.thumbplayer.tplayer.a.a f13471d;

    /* renamed from: e  reason: collision with root package name */
    private l f13472e;

    /* renamed from: f  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> f13473f;

    /* renamed from: g  reason: collision with root package name */
    private Context f13474g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.thumbplayer.tplayer.a.a.a f13475h;

    /* renamed from: i  reason: collision with root package name */
    private h f13476i;

    /* renamed from: j  reason: collision with root package name */
    private Object f13477j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f13478a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ com.tencent.thumbplayer.tplayer.a.a a(g gVar) {
    }

    private void a(int i2) {
    }

    private void a(int i2, Object obj) {
    }

    public static /* synthetic */ void a(g gVar, int i2, Object obj) {
    }

    private void a(Object obj) {
    }

    private void b(int i2, Object obj) {
    }

    public static /* synthetic */ void b(g gVar, int i2, Object obj) {
    }

    private void b(Object obj) {
    }

    private void c(Object obj) {
    }

    private void d(Object obj) {
    }

    private void e(Object obj) {
    }

    private void f(Object obj) {
    }

    private void g(Object obj) {
    }

    @Override // com.tencent.thumbplayer.e.a
    public void a(com.tencent.thumbplayer.e.b bVar) {
    }

    @Override // com.tencent.thumbplayer.api.reportv2.ITPExtendReportController
    public void addReportChannelListener(@NonNull ITPReportChannelListener iTPReportChannelListener) {
    }

    @Override // com.tencent.thumbplayer.api.reportv2.ITPExtendReportController
    public void setReportInfoGetter(@Nullable ITPReportInfoGetter iTPReportInfoGetter) {
    }
}

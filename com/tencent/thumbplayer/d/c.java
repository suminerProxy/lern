package com.tencent.thumbplayer.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.utils.f;
import com.tencent.thumbplayer.utils.i;
import com.tencent.thumbplayer.utils.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c implements com.tencent.thumbplayer.d.a, f.a, i.b {

    /* renamed from: g  reason: collision with root package name */
    private static int f13197g = -1;

    /* renamed from: a  reason: collision with root package name */
    private Context f13198a;
    private a b;
    private ITPDownloadProxy c;

    /* renamed from: d  reason: collision with root package name */
    private int f13199d;

    /* renamed from: e  reason: collision with root package name */
    private b f13200e;

    /* renamed from: f  reason: collision with root package name */
    private ITPPlayListener f13201f;

    /* renamed from: h  reason: collision with root package name */
    private int f13202h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<TPDownloadParamData> f13203i;

    /* renamed from: j  reason: collision with root package name */
    private String f13204j;

    /* renamed from: k  reason: collision with root package name */
    private int f13205k;

    /* renamed from: l  reason: collision with root package name */
    private TPVideoInfo f13206l;

    /* renamed from: m  reason: collision with root package name */
    private String f13207m;

    /* renamed from: n  reason: collision with root package name */
    private ITPPlayerProxyListener f13208n;

    /* renamed from: o  reason: collision with root package name */
    private LinkedList<C0247c> f13209o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<String, Integer> f13210p;
    private long q;
    private long r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private m x;

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13211a;

        public a(c cVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b implements ITPPlayListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13212a;

        private b(c cVar) {
        }

        public /* synthetic */ b(c cVar, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPlayOffset() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i2, String str, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i2, String str, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i2, String str, int i3) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.d.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0247c {

        /* renamed from: a  reason: collision with root package name */
        public long f13213a;
        public int b;

        public C0247c(long j2, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f13214a;
        public int b;

        public d(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f13215a;
        public com.tencent.thumbplayer.utils.e b;

        private e() {
        }

        public /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f13216a;
        public Object b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public Object f13217d;

        /* renamed from: e  reason: collision with root package name */
        public Object f13218e;

        private f() {
        }

        public /* synthetic */ f(AnonymousClass1 anonymousClass1) {
        }
    }

    public c(Context context, Looper looper) {
    }

    private int a(List<ITPMediaTrackClip> list, String str, ArrayList<TPDownloadParamData> arrayList) {
    }

    private com.tencent.thumbplayer.adapter.a.e a(long j2, String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
    }

    private TPDownloadParamData a(ArrayList<TPDownloadParamData> arrayList, int i2) {
    }

    public static /* synthetic */ ITPPlayListener a(c cVar) {
    }

    private TPDownloadParam a(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
    }

    public static /* synthetic */ Object a(c cVar, com.tencent.thumbplayer.utils.e eVar) {
    }

    private Object a(com.tencent.thumbplayer.utils.e eVar) {
    }

    private void a(int i2, int i3, int i4, Object obj, boolean z, boolean z2, long j2) {
    }

    private void a(int i2, Object obj) {
    }

    public static /* synthetic */ void a(c cVar, int i2) {
    }

    public static /* synthetic */ void a(c cVar, int i2, int i3, int i4, Object obj, boolean z, boolean z2, long j2) {
    }

    public static /* synthetic */ void a(c cVar, int i2, Object obj) {
    }

    private List<ITPMediaTrackClip> b(ITPMediaAsset iTPMediaAsset) {
    }

    private void b(TPVideoInfo tPVideoInfo) {
    }

    public static /* synthetic */ void b(c cVar, int i2) {
    }

    private boolean b(String str, String str2) {
    }

    private void c(int i2) {
    }

    private void d(int i2) {
    }

    private void e(int i2) {
    }

    private String f(int i2) {
    }

    private void g(int i2) {
    }

    private void h(int i2) {
    }

    private boolean k() {
    }

    private void l() {
    }

    private void m() {
    }

    private void n() {
    }

    private boolean o() {
    }

    private String p() {
    }

    private void q() {
    }

    private void r() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public com.tencent.thumbplayer.adapter.a.e a(long j2, String str, TPVideoInfo tPVideoInfo, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.d.a
    @NonNull
    public com.tencent.thumbplayer.adapter.a.e a(String str, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.d.a
    @NonNull
    public ITPMediaAsset a(@NonNull ITPMediaAsset iTPMediaAsset) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public ITPMediaAsset a(ITPMediaAsset iTPMediaAsset, long j2, TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public String a(int i2, String str, TPDownloadParamData tPDownloadParamData) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(int i2) {
    }

    @Override // com.tencent.thumbplayer.utils.i.b
    public void a(int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.thumbplayer.utils.f.a
    public void a(int i2, int i3, int i4, Object obj) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(long j2) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(TPOptionalParam tPOptionalParam) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(ITPPlayListener iTPPlayListener) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(String str, Object obj) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void a(boolean z) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public boolean a() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void b() {
    }

    public void b(int i2) {
    }

    @Override // com.tencent.thumbplayer.d.a
    public boolean c() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void d() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void e() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public boolean f() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public String g() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void h() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public void i() {
    }

    @Override // com.tencent.thumbplayer.d.a
    public ITPPlayerProxyListener j() {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void pushEvent(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setIsActive(boolean z) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setProxyServiceType(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener) {
    }
}

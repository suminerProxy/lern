package com.tencent.thumbplayer.d;

import android.content.Context;
import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e implements ITPPreloadProxy {

    /* renamed from: a  reason: collision with root package name */
    private Context f13220a;
    private int b;
    private ITPDownloadProxy c;

    /* renamed from: d  reason: collision with root package name */
    private a f13221d;

    /* renamed from: e  reason: collision with root package name */
    private ITPPreloadProxy.IPreloadListener f13222e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13223f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements ITPDLProxyLogListener, ITPPreLoadListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13224a;

        private a(e eVar) {
        }

        public /* synthetic */ a(e eVar, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int d(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int e(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int i(String str, int i2, String str2, String str3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareOK() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int w(String str, int i2, String str2, String str3) {
        }
    }

    public e(Context context, int i2) {
    }

    public static /* synthetic */ ITPPreloadProxy.IPreloadListener a(e eVar) {
    }

    private void a() {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public String getPlayErrorCodeStr(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public boolean isAvailable() {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void pushEvent(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void setPreloadListener(ITPPreloadProxy.IPreloadListener iPreloadListener) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startClipPreload(String str, ArrayList<TPDownloadParamData> arrayList) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void stopPreload(int i2) {
    }
}

package com.tencent.rtmp.downloader;

import android.content.Context;
import android.util.Pair;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVodPreloadManager {
    private static final String TAG = "TXVodPreloadManager";
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static Context mAppContext;
    private boolean mInit;
    private ITPDownloadProxy mTpDownloadProxy;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static TXVodPreloadManager f12918a;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b implements ITPPreLoadListener {

        /* renamed from: a  reason: collision with root package name */
        public int f12919a;
        private final ITXVodPreloadListener b;
        private final String c;

        public b(String str, ITXVodPreloadListener iTXVodPreloadListener) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareOK() {
        }
    }

    public /* synthetic */ TXVodPreloadManager(AnonymousClass1 anonymousClass1) {
    }

    private synchronized Pair<Integer, String> checkInit() {
    }

    public static TXVodPreloadManager getInstance(Context context) {
    }

    public int startPreload(String str, int i2, long j2, ITXVodPreloadListener iTXVodPreloadListener) {
    }

    public void stopPreload(int i2) {
    }

    private TXVodPreloadManager() {
    }
}

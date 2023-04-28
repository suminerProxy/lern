package com.tencent.liteav.thumbplayer.downloader;

import android.content.Context;
import com.tencent.liteav.txcplayer.b.a;
import com.tencent.liteav.txcplayer.b.b;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ThumbPlayerDownloader extends a {
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static ThumbPlayerDownloader sInstance;
    private ITPDownloadProxy mTpDownloadProxy;

    /* renamed from: com.tencent.liteav.thumbplayer.downloader.ThumbPlayerDownloader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ITPOfflineDownloadListener {
        public final /* synthetic */ ThumbPlayerDownloader this$0;
        public final /* synthetic */ b val$downloadMedia;

        public AnonymousClass1(ThumbPlayerDownloader thumbPlayerDownloader, b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadCdnUrlUpdate(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadProtocolUpdate(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener
        public void onDownloadStatusUpdate(int i2) {
        }
    }

    private ThumbPlayerDownloader(Context context) {
    }

    public static /* synthetic */ a.InterfaceC0195a access$000(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ a.InterfaceC0195a access$100(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ String access$1000() {
    }

    public static /* synthetic */ a.InterfaceC0195a access$200(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ a.InterfaceC0195a access$300(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ String access$400() {
    }

    public static /* synthetic */ a.InterfaceC0195a access$500(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ a.InterfaceC0195a access$600(ThumbPlayerDownloader thumbPlayerDownloader) {
    }

    public static /* synthetic */ String access$700() {
    }

    public static /* synthetic */ String access$800() {
    }

    public static /* synthetic */ String access$900() {
    }

    public static ThumbPlayerDownloader getInstance(Context context) {
    }

    @Override // com.tencent.liteav.txcplayer.b.a
    public boolean deleteDownloadFile(String str) {
    }

    @Override // com.tencent.liteav.txcplayer.b.a
    public int downloadHls(String str, String str2) {
    }

    @Override // com.tencent.liteav.txcplayer.b.a
    public String makePlayPath(String str) {
    }

    @Override // com.tencent.liteav.txcplayer.b.a
    public void setDownloadPath(String str) {
    }

    @Override // com.tencent.liteav.txcplayer.b.a
    public void stop(int i2) {
    }
}

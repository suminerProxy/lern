package com.tencent.rtmp.downloader.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.txcplayer.b.a;
import com.tencent.liteav.txcvodplayer.b.a;
import com.tencent.liteav.txcvodplayer.b.c;
import com.tencent.liteav.txcvodplayer.b.d;
import com.tencent.liteav.txcvodplayer.b.e;
import com.tencent.liteav.txcvodplayer.b.f;
import com.tencent.liteav.txcvodplayer.b.g;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.downloader.ITXVodDownloadListener;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.rtmp.downloader.TXVodDownloadManager;
import com.tencent.rtmp.downloader.TXVodDownloadMediaInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b extends TXVodDownloadManager {

    /* renamed from: a  reason: collision with root package name */
    public a.InterfaceC0195a f12920a;
    private com.tencent.liteav.txcplayer.b.a b;
    private ArrayList<c> c;

    /* renamed from: d  reason: collision with root package name */
    private ITXVodDownloadListener f12921d;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f12922e;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences.Editor f12923f;

    public static /* synthetic */ ArrayList a(b bVar) {
    }

    public static /* synthetic */ ITXVodDownloadListener b(b bVar) {
    }

    private c c(TXVodDownloadDataSource tXVodDownloadDataSource) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final boolean deleteDownloadFile(String str) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final boolean deleteDownloadMediaInfo(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final TXVodDownloadMediaInfo getDownloadMediaInfo(int i2, String str, int i3) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final List<TXVodDownloadMediaInfo> getDownloadMediaInfoList() {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final void setDownloadPath(String str) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final void setHeaders(Map<String, String> map) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final /* synthetic */ TXVodDownloadMediaInfo startDownload(TXVodDownloadDataSource tXVodDownloadDataSource) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final /* synthetic */ TXVodDownloadMediaInfo startDownloadUrl(String str, String str2) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    public static /* synthetic */ void a(b bVar, c cVar) {
    }

    private c b(TXVodDownloadDataSource tXVodDownloadDataSource) {
    }

    public static /* synthetic */ boolean a(String str) {
    }

    private static Context a() {
    }

    /* renamed from: com.tencent.rtmp.downloader.a.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements a.InterfaceC0195a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12929a;

        public AnonymousClass4(b bVar) {
        }

        @Override // com.tencent.liteav.txcplayer.b.a.InterfaceC0195a
        public final void a(com.tencent.liteav.txcplayer.b.b bVar) {
        }

        @Override // com.tencent.liteav.txcplayer.b.a.InterfaceC0195a
        public final void b(com.tencent.liteav.txcplayer.b.b bVar) {
        }

        @Override // com.tencent.liteav.txcplayer.b.a.InterfaceC0195a
        public final void c(com.tencent.liteav.txcplayer.b.b bVar) {
        }

        @Override // com.tencent.liteav.txcplayer.b.a.InterfaceC0195a
        public final void d(com.tencent.liteav.txcplayer.b.b bVar) {
        }

        @Override // com.tencent.liteav.txcplayer.b.a.InterfaceC0195a
        public final void a(com.tencent.liteav.txcplayer.b.b bVar, int i2, String str) {
        }
    }

    private static c c(String str) {
    }

    public final c a(String str, String str2) {
    }

    public final c a(TXVodDownloadDataSource tXVodDownloadDataSource) {
    }

    @Override // com.tencent.rtmp.downloader.TXVodDownloadManager
    public final TXVodDownloadMediaInfo getDownloadMediaInfo(String str) {
    }

    private c a(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    private static boolean b(String str) {
    }

    /* renamed from: com.tencent.rtmp.downloader.a.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f12926a;
        public final /* synthetic */ b b;

        public AnonymousClass2(b bVar, c cVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.c.a
        public final void a(com.tencent.liteav.txcvodplayer.b.c cVar, TXPlayInfoParams tXPlayInfoParams) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.c.a
        public final void a(int i2, String str) {
        }
    }

    private static String b(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    /* renamed from: com.tencent.rtmp.downloader.a.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f12924a;
        public final /* synthetic */ TXVodDownloadDataSource b;
        public final /* synthetic */ a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f12925d;

        public AnonymousClass1(b bVar, c cVar, TXVodDownloadDataSource tXVodDownloadDataSource, a aVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.e
        public final void a(d dVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.e
        public final void a(d dVar, String str, int i2) {
        }
    }

    public static /* synthetic */ String b(String str, String str2) {
    }

    private void a(c cVar) {
    }

    public static /* synthetic */ void b(b bVar, c cVar) {
    }

    private static String a(String str, c cVar) {
    }

    /* renamed from: com.tencent.rtmp.downloader.a.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f12927a;
        public final /* synthetic */ com.tencent.liteav.txcvodplayer.b.c b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f12928d;

        public AnonymousClass3(b bVar, c cVar, com.tencent.liteav.txcvodplayer.b.c cVar2, String str) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.a.b
        public final void a(String str) {
        }

        @Override // com.tencent.liteav.txcvodplayer.b.a.b
        public final void a() {
        }
    }

    public static g a(f fVar, int i2) {
    }

    public final c a(com.tencent.liteav.txcplayer.b.b bVar) {
    }

    public static g a(f fVar, String str) {
    }

    public static /* synthetic */ void a(b bVar, c cVar, com.tencent.liteav.txcvodplayer.b.c cVar2) {
    }
}

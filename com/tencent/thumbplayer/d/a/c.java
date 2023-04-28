package com.tencent.thumbplayer.d.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest;
import com.tencent.thumbplayer.utils.m;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c implements ITPAssetResourceLoadingDataRequest {

    /* renamed from: a  reason: collision with root package name */
    private static String f13182a = "TPAssetResourceLoadingDataRequest";
    private long b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13183d;

    /* renamed from: e  reason: collision with root package name */
    private long f13184e;

    /* renamed from: f  reason: collision with root package name */
    private long f13185f;

    /* renamed from: g  reason: collision with root package name */
    private long f13186g;

    /* renamed from: h  reason: collision with root package name */
    private int f13187h;

    /* renamed from: i  reason: collision with root package name */
    private b f13188i;

    /* renamed from: j  reason: collision with root package name */
    private m f13189j;

    /* renamed from: k  reason: collision with root package name */
    private String f13190k;

    /* renamed from: l  reason: collision with root package name */
    private RandomAccessFile f13191l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f13192a;
        public byte[] b;

        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13193a;

        public b(c cVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public c(long j2, long j3, boolean z) {
    }

    public static /* synthetic */ long a(c cVar, long j2) {
    }

    public static /* synthetic */ String a(c cVar) {
    }

    private void a(int i2, int i3, int i4, Object obj) {
    }

    private boolean a(long j2, byte[] bArr, String str) {
    }

    public static /* synthetic */ boolean a(c cVar, long j2, byte[] bArr, String str) {
    }

    public static /* synthetic */ m b(c cVar) {
    }

    public static /* synthetic */ String c() {
    }

    public int a() {
    }

    public int a(long j2) {
    }

    public void a(int i2) {
    }

    public void a(Looper looper) {
    }

    public void a(String str) {
    }

    public void b() {
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getCurrentOffset() {
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedLength() {
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedOffset() {
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void notifyDataReady(long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void respondWithData(byte[] bArr) {
    }
}

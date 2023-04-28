package com.tencent.rtmp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.rtmp.TXImageSprite;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a extends TXImageSprite {

    /* renamed from: a  reason: collision with root package name */
    private final BitmapFactory.Options f12906a;
    private HandlerThread b;
    private Handler c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f12907d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, BitmapRegionDecoder> f12908e;

    /* renamed from: com.tencent.rtmp.a.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12909a;

        public AnonymousClass1(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.rtmp.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class RunnableC0238a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f12910a;
        private String b;

        public RunnableC0238a(a aVar, String str) {
        }

        private static float a(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f12911a;
        private String b;
        private String c;

        public b(a aVar, String str, String str2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float f12912a;
        public float b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f12913d;

        /* renamed from: e  reason: collision with root package name */
        public int f12914e;

        /* renamed from: f  reason: collision with root package name */
        public int f12915f;

        /* renamed from: g  reason: collision with root package name */
        public int f12916g;

        /* renamed from: h  reason: collision with root package name */
        public int f12917h;

        private c() {
        }

        public /* synthetic */ c(byte b) {
        }
    }

    public a(Context context) {
    }

    public static /* synthetic */ List a(a aVar) {
    }

    public static /* synthetic */ Map b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final Bitmap getThumbnail(float f2) {
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void release() {
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void setVTTUrlAndImageUrls(String str, List<String> list) {
    }

    private void a() {
    }

    public static /* synthetic */ InputStream a(String str) throws IOException {
    }
}

package com.mob.moblink.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.moblink.beans.ConfigData;
import com.mob.moblink.beans.LinkData;
import com.mob.moblink.beans.LogData;
import com.mob.moblink.beans.SceneData;
import com.mob.moblink.beans.ServerData;
import com.mob.moblink.utils.AsyncProtocol;
import com.mob.tools.network.HttpConnection;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* compiled from: Protocol.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static String f3942a;
    private static Hashon b;
    private static ConfigData c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f3943d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3944e = null;

    /* compiled from: Protocol.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3945a;

        /* compiled from: Protocol.java */
        /* renamed from: com.mob.moblink.utils.i$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C0108a implements HttpResponseCallback {
            public C0108a(a aVar) {
            }

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        }

        public a(String str) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: Protocol.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b implements HttpResponseCallback {
        @Override // com.mob.tools.network.HttpResponseCallback
        public void onResponse(HttpConnection httpConnection) throws Throwable {
        }
    }

    /* compiled from: Protocol.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncProtocol.DataListener f3946a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        /* compiled from: Protocol.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f3947a;

            public a(c cVar, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        /* compiled from: Protocol.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Handler f3948a;
            public final /* synthetic */ c b;

            public b(c cVar, Handler handler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(AsyncProtocol.DataListener dataListener, String str, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ String a() {
    }

    public static /* synthetic */ Hashon b() {
    }

    private static String c(ConfigData configData) {
    }

    private static String d(ConfigData configData) {
    }

    public static void e() {
    }

    private static String f(String str) {
    }

    private static String g(String str) {
    }

    public static void h(String str) {
    }

    public static /* synthetic */ String a(String str) {
    }

    public static /* synthetic */ ConfigData b(ConfigData configData) {
    }

    private static String e(String str) {
    }

    public static /* synthetic */ boolean a(ConfigData configData) {
    }

    private static String b(boolean z, String str) {
    }

    public static /* synthetic */ String a(boolean z, String str) {
    }

    private static boolean e(ConfigData configData) {
    }

    public static /* synthetic */ ServerData a(HashMap hashMap, String str, Class cls) {
    }

    public static LinkData a(String str, HashMap<String, Object> hashMap, String str2) {
    }

    private static String b(String str, String str2) {
    }

    private static <T extends ServerData> T b(HashMap<String, Object> hashMap, String str, Class<T> cls) {
    }

    private static String c(String str) {
    }

    private static String d(String str) {
    }

    public static void c(String str, String str2) {
    }

    private static String d() {
    }

    public static SceneData a(int i2, String str) {
    }

    public static String b(String str) {
    }

    public static ConfigData c() {
    }

    public static LogData a(String str, int i2, int i3, String str2, String str3, String str4) {
    }

    public static ConfigData a(AsyncProtocol.DataListener<ConfigData> dataListener, String str) {
    }

    public static SceneData a(String str, String str2) {
    }
}

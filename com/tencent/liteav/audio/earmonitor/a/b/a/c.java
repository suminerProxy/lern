package com.tencent.liteav.audio.earmonitor.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c extends com.tencent.liteav.audio.earmonitor.a.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public Context f11353a;
    public b b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public com.tencent.liteav.audio.earmonitor.a.a.b f11354d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f11355e;

    /* renamed from: f  reason: collision with root package name */
    public IBinder.DeathRecipient f11356f;

    /* renamed from: g  reason: collision with root package name */
    private ServiceConnection f11357g;

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f11358a;

        public AnonymousClass1(c cVar) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f11359a;

        public AnonymousClass2(c cVar) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11360a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a[] f11361d = null;
        public String mParameName;

        private a(String str, int i2, String str2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public c(Context context) {
    }

    public final void a(Context context) {
    }

    public final void a() {
    }

    public final int a(boolean z) {
    }

    public final int a(a aVar, int i2) {
    }

    public static /* synthetic */ void a(c cVar, IBinder iBinder) {
    }
}

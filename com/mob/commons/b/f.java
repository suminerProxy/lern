package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Context f3514a;
    public String b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3515d;

    /* renamed from: e  reason: collision with root package name */
    private String f3516e;

    /* renamed from: f  reason: collision with root package name */
    private int f3517f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3519a;
        public String b;
    }

    public f(Context context) {
    }

    private synchronized void f() {
    }

    public Intent a() {
    }

    public b a(IBinder iBinder) {
    }

    public synchronized void a(String str) {
    }

    public b b() {
    }

    public long c() {
    }

    public synchronized String d() {
    }

    public synchronized boolean e() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3518a;
        public final /* synthetic */ f b;
        private final BlockingQueue<IBinder> c;

        private a(f fVar) {
        }

        public IBinder a(long j2) throws InterruptedException {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ a(f fVar, AnonymousClass1 anonymousClass1) {
        }
    }

    private synchronized boolean a(Intent intent) {
    }

    public String a(String str, IBinder iBinder, String str2, int i2, String... strArr) {
    }

    public int a(String str, IBinder iBinder, String str2, int i2) {
    }

    private b a(Context context, Intent intent) throws Throwable {
    }
}

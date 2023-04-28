package com.mob.apc.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f3389a = null;
    private final ConcurrentHashMap<String, d> b;
    private final ConcurrentHashMap<String, byte[]> c;

    /* renamed from: com.mob.apc.a.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3390a;
        public final /* synthetic */ e b;
        public final /* synthetic */ long c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3391d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f3392e;

        public AnonymousClass1(b bVar, String str, e eVar, long j2, BlockingQueue blockingQueue) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ e a(b bVar, String str, e eVar, long j2) throws Throwable {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public static /* synthetic */ void a(b bVar, String str, e eVar) {
    }

    public com.mob.apc.a a(String str, String str2, com.mob.apc.a aVar, long j2) throws Throwable {
    }

    private Runnable a(String str, e eVar, long j2, BlockingQueue<e> blockingQueue) {
    }

    private e a(String str, e eVar, long j2) throws Throwable {
    }

    private void a(String str, e eVar) {
    }
}

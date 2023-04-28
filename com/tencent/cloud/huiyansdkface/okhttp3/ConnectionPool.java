package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RealConnection;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RouteDatabase;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import java.net.Socket;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ConnectionPool {
    private static final Executor b = null;

    /* renamed from: h  reason: collision with root package name */
    private static /* synthetic */ boolean f10649h = true;

    /* renamed from: a  reason: collision with root package name */
    public final RouteDatabase f10650a;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10651d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f10652e;

    /* renamed from: f  reason: collision with root package name */
    private final Deque<RealConnection> f10653f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10654g;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.ConnectionPool$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ ConnectionPool f10655a;

        public AnonymousClass1(ConnectionPool connectionPool) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ConnectionPool() {
    }

    public ConnectionPool(int i2, long j2, TimeUnit timeUnit) {
    }

    public final long a(long j2) {
    }

    public final RealConnection a(Address address, StreamAllocation streamAllocation, Route route) {
    }

    public final Socket a(Address address, StreamAllocation streamAllocation) {
    }

    public final void a(RealConnection realConnection) {
    }

    public final boolean b(RealConnection realConnection) {
    }

    public final synchronized int connectionCount() {
    }

    public final void evictAll() {
    }

    public final synchronized int idleConnectionCount() {
    }
}

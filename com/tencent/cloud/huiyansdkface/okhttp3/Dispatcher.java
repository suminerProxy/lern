package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.RealCall;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Dispatcher {

    /* renamed from: h  reason: collision with root package name */
    private static /* synthetic */ boolean f10683h = true;

    /* renamed from: a  reason: collision with root package name */
    private int f10684a;
    private int b;
    private Runnable c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f10685d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<RealCall.AsyncCall> f10686e;

    /* renamed from: f  reason: collision with root package name */
    private final Deque<RealCall.AsyncCall> f10687f;

    /* renamed from: g  reason: collision with root package name */
    private final Deque<RealCall> f10688g;

    public Dispatcher() {
    }

    public Dispatcher(ExecutorService executorService) {
    }

    private <T> void a(Deque<T> deque, T t) {
    }

    private boolean a() {
    }

    private int c(RealCall.AsyncCall asyncCall) {
    }

    public final void a(RealCall.AsyncCall asyncCall) {
    }

    public final synchronized void a(RealCall realCall) {
    }

    public final void b(RealCall.AsyncCall asyncCall) {
    }

    public final void b(RealCall realCall) {
    }

    public final synchronized void cancelAll() {
    }

    public final synchronized ExecutorService executorService() {
    }

    public final synchronized int getMaxRequests() {
    }

    public final synchronized int getMaxRequestsPerHost() {
    }

    public final synchronized List<Call> queuedCalls() {
    }

    public final synchronized int queuedCallsCount() {
    }

    public final synchronized List<Call> runningCalls() {
    }

    public final synchronized int runningCallsCount() {
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
    }

    public final void setMaxRequests(int i2) {
    }

    public final void setMaxRequestsPerHost(int i2) {
    }
}

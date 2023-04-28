package com.mob.mgs.impl;

import com.mob.tools.utils.DH;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f3810a;
    private ExecutorService b;
    private ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, LinkedBlockingQueue<Boolean>> f3811d;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<Integer, String> f3812e;

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<Integer, SelectionKey> f3813f;

    /* renamed from: g  reason: collision with root package name */
    private Socket f3814g;

    /* renamed from: h  reason: collision with root package name */
    private int f3815h;

    /* renamed from: i  reason: collision with root package name */
    private ScheduledExecutorService f3816i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f3817j;

    /* renamed from: com.mob.mgs.impl.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3818a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, BlockingQueue blockingQueue) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mgs.impl.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f3819a;

        /* renamed from: com.mob.mgs.impl.a$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f3820a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public AnonymousClass2(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mgs.impl.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3821a;
        public final /* synthetic */ a b;

        public AnonymousClass3(a aVar, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mgs.impl.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f3822a;

        public AnonymousClass4(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private a() {
    }

    public static /* synthetic */ int a(a aVar, int i2) {
    }

    public static /* synthetic */ ConcurrentHashMap b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    public static /* synthetic */ Socket d(a aVar) {
    }

    public static /* synthetic */ void e(a aVar) {
    }

    public static /* synthetic */ int f(a aVar) {
    }

    public static /* synthetic */ int g(a aVar) {
    }

    public static /* synthetic */ Socket a(a aVar, Socket socket) {
    }

    private void c() {
    }

    private void d() {
    }

    private void e() {
    }

    public void b() {
    }

    public static /* synthetic */ ConcurrentHashMap a(a aVar) {
    }

    public static /* synthetic */ void a(a aVar, String str) {
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
    }

    public static a a() {
    }

    public void a(BlockingQueue<Boolean> blockingQueue) {
    }

    private void a(String str) {
    }

    public int a(String str, LinkedBlockingQueue linkedBlockingQueue) {
    }

    private boolean a(SelectionKey selectionKey) {
    }

    private void a(boolean z) {
    }
}

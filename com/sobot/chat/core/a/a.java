package com.sobot.chat.core.a;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.sobot.chat.core.a.a.b;
import com.sobot.chat.core.a.a.c;
import com.sobot.chat.core.a.a.d;
import com.sobot.chat.core.a.a.e;
import com.sobot.chat.core.a.a.f;
import com.sobot.chat.core.a.a.g;
import com.sobot.chat.core.a.a.h;
import com.sobot.chat.core.a.a.i;
import com.sobot.chat.core.a.a.j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

/* compiled from: SocketClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {
    public static final String b = "a";

    /* renamed from: p  reason: collision with root package name */
    private static final long f7614p = -1;
    private ArrayList<c> A;
    private f B;
    private Timer C;
    private TimerTask D;

    /* renamed from: a  reason: collision with root package name */
    public final a f7615a;
    private ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private com.sobot.chat.core.a.a.a f7616d;

    /* renamed from: e  reason: collision with root package name */
    private String f7617e;

    /* renamed from: f  reason: collision with root package name */
    private i f7618f;

    /* renamed from: g  reason: collision with root package name */
    private f f7619g;

    /* renamed from: h  reason: collision with root package name */
    private Socket f7620h;

    /* renamed from: i  reason: collision with root package name */
    private g f7621i;

    /* renamed from: j  reason: collision with root package name */
    private e f7622j;

    /* renamed from: k  reason: collision with root package name */
    private e f7623k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7624l;

    /* renamed from: m  reason: collision with root package name */
    private LinkedBlockingQueue<h> f7625m;

    /* renamed from: n  reason: collision with root package name */
    private long f7626n;

    /* renamed from: o  reason: collision with root package name */
    private long f7627o;
    private long q;
    private h r;
    private j s;
    private long t;
    private C0144a u;
    private b v;
    private d w;
    private c x;
    private ArrayList<b> y;
    private ArrayList<d> z;

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7628a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ a c;

        public AnonymousClass1(a aVar, String str, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7629a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f7630d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f7631e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7632f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f7633g;

        public AnonymousClass10(a aVar, j jVar, int i2, int i3, int i4, int i5, int i6) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass11 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7634a;
        public final /* synthetic */ a b;

        public AnonymousClass11(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass12 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7635a;
        public final /* synthetic */ a b;

        public AnonymousClass12(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass13 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7636a;
        public final /* synthetic */ a b;

        public AnonymousClass13(a aVar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass14 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f7637a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ a c;

        public AnonymousClass14(a aVar, byte[] bArr, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass15 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7638a;
        public final /* synthetic */ a b;

        public AnonymousClass15(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass16 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7639a;

        public AnonymousClass16(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass17 extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7640a;

        public AnonymousClass17(a aVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass18 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7641a;

        public AnonymousClass18(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7642a;
        public final /* synthetic */ a b;

        public AnonymousClass2(a aVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7643a;
        public final /* synthetic */ a b;

        public AnonymousClass3(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7644a;
        public final /* synthetic */ a b;

        public AnonymousClass4(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7645a;
        public final /* synthetic */ a b;

        public AnonymousClass5(a aVar, h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f7646a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f7647d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f7648e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7649f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f7650g;

        public AnonymousClass6(a aVar, h hVar, int i2, int i3, int i4, int i5, int i6) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7651a;
        public final /* synthetic */ a b;

        public AnonymousClass7(a aVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7652a;
        public final /* synthetic */ a b;

        public AnonymousClass8(a aVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7653a;
        public final /* synthetic */ a b;

        public AnonymousClass9(a aVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SocketClient.java */
    /* renamed from: com.sobot.chat.core.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0144a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7654a;

        private C0144a(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ C0144a(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    /* compiled from: SocketClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7659a;

        private b(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ b(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    /* compiled from: SocketClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7660a;

        private c(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ c(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    /* compiled from: SocketClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7661a;

        public d(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SocketClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7662a = null;
        public static final e b = null;
        public static final e c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ e[] f7663d = null;

        private e(String str, int i2) {
        }

        public static e valueOf(String str) {
        }

        public static e[] values() {
        }
    }

    /* compiled from: SocketClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class f extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f7667a;

        public f(@NonNull a aVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public a() {
    }

    private void G() {
    }

    private void H() {
    }

    private void I() {
    }

    private void J() {
    }

    private void K() {
    }

    private void L() {
    }

    public static /* synthetic */ LinkedBlockingQueue a(a aVar, LinkedBlockingQueue linkedBlockingQueue) {
    }

    public static /* synthetic */ void b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    public static /* synthetic */ C0144a d(a aVar) {
    }

    public static /* synthetic */ d e(a aVar) {
    }

    public static /* synthetic */ c f(a aVar) {
    }

    public static /* synthetic */ void g(a aVar) {
    }

    public c A() {
    }

    public ArrayList<b> B() {
    }

    public ArrayList<d> C() {
    }

    public ArrayList<c> D() {
    }

    public f E() {
    }

    @CallSuper
    public void F() {
    }

    public com.sobot.chat.core.a.a.a h() {
    }

    public String i() {
    }

    public i j() {
    }

    public f k() {
    }

    public Socket l() {
    }

    public g m() throws IOException {
    }

    public e n() {
    }

    public e o() {
    }

    public boolean p() {
    }

    public LinkedBlockingQueue<h> q() {
    }

    public long r() {
    }

    public long s() {
    }

    public long t() {
    }

    public h u() {
    }

    public j v() {
    }

    public long w() {
    }

    public C0144a x() {
    }

    public b y() {
    }

    public d z() {
    }

    public a(com.sobot.chat.core.a.a.a aVar) {
    }

    public static /* synthetic */ void a(a aVar) {
    }

    public static /* synthetic */ void b(a aVar, h hVar) {
    }

    public static /* synthetic */ void c(a aVar, h hVar) {
    }

    public static /* synthetic */ void d(a aVar, h hVar) {
    }

    public boolean e() {
    }

    public boolean f() {
    }

    public com.sobot.chat.core.a.a.a g() {
    }

    public static /* synthetic */ void a(a aVar, h hVar) {
    }

    public static /* synthetic */ void b(a aVar, j jVar) {
    }

    public static /* synthetic */ void c(a aVar, j jVar) {
    }

    public static /* synthetic */ void d(a aVar, j jVar) {
    }

    private void e(h hVar) {
    }

    private void f(h hVar) {
    }

    private void g(h hVar) {
    }

    public static /* synthetic */ void a(a aVar, h hVar, int i2, int i3, int i4, int i5, int i6) {
    }

    public synchronized void b() {
    }

    public void c() {
    }

    public boolean d() {
    }

    public static /* synthetic */ void a(a aVar, j jVar) {
    }

    public a d(long j2) {
    }

    public static /* synthetic */ void a(a aVar, j jVar, int i2, int i3, int i4, int i5, int i6) {
    }

    private void d(h hVar) {
    }

    public ExecutorService a() {
    }

    public a c(long j2) {
    }

    public a c(h hVar) {
    }

    private void c(j jVar) {
    }

    private void e(j jVar) {
    }

    private void d(j jVar) {
    }

    public ThreadFactory a(String str, boolean z) {
    }

    public void b(h hVar) {
    }

    public h a(byte[] bArr) {
    }

    public j b(byte[] bArr) {
    }

    public a b(b bVar) {
    }

    public a b(d dVar) {
    }

    public h a(String str) {
    }

    public a b(c cVar) {
    }

    public a b(String str) {
    }

    public a b(long j2) {
    }

    private void b(@NonNull j jVar) {
    }

    public h a(h hVar) {
    }

    public j a(int i2) {
    }

    public j a(byte[] bArr, boolean z) {
    }

    public a a(b bVar) {
    }

    public a a(d dVar) {
    }

    public a a(c cVar) {
    }

    public a a(com.sobot.chat.core.a.a.a aVar) {
    }

    public a a(i iVar) {
    }

    public a a(f fVar) {
    }

    public a a(Socket socket) {
    }

    public a a(g gVar) {
    }

    public a a(e eVar) {
    }

    public a a(e eVar) {
    }

    public a a(boolean z) {
    }

    public a a(long j2) {
    }

    public a a(j jVar) {
    }

    public a a(C0144a c0144a) {
    }

    public a a(b bVar) {
    }

    public a a(d dVar) {
    }

    public a a(c cVar) {
    }

    private void a(h hVar, int i2, int i3, int i4, int i5, int i6) {
    }

    private void a(j jVar, int i2, int i3, int i4, int i5, int i6) {
    }
}

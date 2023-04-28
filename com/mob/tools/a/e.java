package com.mob.tools.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationListener;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private Context f3995a;
    private Object b;
    private PackageManager c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f3996d;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f3997e;

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f3998f;

    /* renamed from: g  reason: collision with root package name */
    private String f3999g;

    /* renamed from: com.mob.tools.a.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends a<PackageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4000a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e c;

        public AnonymousClass1(e eVar, PackageInfo packageInfo, String str, int i2) {
        }

        public PackageInfo a() throws Throwable {
        }

        @Override // com.mob.tools.a.e.a
        public /* synthetic */ PackageInfo b() throws Throwable {
        }
    }

    /* renamed from: com.mob.tools.a.e$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends a<PackageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4001a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e c;

        public AnonymousClass2(e eVar, PackageInfo packageInfo, String str, int i2) {
        }

        public PackageInfo a() throws Throwable {
        }

        @Override // com.mob.tools.a.e.a
        public /* synthetic */ PackageInfo b() throws Throwable {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f4002a;
        private long b;

        /* renamed from: d  reason: collision with root package name */
        public int f4003d;

        public a(T t) {
        }

        public static /* synthetic */ Object a(a aVar) {
        }

        public static /* synthetic */ long b(a aVar) {
        }

        public abstract T b() throws Throwable;

        public a(T t, long j2) {
        }

        public a(T t, int i2, long j2) {
        }
    }

    public e(Context context) {
    }

    public static /* synthetic */ PackageManager a(e eVar) {
    }

    @Override // com.mob.tools.a.l
    public String b() {
    }

    @Override // com.mob.tools.a.l
    public Enumeration<NetworkInterface> c() {
    }

    @Override // com.mob.tools.a.l
    public int d() {
    }

    @Override // com.mob.tools.a.l
    public int e() {
    }

    @Override // com.mob.tools.a.l
    public ApplicationInfo f() {
    }

    @Override // com.mob.tools.a.l
    public String a() {
    }

    public Object c(String str) {
    }

    @Override // com.mob.tools.a.l
    public ResolveInfo b(Intent intent, int i2) {
    }

    @Override // com.mob.tools.a.l
    public String a(int i2) {
    }

    @Override // com.mob.tools.a.l
    public Location b(String str) {
    }

    @Override // com.mob.tools.a.l
    public String a(String str) {
    }

    @Override // com.mob.tools.a.l
    public ApplicationInfo b(String str, int i2) throws PackageManager.NameNotFoundException {
    }

    @Override // com.mob.tools.a.l
    public String a(String str, String str2) {
    }

    @Override // com.mob.tools.a.l
    public List<ResolveInfo> a(Intent intent, int i2) {
    }

    @Override // com.mob.tools.a.l
    public PackageInfo a(String str, int i2) throws PackageManager.NameNotFoundException {
    }

    @Override // com.mob.tools.a.l
    public void a(String str, long j2, float f2, LocationListener locationListener) {
    }

    @Override // com.mob.tools.a.l
    public Enumeration<InetAddress> a(NetworkInterface networkInterface) {
    }

    public <T> T a(Object obj, String str, Object... objArr) {
    }

    public <T> T a(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
    }

    private <T> T a(String str, a<T> aVar) {
    }

    private <T> T a(String str, a<T> aVar, boolean z) {
    }
}

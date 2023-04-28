package com.mob.mgs.impl;

import android.content.Context;
import android.os.Bundle;
import com.mob.apc.b;
import com.mob.mcl.a;
import com.mob.tools.utils.DH;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class c implements b.a, b.InterfaceC0083b, b.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f3825a = null;
    private static final String[] b = null;
    private static final String[] c = null;

    /* renamed from: d  reason: collision with root package name */
    private static c f3826d;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f3827e;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f3828f;

    /* renamed from: g  reason: collision with root package name */
    private String f3829g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3830h;

    /* renamed from: i  reason: collision with root package name */
    private int f3831i;

    /* renamed from: j  reason: collision with root package name */
    private int f3832j;

    /* renamed from: k  reason: collision with root package name */
    private List<HashMap<String, Object>> f3833k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap<String, Integer> f3834l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3835m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3836n;

    /* renamed from: o  reason: collision with root package name */
    private Context f3837o;

    /* renamed from: com.mob.mgs.impl.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends a.C0090a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3838a;

        public AnonymousClass1(c cVar) {
        }

        @Override // com.mob.mcl.a.C0090a
        public void a() {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f3839a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Set c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f3840d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3841e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f3842f;

        /* renamed from: com.mob.mgs.impl.c$10$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f3843a;
            public final /* synthetic */ AnonymousClass10 b;

            public AnonymousClass1(AnonymousClass10 anonymousClass10, int i2) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public AnonymousClass10(c cVar, List list, String str, Set set, List list2, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass11 extends com.mob.tools.utils.b<List<HashMap<String, String>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3844a;
        public final /* synthetic */ c b;

        public AnonymousClass11(c cVar, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(List<HashMap<String, String>> list) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(List<HashMap<String, String>> list) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass12 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3845a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ c c;

        public AnonymousClass12(c cVar, String str, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass13 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3846a;
        public final /* synthetic */ c b;

        public AnonymousClass13(c cVar, BlockingQueue blockingQueue) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass14 extends com.mob.tools.utils.b<HashMap<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3847a;
        public final /* synthetic */ c b;

        public AnonymousClass14(c cVar, BlockingQueue blockingQueue) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(HashMap<String, Object> hashMap) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass15 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3848a;

        public AnonymousClass15(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass16 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3849a;
        public final /* synthetic */ c b;

        public AnonymousClass16(c cVar, BlockingQueue blockingQueue) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3850a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f3851d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f3852e;

        /* renamed from: com.mob.mgs.impl.c$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends com.mob.tools.utils.b<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f3853a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Boolean bool) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
            }
        }

        public AnonymousClass2(c cVar, String str, long j2, String str2, String str3) {
        }

        @Override // com.mob.mgs.impl.h
        public void a() throws Throwable {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends com.mob.tools.utils.b<HashMap<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3854a;
        public final /* synthetic */ c b;

        public AnonymousClass3(c cVar, BlockingQueue blockingQueue) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(HashMap<String, Object> hashMap) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f3855a;
        public final /* synthetic */ c b;

        public AnonymousClass4(c cVar, BlockingQueue blockingQueue) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3856a;

        public AnonymousClass5(com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3857a;
        public final /* synthetic */ com.mob.tools.utils.b b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f3858d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f3859e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f3860f;

        /* renamed from: com.mob.mgs.impl.c$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends com.mob.tools.utils.b<List<HashMap<String, String>>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass6 f3861a;

            /* renamed from: com.mob.mgs.impl.c$6$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00971 extends com.mob.tools.utils.b<HashMap<String, Object>> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass1 f3862a;

                public C00971(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.mob.tools.utils.b
                public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void a2(HashMap<String, Object> hashMap) {
                }
            }

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(List<HashMap<String, String>> list) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(List<HashMap<String, String>> list) {
            }
        }

        /* renamed from: com.mob.mgs.impl.c$6$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends com.mob.tools.utils.b<HashMap<String, Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass6 f3863a;

            public AnonymousClass2(AnonymousClass6 anonymousClass6) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(HashMap<String, Object> hashMap) {
            }
        }

        public AnonymousClass6(c cVar, String str, com.mob.tools.utils.b bVar, int i2, String str2, String str3) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3864a;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ com.mob.tools.utils.b c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f3865d;

        public AnonymousClass7(c cVar, String str, HashMap hashMap, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3866a;
        public final /* synthetic */ boolean[] b;
        public final /* synthetic */ c c;

        public AnonymousClass8(c cVar, com.mob.tools.utils.b bVar, boolean[] zArr) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    /* renamed from: com.mob.mgs.impl.c$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3867a;

        /* renamed from: com.mob.mgs.impl.c$9$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends com.mob.tools.utils.b<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass9 f3868a;

            public AnonymousClass1(AnonymousClass9 anonymousClass9) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Boolean bool) {
            }
        }

        public AnonymousClass9(c cVar) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    private c() {
    }

    public static /* synthetic */ int a(c cVar, int i2) {
    }

    public static /* synthetic */ int b(c cVar, int i2) {
    }

    public static /* synthetic */ void c(c cVar) {
    }

    public static /* synthetic */ HashMap d(c cVar) {
    }

    public static /* synthetic */ boolean e(c cVar) {
    }

    private void f() {
    }

    private void g() {
    }

    public static /* synthetic */ HashMap a(c cVar, HashMap hashMap) {
    }

    public static /* synthetic */ String b(c cVar, String str) {
    }

    private boolean c(String str) {
    }

    public static /* synthetic */ String[] e() {
    }

    public void d() {
    }

    public static /* synthetic */ List a(c cVar, List list) {
    }

    public static /* synthetic */ void b(c cVar, com.mob.tools.utils.b bVar) {
    }

    public static /* synthetic */ void a(c cVar, int i2, String str, String str2, String str3, com.mob.tools.utils.b bVar) {
    }

    public static /* synthetic */ boolean b(c cVar) {
    }

    public static /* synthetic */ void a(c cVar, com.mob.tools.utils.b bVar) {
    }

    public void b() throws Throwable {
    }

    public static /* synthetic */ void a(c cVar, boolean z, String str) {
    }

    public static /* synthetic */ boolean a(c cVar) {
    }

    public boolean c() {
    }

    public static /* synthetic */ boolean a(c cVar, String str) {
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
    }

    public static c a() {
    }

    private void a(com.mob.tools.utils.b<List<HashMap<String, String>>> bVar) {
    }

    private void b(com.mob.tools.utils.b<Boolean> bVar) {
    }

    public void b(String str) {
    }

    private void b(int i2, String str, String str2, String str3, com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
    }

    public void a(String str, boolean z) {
    }

    private void a(boolean z, String str) {
    }

    private void a(String str, long j2) {
    }

    @Override // com.mob.apc.b.InterfaceC0083b
    public com.mob.apc.a a(String str, com.mob.apc.a aVar, long j2) {
    }

    @Override // com.mob.apc.b.c
    public void a(Bundle bundle) {
    }

    @Override // com.mob.apc.b.a
    public HashMap<String, Object> a(int i2, String str) {
    }

    @Override // com.mob.apc.b.a
    public boolean a(String str) {
    }

    private static void a(Context context, String str, com.mob.tools.utils.b<Boolean> bVar) {
    }

    private void a(int i2, String str, String str2, String str3, com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
    }

    public void a(int i2, String str, com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
    }

    private void a(String str, com.mob.tools.utils.b<Boolean> bVar) {
    }
}

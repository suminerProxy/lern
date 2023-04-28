package com.mob.mcl.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.mob.mcl.BusinessCallBack;
import com.mob.mcl.BusinessMessageListener;
import com.mob.mcl.MobMCL;
import com.mob.mcl.a;
import com.mob.mgs.OnIdChangeListener;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class h implements d {

    /* renamed from: m  reason: collision with root package name */
    private static volatile h f3775m;

    /* renamed from: a  reason: collision with root package name */
    public long f3776a;
    public String b;
    public AtomicLong c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f3777d;

    /* renamed from: e  reason: collision with root package name */
    public int f3778e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3779f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3780g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3781h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3782i;

    /* renamed from: j  reason: collision with root package name */
    public String f3783j;

    /* renamed from: k  reason: collision with root package name */
    public long f3784k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3785l;

    /* renamed from: n  reason: collision with root package name */
    private NetworkHelper f3786n;

    /* renamed from: o  reason: collision with root package name */
    private Hashon f3787o;

    /* renamed from: p  reason: collision with root package name */
    private f f3788p;
    private String q;
    private String r;
    private Context s;
    private MobMCL.ELPMessageListener t;
    private HashMap<Integer, HashSet<BusinessMessageListener>> u;
    private boolean v;
    private com.mob.mcl.d.c w;
    private OnIdChangeListener x;
    private int y;
    private AtomicBoolean z;

    /* renamed from: com.mob.mcl.c.h$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BusinessMessageListener f3789a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f3790d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ h f3791e;

        public AnonymousClass1(h hVar, BusinessMessageListener businessMessageListener, int i2, String str, String str2) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.mob.mcl.c.h$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BusinessMessageListener f3792a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f3793d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ h f3794e;

        public AnonymousClass10(h hVar, BusinessMessageListener businessMessageListener, Integer num, String str, String str2) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.mob.mcl.c.h$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f3795a;

        /* renamed from: com.mob.mcl.c.h$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends com.mob.tools.utils.b<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f3796a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Boolean bool) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
            }
        }

        public AnonymousClass2(h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mcl.c.h$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends a.C0090a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f3797a;

        public AnonymousClass3(h hVar) {
        }

        @Override // com.mob.mcl.a.C0090a
        public void a() {
        }

        @Override // com.mob.mcl.a.C0090a
        public void b() {
        }
    }

    /* renamed from: com.mob.mcl.c.h$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f3798a;

        /* renamed from: com.mob.mcl.c.h$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends com.mob.tools.utils.b<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f3799a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Boolean bool) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
            }
        }

        public AnonymousClass4(h hVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mcl.c.h$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BusinessCallBack f3800a;
        public final /* synthetic */ h b;

        /* renamed from: com.mob.mcl.c.h$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f3801a;
            public final /* synthetic */ AnonymousClass5 b;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, boolean z) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.mcl.c.h$5$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends com.mob.tools.utils.b<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass5 f3802a;

            public AnonymousClass2(AnonymousClass5 anonymousClass5) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Boolean bool) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
            }
        }

        public AnonymousClass5(h hVar, BusinessCallBack businessCallBack) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mcl.c.h$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends com.mob.tools.utils.b<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3803a;
        public final /* synthetic */ com.mob.tools.utils.b b;
        public final /* synthetic */ h c;

        public AnonymousClass6(h hVar, int i2, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(String str) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(String str) {
        }
    }

    /* renamed from: com.mob.mcl.c.h$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f3804a;
        public final /* synthetic */ com.mob.tools.utils.b b;
        public final /* synthetic */ h c;

        public AnonymousClass7(h hVar, HashMap hashMap, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: com.mob.mcl.c.h$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends com.mob.tools.utils.b<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3805a;
        public final /* synthetic */ h b;

        public AnonymousClass8(h hVar, com.mob.tools.utils.b bVar) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(String str) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(String str) {
        }
    }

    /* renamed from: com.mob.mcl.c.h$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends com.mob.tools.utils.b<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3806a;
        public final /* synthetic */ h b;

        public AnonymousClass9(h hVar, String str) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(String str) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(String str) {
        }
    }

    private h() {
    }

    public static /* synthetic */ void a(h hVar) {
    }

    public static /* synthetic */ Hashon b(h hVar) {
    }

    private String i() {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    public boolean c() {
    }

    public boolean d() {
    }

    public boolean e() {
    }

    public void f() {
    }

    public void g() {
    }

    public String h() {
    }

    public static /* synthetic */ boolean a(h hVar, boolean z, String str, int i2, String str2, int i3) {
    }

    public static h b() {
    }

    private void c(com.mob.tools.utils.b<String> bVar) {
    }

    public boolean a() {
    }

    public void a(OnIdChangeListener onIdChangeListener) {
    }

    public void a(String str) {
    }

    public void a(MobMCL.ELPMessageListener eLPMessageListener) {
    }

    public void a(int i2, BusinessMessageListener businessMessageListener) {
    }

    private void b(long j2, boolean z) {
    }

    private String c(String str, String str2) throws Throwable {
    }

    public void b(BusinessCallBack<Boolean> businessCallBack) {
    }

    public void b(com.mob.tools.utils.b<Boolean> bVar) {
    }

    private String b(long j2) {
    }

    private HashMap<String, Object> b(HashMap<String, Object> hashMap) {
    }

    private HashMap<String, Object> b(String str) {
    }

    public void b(String str, String str2) {
    }

    public void a(Context context, String str, String str2) {
    }

    public HashMap<String, Object> a(String str, String str2, int i2) throws Throwable {
    }

    public HashMap<String, Object> a(int i2, String str) {
    }

    public HashMap<String, Object> a(int i2, int i3, String str) {
    }

    private void a(long j2, boolean z) {
    }

    private void a(long j2) {
    }

    public boolean a(int i2, int i3) {
    }

    public void a(BusinessCallBack<Boolean> businessCallBack) {
    }

    private boolean a(HashMap<String, Object> hashMap) {
    }

    public void a(com.mob.tools.utils.b<Boolean> bVar) {
    }

    public synchronized void a(int i2, com.mob.tools.utils.b<Boolean> bVar) {
    }

    private synchronized boolean a(boolean z, String str, int i2, String str2, int i3) {
    }

    public synchronized void a(String str, long j2) {
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, e eVar) {
    }

    public int a(Bundle bundle) {
    }

    private synchronized boolean a(String str, int i2) {
    }

    public boolean a(long j2, String str, int i2, int i3, String str2) {
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, Throwable th) {
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar) {
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, boolean z) {
    }

    public String a(String str, String str2) throws Throwable {
    }

    public static int a(HashMap<String, Object> hashMap, String str, int i2) {
    }
}

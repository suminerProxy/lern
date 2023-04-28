package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f3596a;
    private static volatile Boolean b;
    private static volatile String c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f3597d;

    /* renamed from: e  reason: collision with root package name */
    private static HashSet<String> f3598e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private static final a f3599f = new a();

    public static String b() {
        if (a()) {
            return null;
        }
        if (TextUtils.isEmpty(f3596a)) {
            String a2 = d().a();
            if (!TextUtils.isEmpty(a2) && TextUtils.isEmpty(f3596a)) {
                f3596a = a2;
            }
        }
        return f3596a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d() {
        return f3599f;
    }

    public static boolean a() {
        return !b.a();
    }

    public static String a(Context context) {
        return com.mob.tools.a.c.a(context).b().aY();
    }

    public static synchronized String a(MobProduct mobProduct) {
        synchronized (e.class) {
            HashMap<String, Object> b2 = b(mobProduct);
            if (b2 != null) {
                return (String) b2.get(NetCommunicator.KEY_DUID);
            }
            return null;
        }
    }

    public static synchronized HashMap<String, Object> b(MobProduct mobProduct) {
        boolean z;
        HashMap<String, Object> hashMap;
        synchronized (e.class) {
            boolean z2 = true;
            if (mobProduct != null) {
                w.a(mobProduct);
                z = !f3598e.contains(mobProduct.getProductTag());
                if (z) {
                    f3598e.add(mobProduct.getProductTag());
                }
            } else {
                z = false;
            }
            if (TextUtils.isEmpty(f3596a)) {
                f3596a = d().b();
            } else {
                z2 = z;
            }
            MobLog.getInstance().d("aut pro: " + mobProduct + ", ndReg: " + z2 + ", hsReged: " + f3597d, new Object[0]);
            if (z2 || !f3597d) {
                v.c.execute(new com.mob.tools.utils.e(mobProduct) { // from class: com.mob.commons.e.1

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ MobProduct f3600a;

                    /* renamed from: com.mob.commons.e$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                    public class C00891 extends com.mob.tools.utils.b<Void> {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass1 f3601a;

                        public C00891(AnonymousClass1 anonymousClass1) {
                        }

                        @Override // com.mob.tools.utils.b
                        public /* bridge */ /* synthetic */ void a(Void r1) {
                        }

                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void a2(Void r1) {
                        }
                    }

                    @Override // com.mob.tools.utils.e
                    public void a() {
                    }
                });
            }
            if (b == null) {
                String b2 = x.a().b("key_curr_passed_duid", (String) null);
                c = b2;
                if (!TextUtils.isEmpty(b2) && !b2.equals(f3596a)) {
                    b = Boolean.TRUE;
                } else {
                    b = Boolean.FALSE;
                }
            }
            x.a().a("key_curr_passed_duid", f3596a);
            hashMap = new HashMap<>();
            hashMap.put(NetCommunicator.KEY_DUID, f3596a);
            hashMap.put(NetCommunicator.KEY_IS_MODIFIED, Boolean.valueOf(b.booleanValue()));
            hashMap.put(NetCommunicator.KEY_DUID_PREVIOUS, c);
        }
        return hashMap;
    }
}

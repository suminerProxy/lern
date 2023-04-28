package com.mob.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f3673a;
    private HashMap<String, Object> b;

    private p() {
        HashMap<String, Object> c = c();
        this.b = c;
        if (c == null) {
            this.b = new HashMap<>();
        }
        ArrayList<MobProduct> b = w.b();
        if (b == null || b.isEmpty()) {
            return;
        }
        Iterator<MobProduct> it = b.iterator();
        while (it.hasNext()) {
            MobProduct next = it.next();
            if (!this.b.containsKey(next.getProductTag())) {
                this.b.put(next.getProductTag(), 0);
            }
        }
    }

    public static p a() {
        if (f3673a == null) {
            synchronized (p.class) {
                if (f3673a == null) {
                    f3673a = new p();
                }
            }
        }
        return f3673a;
    }

    private HashMap<String, Object> c() {
        try {
            return x.a().g();
        } catch (Throwable unused) {
            return null;
        }
    }

    public HashMap<String, Object> b() {
        return this.b;
    }

    public void a(MobProduct mobProduct, int i2) {
        if (mobProduct != null) {
            this.b.put(mobProduct.getProductTag(), Integer.valueOf(i2));
            a(this.b);
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        try {
            x.a().b(hashMap);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        return s.a(str, 99);
    }
}

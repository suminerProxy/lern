package com.tencent.android.tpush.service.channel;

import android.util.SparseArray;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f8895a = new a();
    private SparseArray<Object> b = new SparseArray<>();

    public a() {
    }

    public boolean a() {
        return ((Boolean) this.b.get(2, Boolean.FALSE)).booleanValue();
    }

    public String b() {
        return (String) this.b.get(0, "");
    }

    public int c() {
        return ((Integer) this.b.get(1, 0)).intValue();
    }

    public a(Object... objArr) {
        for (int i2 = 0; i2 < objArr.length; i2 += 2) {
            this.b.put(((Integer) objArr[i2]).intValue(), objArr[i2 + 1]);
        }
    }
}

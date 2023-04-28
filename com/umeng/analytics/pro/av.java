package com.umeng.analytics.pro;

import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.bc;
import java.io.Serializable;

/* compiled from: TBase.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface av<T extends av<?, ?>, F extends bc> extends Serializable {
    void clear();

    av<T, F> deepCopy();

    F fieldForId(int i2);

    void read(bu buVar) throws bb;

    void write(bu buVar) throws bb;
}

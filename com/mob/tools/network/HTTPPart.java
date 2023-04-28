package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class HTTPPart implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private long f4430a;
    private OnReadListener b;

    public abstract InputStream a() throws Throwable;

    public abstract long b() throws Throwable;

    public Object getInputStreamEntity() throws Throwable {
    }

    public void setOffset(long j2) {
    }

    public void setOnReadListener(OnReadListener onReadListener) {
    }

    public InputStream toInputStream() throws Throwable {
    }
}

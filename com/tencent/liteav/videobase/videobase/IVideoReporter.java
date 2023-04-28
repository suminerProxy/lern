package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.videobase.videobase.h;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IVideoReporter {
    void notifyError(h.a aVar, String str, Object... objArr);

    void notifyEvent(h.b bVar, String str, Object... objArr);

    void notifyWarning(h.c cVar, String str, Object... objArr);

    void updateStatus(i iVar, int i2, Object obj);

    void updateStatus(i iVar, Object obj);
}

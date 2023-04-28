package com.mob;

import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class OperationCallback<T> implements PublicMemberKeeper {
    public abstract void onComplete(T t);

    public abstract void onFailure(Throwable th);
}

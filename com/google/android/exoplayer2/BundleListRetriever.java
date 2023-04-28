package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE = 0;
    private final ImmutableList<Bundle> list;

    public BundleListRetriever(List<Bundle> list) {
    }

    public static ImmutableList<Bundle> getList(IBinder binder) {
    }

    @Override // android.os.Binder
    public boolean onTransact(int code, Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
    }
}

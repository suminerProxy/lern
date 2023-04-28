package com.tencent.turingfd.sdk.mfa;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TNative$aa {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class bb implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static native SparseArray<Object> a73(SparseArray<Object> sparseArray, Context context, Map<String, String> map, Map<Integer, String> map2, int i2);

    public static native SparseArray<Object> b73(SparseArray<Object> sparseArray, byte[] bArr, Map<String, String> map, int i2);

    public static native SparseArray<Object> c73(SparseArray<Object> sparseArray, Context context);

    public static native SparseArray<Object> d73(SparseArray<Object> sparseArray, Context context, int i2);

    public static native SparseArray<Object> e73(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i2);

    public static native SparseArray<Object> f73(SparseArray<Object> sparseArray, byte[] bArr, int i2);

    public static native SparseArray<Object> g73(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i2);

    public static native SparseArray<Object> h73(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i2);

    public static native SparseArray<Object> i73(SparseArray<Object> sparseArray, Context context, Map<String, String> map);
}

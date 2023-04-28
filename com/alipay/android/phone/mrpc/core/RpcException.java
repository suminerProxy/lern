package com.alipay.android.phone.mrpc.core;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RpcException extends RuntimeException {
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mMsg;
    private String mOperationType;

    public RpcException(Integer num, String str) {
    }

    public RpcException(Integer num, String str, Throwable th) {
    }

    public RpcException(Integer num, Throwable th) {
    }

    public RpcException(String str) {
    }

    private static String a(Integer num, String str) {
    }

    public int getCode() {
    }

    public String getMsg() {
    }

    public String getOperationType() {
    }

    public void setOperationType(String str) {
    }
}

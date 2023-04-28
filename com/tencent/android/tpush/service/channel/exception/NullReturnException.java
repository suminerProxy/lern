package com.tencent.android.tpush.service.channel.exception;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NullReturnException extends Exception {
    private static final long serialVersionUID = -2623309261327598087L;
    private int statusCode;

    public NullReturnException(String str) {
        super(str);
        this.statusCode = -1;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public NullReturnException(Exception exc) {
        super(exc);
        this.statusCode = -1;
    }

    public NullReturnException(String str, int i2) {
        super(str);
        this.statusCode = -1;
        this.statusCode = i2;
    }

    public NullReturnException(String str, Exception exc) {
        super(str, exc);
        this.statusCode = -1;
    }

    public NullReturnException(String str, Exception exc, int i2) {
        super(str, exc);
        this.statusCode = -1;
        this.statusCode = i2;
    }
}

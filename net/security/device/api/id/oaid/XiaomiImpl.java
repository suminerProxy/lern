package net.security.device.api.id.oaid;

import android.annotation.SuppressLint;
import android.content.Context;
import net.security.device.api.id.IOAID;
import net.security.device.api.id.IOAIDGetter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class XiaomiImpl implements IOAID {
    private final Context context;
    private Class<?> idProvider;

    @SuppressLint({"PrivateApi"})
    public XiaomiImpl(Context context) {
    }

    private String invokeMethod(String str) {
    }

    @Override // net.security.device.api.id.IOAID
    public void doGet(IOAIDGetter iOAIDGetter) {
    }

    @Override // net.security.device.api.id.IOAID
    public boolean supportOAID() {
    }
}

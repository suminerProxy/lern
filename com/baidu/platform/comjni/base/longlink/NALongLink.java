package com.baidu.platform.comjni.base.longlink;

import com.baidu.platform.comapi.longlink.ELongLinkStatus;
import com.baidu.platform.comapi.longlink.LongLinkFileData;
import com.baidu.platform.comjni.JNIBaseApi;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NALongLink extends JNIBaseApi {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, LinkedList<Object>> f2852a;
    private static ELongLinkStatus[] b;

    public static long create() {
    }

    public static boolean init(long j2, String str, String str2) {
    }

    private static native long nativeCreate();

    private static native boolean nativeInit(long j2, String str, String str2);

    private static native boolean nativeRegister(long j2, int i2);

    private static native int nativeRelease(long j2);

    private static native int nativeSendData(long j2, int i2, int i3, byte[] bArr);

    private static native int nativeSendFileData(long j2, int i2, int i3, String str, ArrayList<LongLinkFileData> arrayList);

    private static native boolean nativeStart(long j2);

    private static native boolean nativeStop(long j2);

    private static native boolean nativeUnRegister(long j2, int i2);

    public static boolean onJNILongLinkDataCallback(int i2, int i3, int i4, byte[] bArr, boolean z) {
    }

    public static boolean register(long j2, int i2, Object obj) {
    }

    public static int release(long j2) {
    }

    public static int sendData(long j2, int i2, int i3, byte[] bArr) {
    }

    public static int sendFileData(long j2, int i2, int i3, String str, ArrayList<LongLinkFileData> arrayList) {
    }

    public static boolean start(long j2) {
    }

    public static boolean stop(long j2) {
    }

    public static boolean unRegister(long j2, int i2, Object obj) {
    }
}

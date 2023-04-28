package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.List;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXUGCPartsManagerImpl implements TXUGCPartsManager {
    private long mNativePartsManager;

    public TXUGCPartsManagerImpl(long j2) {
    }

    private static native void nativeAddPart(long j2, String str, long j3);

    private static native void nativeDeleteAllParts(long j2);

    private static native void nativeDeleteLastPart(long j2);

    private static native void nativeDeletePart(long j2, int i2);

    private static native void nativeDestroy(long j2);

    private static native int nativeGetDuration(long j2);

    private static native String[] nativeGetPartsPathList(long j2);

    private static native void nativeInsertPart(long j2, String str, int i2);

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void addClipInfo(PartInfo partInfo) {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deleteAllParts() {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deleteLastPart() {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deletePart(int i2) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public int getDuration() {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public List<String> getPartsPathList() {
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void insertPart(String str, int i2) {
    }
}

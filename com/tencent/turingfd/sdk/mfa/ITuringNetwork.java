package com.tencent.turingfd.sdk.mfa;

import com.tencent.turingfd.sdk.mfa.fa2Ik;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITuringNetwork extends fa2Ik {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Resp extends fa2Ik.spXPg {
        public Resp(int i2, byte[] bArr) {
        }
    }

    @Override // com.tencent.turingfd.sdk.mfa.fa2Ik
    Resp onHttpPost(byte[] bArr);

    @Override // com.tencent.turingfd.sdk.mfa.fa2Ik
    /* synthetic */ fa2Ik.spXPg onHttpPost(byte[] bArr);
}

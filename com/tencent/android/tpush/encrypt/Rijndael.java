package com.tencent.android.tpush.encrypt;

import com.alipay.sdk.util.e;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Rijndael {
    public static String decrypt(String str) {
        if (i.b(str)) {
            return "";
        }
        String oiSymmetryDecrypt2 = TpnsSecurity.oiSymmetryDecrypt2(str);
        for (int i2 = 0; i2 < 3; i2++) {
            if (!e.f791a.equals(oiSymmetryDecrypt2)) {
                return oiSymmetryDecrypt2;
            }
            oiSymmetryDecrypt2 = TpnsSecurity.oiSymmetryDecrypt2(str);
        }
        return "";
    }

    public static String encrypt(String str) {
        if (i.b(str)) {
            return "";
        }
        String oiSymmetryEncrypt2 = TpnsSecurity.oiSymmetryEncrypt2(str);
        for (int i2 = 0; i2 < 3; i2++) {
            if (!e.f791a.equals(oiSymmetryEncrypt2)) {
                return oiSymmetryEncrypt2;
            }
            oiSymmetryEncrypt2 = TpnsSecurity.oiSymmetryEncrypt2(str);
        }
        return "";
    }
}

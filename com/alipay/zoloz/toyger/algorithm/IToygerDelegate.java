package com.alipay.zoloz.toyger.algorithm;

import android.graphics.PointF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IToygerDelegate<State extends ToygerState, Attr extends ToygerAttr, Info extends ToygerBiometricInfo> {
    @Deprecated
    public static final int EVENT_CODE_DARK_SCREEN = -1;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_DEVICE = 2;
    public static final int LOG_MONITOR = 3;

    PointF handleAlignDepthPoint(PointF pointF);

    void handleCaptureCompleted(int i2, List<Info> list, Map<String, Object> map);

    void handleEventTriggered(int i2, String str);

    void handleInfoReady(TGFrame tGFrame, Attr attr);

    void handleLog(int i2, HashMap<String, Object> hashMap);

    void handleScanCompleted(int i2, List<Info> list, Map<String, Object> map);

    void handleStateUpdated(State state, Attr attr);
}

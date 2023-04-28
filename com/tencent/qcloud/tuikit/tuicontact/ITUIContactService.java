package com.tencent.qcloud.tuikit.tuicontact;

import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITUIContactService extends ITUIService, ITUINotification {
    @Override // com.tencent.qcloud.tuicore.interfaces.ITUIService
    Object onCall(String str, Map<String, Object> map);

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    void onNotifyEvent(String str, String str2, Map<String, Object> map);
}

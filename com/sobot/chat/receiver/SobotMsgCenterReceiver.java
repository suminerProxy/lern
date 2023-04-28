package com.sobot.chat.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotMsgCenterReceiver extends BroadcastReceiver {
    public abstract List<SobotMsgCenterModel> getMsgCenterDatas();

    public abstract void onDataChanged(SobotMsgCenterModel sobotMsgCenterModel);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}

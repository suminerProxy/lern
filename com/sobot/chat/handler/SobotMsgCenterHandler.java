package com.sobot.chat.handler;

import android.content.Context;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotMsgCenterHandler {

    /* renamed from: com.sobot.chat.handler.SobotMsgCenterHandler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SobotMsgCenterCallBack val$callBack;
        public final /* synthetic */ Object val$cancelTag;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$uid;

        public AnonymousClass1(Context context, String str, SobotMsgCenterCallBack sobotMsgCenterCallBack, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotMsgCenterCallBack {
        void onAllDataSuccess(List<SobotMsgCenterModel> list);

        void onLocalDataSuccess(List<SobotMsgCenterModel> list);
    }

    public static /* synthetic */ List access$000(Object obj, Context context, String str) {
    }

    private static List<SobotMsgCenterModel> getDataFromServer(Object obj, Context context, String str) {
    }

    public static void getMsgCenterAllData(Object obj, Context context, String str, SobotMsgCenterCallBack sobotMsgCenterCallBack) {
    }
}

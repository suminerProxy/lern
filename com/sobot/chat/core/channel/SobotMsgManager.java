package com.sobot.chat.core.channel;

import android.content.Context;
import com.sobot.chat.api.ZhiChiApi;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.api.model.ZhiChiPushMessage;
import com.sobot.chat.utils.SobotCache;
import com.sobot.chat.utils.ZhiChiConfig;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotMsgManager {
    private static SobotMsgManager instance;
    private ZhiChiConfig config;
    private HashMap<String, ZhiChiConfig> configs;
    private SobotCache mCache;
    private Context mContext;
    private ZhiChiApi zhiChiApi;

    private SobotMsgManager(Context context) {
    }

    public static SobotMsgManager getInstance(Context context) {
    }

    private String getLastMsg(String str) {
    }

    public static String getMsgCenterDataKey(String str, String str2) {
    }

    public static String getMsgCenterListKey(String str) {
    }

    public int addUnreadCount(ZhiChiPushMessage zhiChiPushMessage, String str, String str2) {
    }

    public void clearAllConfig() {
    }

    public void clearAllUnreadCount(Context context, String str) {
    }

    public void clearConfig(String str) {
    }

    public void clearMsgCenter(Context context, String str, String str2) {
    }

    public ZhiChiConfig getConfig(String str) {
    }

    public SobotMsgCenterModel getMsgCenterModel(String str, String str2) {
    }

    public int getUnreadCount(String str, boolean z, String str2) {
    }

    public ZhiChiApi getZhiChiApi() {
    }

    public void initSobotSDK(Context context, String str, String str2) {
    }

    public boolean isActiveOperator(String str) {
    }
}

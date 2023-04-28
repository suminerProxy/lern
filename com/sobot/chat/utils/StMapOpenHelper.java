package com.sobot.chat.utils;

import android.content.Context;
import android.content.Intent;
import com.sobot.chat.api.model.SobotLocationModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StMapOpenHelper {
    private static final String MAP_BAIDU = "baidumap://map/marker?location=%1$s,%2$s&title=%3$s&content=%4$s&traffic=on&src=%5$s";
    private static final String MAP_GAODE = "androidamap://viewMap?lat=%1$s&lon=%2$s&poiname=%3$s&sourceApplication=%4$s&dev=0";

    public static void firstOpenBaiduMap(Context context, SobotLocationModel sobotLocationModel) {
    }

    public static void firstOpenGaodeMap(Context context, SobotLocationModel sobotLocationModel) {
    }

    public static Intent obtainBaiduMap(String str, SobotLocationModel sobotLocationModel) {
    }

    public static Intent obtainGaoDeMap(String str, SobotLocationModel sobotLocationModel) {
    }

    private static boolean openAct(Context context, Intent intent) {
    }

    public static void openMap(Context context, SobotLocationModel sobotLocationModel) {
    }
}

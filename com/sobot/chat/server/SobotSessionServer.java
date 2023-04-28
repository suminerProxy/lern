package com.sobot.chat.server;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.ZhiChiPushMessage;
import com.sobot.chat.utils.ZhiChiConfig;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotSessionServer extends Service {
    private ZhiChiConfig config;
    private String currentUid;
    private Information info;
    private boolean isStartTimer;
    private LocalBroadcastManager localBroadcastManager;
    private MyMessageReceiver receiver;
    private MyNetWorkChangeReceiver receiverNet;
    public TimerTask task;
    public Timer timer;
    private int tmpNotificationId;

    /* renamed from: com.sobot.chat.server.SobotSessionServer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends TimerTask {
        public final /* synthetic */ SobotSessionServer this$0;

        public AnonymousClass1(SobotSessionServer sobotSessionServer) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyMessageReceiver extends BroadcastReceiver {
        public final /* synthetic */ SobotSessionServer this$0;

        public MyMessageReceiver(SobotSessionServer sobotSessionServer) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyNetWorkChangeReceiver extends BroadcastReceiver {
        public final /* synthetic */ SobotSessionServer this$0;

        public MyNetWorkChangeReceiver(SobotSessionServer sobotSessionServer) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static /* synthetic */ boolean access$000(SobotSessionServer sobotSessionServer, String str) {
    }

    public static /* synthetic */ void access$100(SobotSessionServer sobotSessionServer, Context context, ZhiChiPushMessage zhiChiPushMessage) {
    }

    public static /* synthetic */ boolean access$200(SobotSessionServer sobotSessionServer) {
    }

    public static /* synthetic */ boolean access$202(SobotSessionServer sobotSessionServer, boolean z) {
    }

    public static /* synthetic */ Information access$300(SobotSessionServer sobotSessionServer) {
    }

    public static /* synthetic */ Information access$302(SobotSessionServer sobotSessionServer, Information information) {
    }

    public static /* synthetic */ ZhiChiConfig access$400(SobotSessionServer sobotSessionServer) {
    }

    public static /* synthetic */ ZhiChiConfig access$402(SobotSessionServer sobotSessionServer, ZhiChiConfig zhiChiConfig) {
    }

    private void createCustomerQueue(String str, String str2, String str3) {
    }

    private void createCustomerService(Context context, String str, String str2, String str3, ZhiChiPushMessage zhiChiPushMessage) {
    }

    private int getNotificationId() {
    }

    private void initBrocastReceiver() {
    }

    private boolean isNeedShowMessage(String str) {
    }

    private void receiveMessage(Context context, ZhiChiPushMessage zhiChiPushMessage) {
    }

    private void showNotification(String str, ZhiChiPushMessage zhiChiPushMessage, boolean z) {
    }

    public String getResString(String str) {
    }

    public int getResStringId(String str) {
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    public void sendBroadcast(ZhiChiPushMessage zhiChiPushMessage, String str, boolean z) {
    }

    public void startTimeTask() {
    }

    public void stopTimeTask() {
    }
}

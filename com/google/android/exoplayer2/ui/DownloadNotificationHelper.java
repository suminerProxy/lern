package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DownloadNotificationHelper {
    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String channelId) {
    }

    private Notification buildEndStateNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, @StringRes int titleStringId) {
    }

    private Notification buildNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, @StringRes int titleStringId, int maxProgress, int currentProgress, boolean indeterminateProgress, boolean ongoing, boolean showWhen) {
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message) {
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message) {
    }

    public Notification buildProgressNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, List<Download> downloads) {
    }
}

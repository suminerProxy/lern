package com.showstartfans.activity.receiver;

import android.content.Context;
import com.showstartfans.activity.eventmodel.MessageNewEvent;
import com.showstartfans.activity.model.JPushBean;
import com.tencent.android.tpush.XGPushBaseReceiver;
import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushRegisterResult;
import com.tencent.android.tpush.XGPushShowedResult;
import com.tencent.android.tpush.XGPushTextMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TpnsReceiver.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J.\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u001b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/receiver/TpnsReceiver;", "Lcom/tencent/android/tpush/XGPushBaseReceiver;", "()V", "TAG", "", "onDeleteAccountResult", "", "p0", "Landroid/content/Context;", "p1", "", "p2", "onDeleteAttributeResult", "onDeleteTagResult", "onNotificationClickedResult", "context", "message", "Lcom/tencent/android/tpush/XGPushClickedResult;", "onNotificationShowedResult", "notifiShowedRlt", "Lcom/tencent/android/tpush/XGPushShowedResult;", "onQueryTagsResult", "p3", "onRegisterResult", "Lcom/tencent/android/tpush/XGPushRegisterResult;", "onSetAccountResult", "onSetAttributeResult", "onSetTagResult", "onTextMessage", "Lcom/tencent/android/tpush/XGPushTextMessage;", "onUnregisterResult", "parse", "Lcom/showstartfans/activity/model/JPushBean;", "extra", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class TpnsReceiver extends XGPushBaseReceiver {
    @NotNull
    private final String b;

    public static /* synthetic */ void i(String str, Object obj) {
    }

    public static /* synthetic */ void j(Context context, MessageNewEvent messageNewEvent, Object obj) {
    }

    public static /* synthetic */ void k(MessageNewEvent messageNewEvent, Object obj) {
    }

    private static final void l(Context context, MessageNewEvent messageNewEvent, Object obj) {
    }

    private static final void m(MessageNewEvent messageNewEvent, Object obj) {
    }

    private static final void n(String str, Object obj) {
    }

    private final JPushBean o(String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onDeleteAccountResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onDeleteAttributeResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onDeleteTagResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onNotificationClickedResult(@Nullable Context context, @Nullable XGPushClickedResult xGPushClickedResult) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onNotificationShowedResult(@Nullable Context context, @Nullable XGPushShowedResult xGPushShowedResult) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onQueryTagsResult(@Nullable Context context, int i2, @Nullable String str, @Nullable String str2) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onRegisterResult(@Nullable Context context, int i2, @Nullable XGPushRegisterResult xGPushRegisterResult) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onSetAccountResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onSetAttributeResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onSetTagResult(@Nullable Context context, int i2, @Nullable String str) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onTextMessage(@Nullable Context context, @Nullable XGPushTextMessage xGPushTextMessage) {
    }

    @Override // com.tencent.android.tpush.XGPushBaseReceiver
    public void onUnregisterResult(@Nullable Context context, int i2) {
    }
}

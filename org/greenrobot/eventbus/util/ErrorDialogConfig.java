package org.greenrobot.eventbus.util;

import android.content.res.Resources;
import org.greenrobot.eventbus.EventBus;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ErrorDialogConfig {
    public int defaultDialogIconId;
    public final int defaultErrorMsgId;
    public Class<?> defaultEventTypeOnDialogClosed;
    public final int defaultTitleId;
    public EventBus eventBus;
    public boolean logExceptions;
    public final ExceptionToResourceMapping mapping;
    public final Resources resources;
    public String tagForLoggingExceptions;

    public ErrorDialogConfig(Resources resources, int i2, int i3) {
    }

    public ErrorDialogConfig addMapping(Class<? extends Throwable> cls, int i2) {
    }

    public void disableExceptionLogging() {
    }

    public EventBus getEventBus() {
    }

    public int getMessageIdForThrowable(Throwable th) {
    }

    public void setDefaultDialogIconId(int i2) {
    }

    public void setDefaultEventTypeOnDialogClosed(Class<?> cls) {
    }

    public void setEventBus(EventBus eventBus) {
    }

    public void setTagForLoggingExceptions(String str) {
    }
}

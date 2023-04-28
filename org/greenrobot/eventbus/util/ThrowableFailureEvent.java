package org.greenrobot.eventbus.util;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ThrowableFailureEvent implements HasExecutionScope {
    private Object executionContext;
    public final boolean suppressErrorUi;
    public final Throwable throwable;

    public ThrowableFailureEvent(Throwable th) {
    }

    @Override // org.greenrobot.eventbus.util.HasExecutionScope
    public Object getExecutionScope() {
    }

    public Throwable getThrowable() {
    }

    public boolean isSuppressErrorUi() {
    }

    @Override // org.greenrobot.eventbus.util.HasExecutionScope
    public void setExecutionScope(Object obj) {
    }

    public ThrowableFailureEvent(Throwable th, boolean z) {
    }
}

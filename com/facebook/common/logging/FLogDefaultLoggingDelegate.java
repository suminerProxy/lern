package com.facebook.common.logging;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FLogDefaultLoggingDelegate implements LoggingDelegate {
    public static final FLogDefaultLoggingDelegate sInstance = null;
    private String mApplicationTag;
    private int mMinimumLoggingLevel;

    private FLogDefaultLoggingDelegate() {
    }

    public static FLogDefaultLoggingDelegate getInstance() {
    }

    private static String getMsg(String msg, Throwable tr) {
    }

    private static String getStackTraceString(Throwable tr) {
    }

    private String prefixTag(String tag) {
    }

    private void println(int priority, String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void d(String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void e(String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public int getMinimumLoggingLevel() {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void i(String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public boolean isLoggable(int level) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void log(int priority, String tag, String msg) {
    }

    public void setApplicationTag(String tag) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void setMinimumLoggingLevel(int level) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void v(String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void w(String tag, String msg) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String tag, String msg) {
    }

    private void println(int priority, String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void d(String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void e(String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void i(String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void v(String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void w(String tag, String msg, Throwable tr) {
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String tag, String msg, Throwable tr) {
    }
}

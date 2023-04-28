package com.tencent.thumbplayer.api;

import android.util.SparseArray;
import com.tencent.thumbplayer.adapter.a.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPPlayerState {
    public static final int COMPLETE = 7;
    public static final int ERROR = 10;
    public static final int IDLE = 1;
    public static final int INDEX = 0;
    public static final int INITIALIZED = 2;
    private static final SparseArray<String> NS_STATES = null;
    public static final int PAUSE = 6;
    public static final int PREPARED = 4;
    public static final int PREPARING = 3;
    public static final int RELEASED = 11;
    public static final int START = 5;
    public static final int STOPPED = 9;
    public static final int STOPPING = 8;
    private int mCurState;
    private int mInnerPlayState;
    private int mLastState;
    private int mPreState;
    private c.k mStateChangeListener;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface STATE {
    }

    public synchronized void changeState(int i2) {
    }

    public synchronized int innerPlayState() {
    }

    public synchronized boolean is(int i2) {
    }

    public synchronized int lastState() {
    }

    public synchronized int preState() {
    }

    public synchronized void setInnerPlayStateState(int i2) {
    }

    public synchronized void setLastState(int i2) {
    }

    public void setOnPlayerStateChangeListener(c.k kVar) {
    }

    public synchronized int state() {
    }

    public synchronized String toString() {
    }
}

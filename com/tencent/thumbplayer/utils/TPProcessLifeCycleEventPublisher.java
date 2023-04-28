package com.tencent.thumbplayer.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPProcessLifeCycleEventPublisher implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private static TPProcessLifeCycleEventPublisher f13577a;
    private static boolean b;
    private static ArrayList<a> c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2);
    }

    private TPProcessLifeCycleEventPublisher() {
    }

    private static synchronized void a(int i2) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onStop() {
    }
}

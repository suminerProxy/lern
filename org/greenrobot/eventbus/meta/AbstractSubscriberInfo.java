package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.SubscriberMethod;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class AbstractSubscriberInfo implements SubscriberInfo {
    private final boolean shouldCheckSuperclass;
    private final Class subscriberClass;
    private final Class<? extends SubscriberInfo> superSubscriberInfoClass;

    public AbstractSubscriberInfo(Class cls, Class<? extends SubscriberInfo> cls2, boolean z) {
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls) {
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfo
    public Class getSubscriberClass() {
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfo
    public SubscriberInfo getSuperSubscriberInfo() {
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfo
    public boolean shouldCheckSuperclass() {
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls, ThreadMode threadMode) {
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
    }
}

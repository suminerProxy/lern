package org.greenrobot.eventbus;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class PendingPost {
    private static final List<PendingPost> pendingPostPool = null;
    public Object event;
    public PendingPost next;
    public Subscription subscription;

    private PendingPost(Object obj, Subscription subscription) {
    }

    public static PendingPost obtainPendingPost(Subscription subscription, Object obj) {
    }

    public static void releasePendingPost(PendingPost pendingPost) {
    }
}

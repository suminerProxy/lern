package com.facebook.stetho.common.android;

import android.content.res.Resources;
import android.view.View;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> {
    public static final int NO_ID = 0;

    @Nullable
    FRAGMENT_MANAGER getChildFragmentManager(FRAGMENT fragment);

    @Nullable
    FRAGMENT_MANAGER getFragmentManager(FRAGMENT fragment);

    int getId(FRAGMENT fragment);

    Resources getResources(FRAGMENT fragment);

    @Nullable
    String getTag(FRAGMENT fragment);

    @Nullable
    View getView(FRAGMENT fragment);
}

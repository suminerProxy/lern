package com.facebook.stetho.inspector.elements.android.window;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class WindowRootViewCompat {
    private static WindowRootViewCompat sInstance;

    public static WindowRootViewCompat get(Context context) {
    }

    @NonNull
    public abstract List<View> getRootViews();
}

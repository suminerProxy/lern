package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = null;
    public static final int FIELD_RATING_TYPE = 0;
    public static final int RATING_TYPE_DEFAULT = -1;
    public static final int RATING_TYPE_HEART = 0;
    public static final int RATING_TYPE_PERCENTAGE = 1;
    public static final int RATING_TYPE_STAR = 2;
    public static final int RATING_TYPE_THUMB = 3;
    public static final float RATING_UNSET = -1.0f;

    public static /* synthetic */ Rating a(Bundle bundle) {
    }

    private static Rating fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public abstract boolean isRated();
}

package com.google.android.exoplayer2.util;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BundleableUtils {
    private BundleableUtils() {
    }

    public static <T extends Bundleable> ImmutableList<T> fromBundleList(Bundleable.Creator<T> creator, List<Bundle> bundleList) {
    }

    @Nullable
    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, @Nullable Bundle bundle) {
    }

    public static <T extends Bundleable> ArrayList<Bundle> toBundleArrayList(List<T> bundleableList) {
    }

    public static <T extends Bundleable> ImmutableList<Bundle> toBundleList(List<T> bundleableList) {
    }

    @Nullable
    public static Bundle toNullableBundle(@Nullable Bundleable bundleable) {
    }

    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, @Nullable Bundle bundle, T defaultValue) {
    }
}

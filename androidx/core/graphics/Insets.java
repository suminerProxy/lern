package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Insets {
    @NonNull
    public static final Insets NONE = null;
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top  reason: collision with root package name */
    public final int f30top;

    private Insets(int i2, int i3, int i4, int i5) {
    }

    @NonNull
    public static Insets of(int i2, int i3, int i4, int i5) {
    }

    @NonNull
    @RequiresApi(api = 29)
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets) {
    }

    @NonNull
    @Deprecated
    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Insets wrap(@NonNull android.graphics.Insets insets) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @NonNull
    @RequiresApi(api = 29)
    public android.graphics.Insets toPlatformInsets() {
    }

    public String toString() {
    }

    @NonNull
    public static Insets of(@NonNull Rect rect) {
    }
}

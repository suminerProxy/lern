package androidx.core.hardware.display;

import android.content.Context;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final WeakHashMap<Context, DisplayManagerCompat> sInstances = null;
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
    }

    @Nullable
    public Display getDisplay(int i2) {
    }

    @NonNull
    public Display[] getDisplays() {
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
    }
}

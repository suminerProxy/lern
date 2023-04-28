package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SharedPreferencesCompat {

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class EditorCompat {
        private static EditorCompat sInstance;
        private final Helper mHelper;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Helper {
            public void apply(@NonNull SharedPreferences.Editor editor) {
            }
        }

        private EditorCompat() {
        }

        @Deprecated
        public static EditorCompat getInstance() {
        }

        @Deprecated
        public void apply(@NonNull SharedPreferences.Editor editor) {
        }
    }

    private SharedPreferencesCompat() {
    }
}

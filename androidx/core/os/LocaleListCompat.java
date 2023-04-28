package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import java.util.Locale;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LocaleListCompat {
    private static final LocaleListCompat sEmptyLocaleList = null;
    private LocaleListInterface mImpl;

    private LocaleListCompat(LocaleListInterface localeListInterface) {
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale... localeArr) {
    }

    public static Locale forLanguageTagCompat(String str) {
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getAdjustedDefault() {
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getDefault() {
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
    }

    public boolean equals(Object obj) {
    }

    public Locale get(int i2) {
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
    }

    public int hashCode() {
    }

    @IntRange(from = -1)
    public int indexOf(Locale locale) {
    }

    public boolean isEmpty() {
    }

    @IntRange(from = 0)
    public int size() {
    }

    @NonNull
    public String toLanguageTags() {
    }

    public String toString() {
    }

    @Nullable
    public Object unwrap() {
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList) {
    }
}

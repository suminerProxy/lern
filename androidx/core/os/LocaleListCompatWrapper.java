package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.Locale;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LocaleListCompatWrapper implements LocaleListInterface {
    private static final Locale EN_LATN = null;
    private static final Locale LOCALE_AR_XB = null;
    private static final Locale LOCALE_EN_XA = null;
    private static final Locale[] sEmptyList = null;
    private final Locale[] mList;
    @NonNull
    private final String mStringRepresentation;

    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
    }

    private int computeFirstMatchIndex(Collection<String> collection, boolean z) {
    }

    private int findFirstMatchIndex(Locale locale) {
    }

    private static String getLikelyScript(Locale locale) {
    }

    private static boolean isPseudoLocale(Locale locale) {
    }

    @IntRange(from = 0, to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
    }

    @VisibleForTesting
    public static void toLanguageTag(StringBuilder sb, Locale locale) {
    }

    public boolean equals(Object obj) {
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(@NonNull String[] strArr) {
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    public Object getLocaleList() {
    }

    public int hashCode() {
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
    }

    public String toString() {
    }
}

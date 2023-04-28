package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShortcutInfoCompat {
    private static final String EXTRA_LONG_LIVED = "extraLongLived";
    private static final String EXTRA_PERSON_ = "extraPerson_";
    private static final String EXTRA_PERSON_COUNT = "extraPersonCount";
    public ComponentName mActivity;
    public Set<String> mCategories;
    public Context mContext;
    public CharSequence mDisabledMessage;
    public IconCompat mIcon;
    public String mId;
    public Intent[] mIntents;
    public boolean mIsAlwaysBadged;
    public boolean mIsLongLived;
    public CharSequence mLabel;
    public CharSequence mLongLabel;
    public Person[] mPersons;
    public int mRank;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private final ShortcutInfoCompat mInfo;

        public Builder(@NonNull Context context, @NonNull String str) {
        }

        @NonNull
        public ShortcutInfoCompat build() {
        }

        @NonNull
        public Builder setActivity(@NonNull ComponentName componentName) {
        }

        @NonNull
        public Builder setAlwaysBadged() {
        }

        @NonNull
        public Builder setCategories(@NonNull Set<String> set) {
        }

        @NonNull
        public Builder setDisabledMessage(@NonNull CharSequence charSequence) {
        }

        @NonNull
        public Builder setIcon(IconCompat iconCompat) {
        }

        @NonNull
        public Builder setIntent(@NonNull Intent intent) {
        }

        @NonNull
        public Builder setIntents(@NonNull Intent[] intentArr) {
        }

        @NonNull
        public Builder setLongLabel(@NonNull CharSequence charSequence) {
        }

        @NonNull
        @Deprecated
        public Builder setLongLived() {
        }

        @NonNull
        public Builder setPerson(@NonNull Person person) {
        }

        @NonNull
        public Builder setPersons(@NonNull Person[] personArr) {
        }

        @NonNull
        public Builder setRank(int i2) {
        }

        @NonNull
        public Builder setShortLabel(@NonNull CharSequence charSequence) {
        }

        @NonNull
        public Builder setLongLived(boolean z) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull ShortcutInfoCompat shortcutInfoCompat) {
        }

        @RequiresApi(25)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull Context context, @NonNull ShortcutInfo shortcutInfo) {
        }
    }

    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private PersistableBundle buildLegacyExtrasBundle() {
    }

    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static boolean getLongLivedFromExtra(@NonNull PersistableBundle persistableBundle) {
    }

    @VisibleForTesting
    @Nullable
    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person[] getPersonsFromExtra(@NonNull PersistableBundle persistableBundle) {
    }

    public Intent addToIntent(Intent intent) {
    }

    @Nullable
    public ComponentName getActivity() {
    }

    @Nullable
    public Set<String> getCategories() {
    }

    @Nullable
    public CharSequence getDisabledMessage() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat getIcon() {
    }

    @NonNull
    public String getId() {
    }

    @NonNull
    public Intent getIntent() {
    }

    @NonNull
    public Intent[] getIntents() {
    }

    @Nullable
    public CharSequence getLongLabel() {
    }

    public int getRank() {
    }

    @NonNull
    public CharSequence getShortLabel() {
    }

    @RequiresApi(25)
    public ShortcutInfo toShortcutInfo() {
    }
}

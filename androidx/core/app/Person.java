package androidx.core.app;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    @Nullable
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    @Nullable
    public String mKey;
    @Nullable
    public CharSequence mName;
    @Nullable
    public String mUri;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        @Nullable
        public IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;
        @Nullable
        public String mKey;
        @Nullable
        public CharSequence mName;
        @Nullable
        public String mUri;

        public Builder() {
        }

        @NonNull
        public Person build() {
        }

        @NonNull
        public Builder setBot(boolean z) {
        }

        @NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat) {
        }

        @NonNull
        public Builder setImportant(boolean z) {
        }

        @NonNull
        public Builder setKey(@Nullable String str) {
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
        }

        public Builder(Person person) {
        }
    }

    public Person(Builder builder) {
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromAndroidPerson(@NonNull android.app.Person person) {
    }

    @NonNull
    public static Person fromBundle(@NonNull Bundle bundle) {
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromPersistableBundle(@NonNull PersistableBundle persistableBundle) {
    }

    @Nullable
    public IconCompat getIcon() {
    }

    @Nullable
    public String getKey() {
    }

    @Nullable
    public CharSequence getName() {
    }

    @Nullable
    public String getUri() {
    }

    public boolean isBot() {
    }

    public boolean isImportant() {
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
    }

    @NonNull
    public Builder toBuilder() {
    }

    @NonNull
    public Bundle toBundle() {
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle toPersistableBundle() {
    }
}

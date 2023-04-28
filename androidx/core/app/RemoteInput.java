package androidx.core.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final Set<String> mAllowedDataTypes;
        private CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        public Builder(@NonNull String str) {
        }

        @NonNull
        public Builder addExtras(@NonNull Bundle bundle) {
        }

        @NonNull
        public RemoteInput build() {
        }

        @NonNull
        public Bundle getExtras() {
        }

        @NonNull
        public Builder setAllowDataType(@NonNull String str, boolean z) {
        }

        @NonNull
        public Builder setAllowFreeFormInput(boolean z) {
        }

        @NonNull
        public Builder setChoices(@Nullable CharSequence[] charSequenceArr) {
        }

        @NonNull
        public Builder setEditChoicesBeforeSending(int i2) {
        }

        @NonNull
        public Builder setLabel(@Nullable CharSequence charSequence) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface Source {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i2, Bundle bundle, Set<String> set) {
    }

    public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
    }

    @RequiresApi(20)
    public static android.app.RemoteInput[] fromCompat(RemoteInput[] remoteInputArr) {
    }

    @RequiresApi(16)
    private static Intent getClipDataIntentFromIntent(Intent intent) {
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
    }

    private static String getExtraResultsKeyForData(String str) {
    }

    public static Bundle getResultsFromIntent(Intent intent) {
    }

    public static int getResultsSource(@NonNull Intent intent) {
    }

    public static void setResultsSource(@NonNull Intent intent, int i2) {
    }

    public boolean getAllowFreeFormInput() {
    }

    public Set<String> getAllowedDataTypes() {
    }

    public CharSequence[] getChoices() {
    }

    public int getEditChoicesBeforeSending() {
    }

    public Bundle getExtras() {
    }

    public CharSequence getLabel() {
    }

    public String getResultKey() {
    }

    public boolean isDataOnly() {
    }

    @RequiresApi(20)
    public static android.app.RemoteInput fromCompat(RemoteInput remoteInput) {
    }
}

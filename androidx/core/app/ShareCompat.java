package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ShareCompat {
    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class IntentBuilder {
        @Nullable
        private ArrayList<String> mBccAddresses;
        @Nullable
        private ArrayList<String> mCcAddresses;
        @Nullable
        private CharSequence mChooserTitle;
        @NonNull
        private final Context mContext;
        @NonNull
        private final Intent mIntent;
        @Nullable
        private ArrayList<Uri> mStreams;
        @Nullable
        private ArrayList<String> mToAddresses;

        private IntentBuilder(@NonNull Context context, @Nullable ComponentName componentName) {
        }

        private void combineArrayExtra(String str, ArrayList<String> arrayList) {
        }

        @NonNull
        public static IntentBuilder from(@NonNull Activity activity) {
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String str) {
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String str) {
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String str) {
        }

        @NonNull
        public IntentBuilder addStream(@NonNull Uri uri) {
        }

        @NonNull
        public Intent createChooserIntent() {
        }

        @NonNull
        public Context getContext() {
        }

        @NonNull
        public Intent getIntent() {
        }

        @NonNull
        public IntentBuilder setChooserTitle(@Nullable CharSequence charSequence) {
        }

        @NonNull
        public IntentBuilder setEmailBcc(@Nullable String[] strArr) {
        }

        @NonNull
        public IntentBuilder setEmailCc(@Nullable String[] strArr) {
        }

        @NonNull
        public IntentBuilder setEmailTo(@Nullable String[] strArr) {
        }

        @NonNull
        public IntentBuilder setHtmlText(@Nullable String str) {
        }

        @NonNull
        public IntentBuilder setStream(@Nullable Uri uri) {
        }

        @NonNull
        public IntentBuilder setSubject(@Nullable String str) {
        }

        @NonNull
        public IntentBuilder setText(@Nullable CharSequence charSequence) {
        }

        @NonNull
        public IntentBuilder setType(@Nullable String str) {
        }

        public void startChooser() {
        }

        @NonNull
        private static IntentBuilder from(@NonNull Context context, @Nullable ComponentName componentName) {
        }

        @NonNull
        public IntentBuilder setChooserTitle(@StringRes int i2) {
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String[] strArr) {
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String[] strArr) {
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String[] strArr) {
        }

        private void combineArrayExtra(@Nullable String str, @NonNull String[] strArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class IntentReader {
        private static final String TAG = "IntentReader";
        @Nullable
        private final ComponentName mCallingActivity;
        @Nullable
        private final String mCallingPackage;
        @NonNull
        private final Context mContext;
        @NonNull
        private final Intent mIntent;
        @Nullable
        private ArrayList<Uri> mStreams;

        private IntentReader(@NonNull Context context, @NonNull Intent intent) {
        }

        @NonNull
        public static IntentReader from(@NonNull Activity activity) {
        }

        private static void withinStyle(StringBuilder sb, CharSequence charSequence, int i2, int i3) {
        }

        @Nullable
        public ComponentName getCallingActivity() {
        }

        @Nullable
        public Drawable getCallingActivityIcon() {
        }

        @Nullable
        public Drawable getCallingApplicationIcon() {
        }

        @Nullable
        public CharSequence getCallingApplicationLabel() {
        }

        @Nullable
        public String getCallingPackage() {
        }

        @Nullable
        public String[] getEmailBcc() {
        }

        @Nullable
        public String[] getEmailCc() {
        }

        @Nullable
        public String[] getEmailTo() {
        }

        @Nullable
        public String getHtmlText() {
        }

        @Nullable
        public Uri getStream() {
        }

        public int getStreamCount() {
        }

        @Nullable
        public String getSubject() {
        }

        @Nullable
        public CharSequence getText() {
        }

        @Nullable
        public String getType() {
        }

        public boolean isMultipleShare() {
        }

        public boolean isShareIntent() {
        }

        public boolean isSingleShare() {
        }

        @NonNull
        private static IntentReader from(@NonNull Context context, @NonNull Intent intent) {
        }

        @Nullable
        public Uri getStream(int i2) {
        }
    }

    private ShareCompat() {
    }

    public static void configureMenuItem(@NonNull MenuItem menuItem, @NonNull IntentBuilder intentBuilder) {
    }

    @Nullable
    public static ComponentName getCallingActivity(@NonNull Activity activity) {
    }

    @Nullable
    public static String getCallingPackage(@NonNull Activity activity) {
    }

    @Nullable
    public static ComponentName getCallingActivity(@NonNull Intent intent) {
    }

    @Nullable
    public static String getCallingPackage(@NonNull Intent intent) {
    }

    public static void configureMenuItem(@NonNull Menu menu, @IdRes int i2, @NonNull IntentBuilder intentBuilder) {
    }
}

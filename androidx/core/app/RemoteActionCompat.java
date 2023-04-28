package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RemoteActionCompat implements VersionedParcelable {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PendingIntent mActionIntent;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence mContentDescription;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mEnabled;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public IconCompat mIcon;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mShouldShowIcon;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence mTitle;

    public RemoteActionCompat(@NonNull IconCompat iconCompat, @NonNull CharSequence charSequence, @NonNull CharSequence charSequence2, @NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    @RequiresApi(26)
    public static RemoteActionCompat createFromRemoteAction(@NonNull RemoteAction remoteAction) {
    }

    @NonNull
    public PendingIntent getActionIntent() {
    }

    @NonNull
    public CharSequence getContentDescription() {
    }

    @NonNull
    public IconCompat getIcon() {
    }

    @NonNull
    public CharSequence getTitle() {
    }

    public boolean isEnabled() {
    }

    public void setEnabled(boolean z) {
    }

    public void setShouldShowIcon(boolean z) {
    }

    public boolean shouldShowIcon() {
    }

    @NonNull
    @RequiresApi(26)
    public RemoteAction toRemoteAction() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@NonNull RemoteActionCompat remoteActionCompat) {
    }
}

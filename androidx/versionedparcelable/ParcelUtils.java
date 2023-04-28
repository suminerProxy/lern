package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ParcelUtils {
    private static final String INNER_BUNDLE_KEY = "a";

    private ParcelUtils() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends VersionedParcelable> T fromInputStream(InputStream inputStream) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends VersionedParcelable> T fromParcelable(Parcelable parcelable) {
    }

    @Nullable
    public static <T extends VersionedParcelable> T getVersionedParcelable(@NonNull Bundle bundle, @NonNull String str) {
    }

    @Nullable
    public static <T extends VersionedParcelable> List<T> getVersionedParcelableList(Bundle bundle, String str) {
    }

    public static void putVersionedParcelable(@NonNull Bundle bundle, @NonNull String str, @Nullable VersionedParcelable versionedParcelable) {
    }

    public static void putVersionedParcelableList(@NonNull Bundle bundle, @NonNull String str, @NonNull List<? extends VersionedParcelable> list) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void toOutputStream(VersionedParcelable versionedParcelable, OutputStream outputStream) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Parcelable toParcelable(VersionedParcelable versionedParcelable) {
    }
}

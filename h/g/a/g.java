package h.g.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.net.URL;

/* compiled from: ModelTypes.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface g<T> {
    @NonNull
    @CheckResult
    T a(@Nullable String str);

    @CheckResult
    @Deprecated
    T b(@Nullable URL url);

    @NonNull
    @CheckResult
    T c(@Nullable Uri uri);

    @NonNull
    @CheckResult
    T d(@Nullable byte[] bArr);

    @NonNull
    @CheckResult
    T e(@Nullable File file);

    @NonNull
    @CheckResult
    T f(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    T g(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    T h(@Nullable Object obj);

    @NonNull
    @CheckResult
    T i(@Nullable @DrawableRes @RawRes Integer num);
}

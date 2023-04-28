package skin.support.svg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.app.SkinLayoutInflater;

/* compiled from: SkinCustomViewLayoutInflater.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lskin/support/svg/SkinCustomViewLayoutInflater;", "Lskin/support/app/SkinLayoutInflater;", "()V", "createView", "Landroid/view/View;", "context", "Landroid/content/Context;", "name", "", "attrs", "Landroid/util/AttributeSet;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class SkinCustomViewLayoutInflater implements SkinLayoutInflater {
    @Override // skin.support.app.SkinLayoutInflater
    @Nullable
    public View createView(@NotNull Context context, @Nullable String str, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (Intrinsics.areEqual(str, "com.taihebase.activity.view.svg.SvgImageView")) {
            return new SkinSvgImageView(context, attrs);
        }
        return null;
    }
}

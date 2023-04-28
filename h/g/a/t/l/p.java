package h.g.a.t.l;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Target.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface p<R> extends h.g.a.q.m {
    public static final int a0 = Integer.MIN_VALUE;

    @Nullable
    h.g.a.t.e getRequest();

    void getSize(@NonNull o oVar);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable h.g.a.t.m.f<? super R> fVar);

    void removeCallback(@NonNull o oVar);

    void setRequest(@Nullable h.g.a.t.e eVar);
}

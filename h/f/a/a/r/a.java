package h.f.a.a.r;

import android.graphics.Rect;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: IViewCacheStorage.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a {
    boolean a(int i2);

    void b(int i2);

    void c(boolean z);

    int d(int i2);

    boolean e();

    void f(int i2);

    @Nullable
    Integer g();

    boolean h();

    void i(List<Pair<Rect, View>> list);

    boolean j(int i2);

    void k();

    boolean l(int i2);

    void onRestoreInstanceState(@Nullable Parcelable parcelable);

    Parcelable onSaveInstanceState();
}

package h.g.a.p.p.a0;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* compiled from: LruPoolStrategy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface l {
    String a(Bitmap bitmap);

    String b(int i2, int i3, Bitmap.Config config);

    int c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @Nullable
    Bitmap f(int i2, int i3, Bitmap.Config config);

    @Nullable
    Bitmap removeLast();
}

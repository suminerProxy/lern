package h.g.a.o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16524a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16525d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f16526e = 0;

    /* compiled from: GifDecoder.java */
    /* renamed from: h.g.a.o.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0307a {
        void a(@NonNull Bitmap bitmap);

        @NonNull
        byte[] b(int i2);

        @NonNull
        Bitmap c(int i2, int i3, @NonNull Bitmap.Config config);

        @NonNull
        int[] d(int i2);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    /* compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface b {
    }

    @Nullable
    Bitmap a();

    void b();

    void c(@NonNull Bitmap.Config config);

    void clear();

    int d(int i2);

    int e();

    int f();

    void g(@NonNull c cVar, @NonNull byte[] bArr);

    @NonNull
    ByteBuffer getData();

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getWidth();

    int h();

    void i();

    void j(@NonNull c cVar, @NonNull ByteBuffer byteBuffer);

    int k();

    void l(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i2);

    int m();

    int n(@Nullable InputStream inputStream, int i2);

    int o();

    int read(@Nullable byte[] bArr);
}

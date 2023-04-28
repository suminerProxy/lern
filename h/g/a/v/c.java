package h.g.a.v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class c extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    private static final String f17261d = "ContentLengthStream";

    /* renamed from: e  reason: collision with root package name */
    private static final int f17262e = -1;
    private final long b;
    private int c;

    private c(@NonNull InputStream inputStream, long j2) {
    }

    private int a(int i2) throws IOException {
    }

    @NonNull
    public static InputStream b(@NonNull InputStream inputStream, long j2) {
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream, @Nullable String str) {
    }

    private static int d(@Nullable String str) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
    }
}

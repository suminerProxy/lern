package h.g.a.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f16578a = 5242880;

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f16579a;

        public a(InputStream inputStream) {
        }

        @Override // h.g.a.p.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f16580a;

        public b(ByteBuffer byteBuffer) {
        }

        @Override // h.g.a.p.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f16581a;
        public final /* synthetic */ h.g.a.p.p.a0.b b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, h.g.a.p.p.a0.b bVar) {
        }

        @Override // h.g.a.p.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d implements InterfaceC0308f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f16582a;
        public final /* synthetic */ h.g.a.p.p.a0.b b;

        public d(InputStream inputStream, h.g.a.p.p.a0.b bVar) {
        }

        @Override // h.g.a.p.f.InterfaceC0308f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class e implements InterfaceC0308f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f16583a;
        public final /* synthetic */ h.g.a.p.p.a0.b b;

        public e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, h.g.a.p.p.a0.b bVar) {
        }

        @Override // h.g.a.p.f.InterfaceC0308f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: h.g.a.p.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0308f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private f() {
    }

    @RequiresApi(21)
    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }

    public static int b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }

    private static int c(@NonNull List<ImageHeaderParser> list, InterfaceC0308f interfaceC0308f) throws IOException {
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType d(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }

    @NonNull
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
    }

    @NonNull
    private static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
    }
}

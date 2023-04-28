package h.g.a.p.r.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface x {

    /* compiled from: ImageReader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final h.g.a.p.o.k f17071a;
        private final h.g.a.p.p.a0.b b;
        private final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, h.g.a.p.p.a0.b bVar) {
        }

        @Override // h.g.a.p.r.d.x
        @Nullable
        public Bitmap a(BitmapFactory.Options options) throws IOException {
        }

        @Override // h.g.a.p.r.d.x
        public void b() {
        }

        @Override // h.g.a.p.r.d.x
        public int c() throws IOException {
        }

        @Override // h.g.a.p.r.d.x
        public ImageHeaderParser.ImageType d() throws IOException {
        }
    }

    /* compiled from: ImageReader.java */
    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        private final h.g.a.p.p.a0.b f17072a;
        private final List<ImageHeaderParser> b;
        private final ParcelFileDescriptorRewinder c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, h.g.a.p.p.a0.b bVar) {
        }

        @Override // h.g.a.p.r.d.x
        @Nullable
        public Bitmap a(BitmapFactory.Options options) throws IOException {
        }

        @Override // h.g.a.p.r.d.x
        public void b() {
        }

        @Override // h.g.a.p.r.d.x
        public int c() throws IOException {
        }

        @Override // h.g.a.p.r.d.x
        public ImageHeaderParser.ImageType d() throws IOException {
        }
    }

    @Nullable
    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}

package h.g.a.p.r;

import android.annotation.SuppressLint;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import h.g.a.p.j;
import h.g.a.p.k;
import h.g.a.p.l;
import h.g.a.p.p.v;
import h.g.a.p.r.d.p;
import h.g.a.p.r.d.w;
import java.io.IOException;

/* compiled from: ImageDecoderResourceDecoder.java */
@RequiresApi(api = 28)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class a<T> implements l<ImageDecoder.Source, T> {
    private static final String b = "ImageDecoder";

    /* renamed from: a  reason: collision with root package name */
    public final w f16964a;

    /* compiled from: ImageDecoderResourceDecoder.java */
    /* renamed from: h.g.a.p.r.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0323a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16965a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h.g.a.p.b f16966d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p f16967e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ k f16968f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f16969g;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: h.g.a.p.r.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0324a implements ImageDecoder.OnPartialImageListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C0323a f16970a;

            public C0324a(C0323a c0323a) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            }
        }

        public C0323a(a aVar, int i2, int i3, boolean z, h.g.a.p.b bVar, p pVar, k kVar) {
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        }
    }

    @Override // h.g.a.p.l
    public /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull j jVar) throws IOException {
    }

    @Override // h.g.a.p.l
    @Nullable
    public /* bridge */ /* synthetic */ v b(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull j jVar) throws IOException {
    }

    public abstract v<T> c(ImageDecoder.Source source, int i2, int i3, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Nullable
    public final v<T> d(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull j jVar) throws IOException {
    }

    public final boolean e(@NonNull ImageDecoder.Source source, @NonNull j jVar) {
    }
}

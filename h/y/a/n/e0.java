package h.y.a.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.Postprocessor;
import java.io.File;

/* compiled from: ImageUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class e0 {

    /* compiled from: ImageUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements ControllerListener<ImageInfo> {
        public void a(String str, ImageInfo imageInfo, Animatable animatable) {
        }

        public void b(String str, ImageInfo imageInfo) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, ImageInfo imageInfo) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onSubmit(String str, Object obj) {
        }
    }

    /* compiled from: ImageUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends BaseBitmapDataSubscriber {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26289a;
        public final /* synthetic */ h.y.a.k.d b;

        public b(String str, h.y.a.k.d dVar) {
        }

        @Override // com.facebook.datasource.BaseDataSubscriber
        public void onFailureImpl(@NonNull DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
        public void onNewResultImpl(@Nullable Bitmap bitmap) {
        }
    }

    /* compiled from: ImageUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c extends BasePostprocessor {
        @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
        public String getName() {
        }

        @Override // com.facebook.imagepipeline.request.BasePostprocessor
        public void process(Bitmap bitmap) {
        }
    }

    public static String A(Context context, SimpleDraweeView simpleDraweeView, String str) {
    }

    public static void B(Context context, SimpleDraweeView simpleDraweeView, String str) {
    }

    public static void C(SimpleDraweeView simpleDraweeView, String str) {
    }

    public static void D(SimpleDraweeView simpleDraweeView, int i2) {
    }

    public static void E(Context context, SimpleDraweeView simpleDraweeView, int i2) {
    }

    public static void F(ImageView imageView) {
    }

    public static void G(ImageView imageView, int i2) {
    }

    public static Bitmap H(Bitmap bitmap) {
    }

    public static void I(Bitmap bitmap, File file, int i2, int i3) {
    }

    public static String J(String str, Context context, int i2, int i3) {
    }

    public static Postprocessor a() {
    }

    private static Bitmap b(Bitmap bitmap) {
    }

    public static Bitmap c(Bitmap bitmap, int i2, Context context) {
    }

    public static void d(Context context) {
    }

    public static Bitmap e(Bitmap bitmap, int i2, boolean z) {
    }

    public static void f(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3, h.y.a.k.d dVar) {
    }

    public static void g(Context context, SimpleDraweeView simpleDraweeView, String str, h.y.a.k.c cVar) {
    }

    public static void h(Context context, String str, int i2, int i3, h.y.a.k.d dVar) {
    }

    public static void i(Context context, String str, h.y.a.k.c cVar) {
    }

    public static int j(int i2, int i3, BitmapFactory.Options options) {
    }

    public static int[] k(String str) {
    }

    public static String l(String str, int i2, int i3) {
    }

    public static /* synthetic */ void m(Context context) throws Exception {
    }

    public static void n(SimpleDraweeView simpleDraweeView, String str, int i2, boolean z) {
    }

    public static void o(SimpleDraweeView simpleDraweeView, String str, int i2, boolean z, boolean z2, boolean z3) {
    }

    public static String p(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3) {
    }

    public static String q(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3, ControllerListener controllerListener) {
    }

    public static String r(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3, boolean z, ControllerListener controllerListener) {
    }

    public static void s(Context context, SimpleDraweeView simpleDraweeView, String str) {
    }

    public static void t(Context context, SimpleDraweeView simpleDraweeView, String str, int i2) {
    }

    public static void u(Context context, SimpleDraweeView simpleDraweeView, String str, boolean z, ControllerListener controllerListener) {
    }

    public static void v(Context context, SimpleDraweeView simpleDraweeView, String str) {
    }

    public static String w(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3, boolean z, ControllerListener controllerListener) {
    }

    public static String x(Context context, SimpleDraweeView simpleDraweeView, String str, int i2, int i3, ControllerListener controllerListener) {
    }

    public static String y(SimpleDraweeView simpleDraweeView, String str) {
    }

    public static String z(SimpleDraweeView simpleDraweeView, String str, boolean z, ControllerListener controllerListener) {
    }
}

package h.y.a.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.RequestLoggingListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.File;
import java.util.HashSet;

/* compiled from: FrescoUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c0 {

    /* renamed from: a */
    private static final String f26273a = "fresco_image_cache";
    private static ImagePipelineConfig b;

    /* compiled from: FrescoUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements i.a.e0<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ String f26274a;

        /* compiled from: FrescoUtil.java */
        /* renamed from: h.y.a.n.c0$a$a */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C0420a extends BaseBitmapDataSubscriber {

            /* renamed from: a */
            public final /* synthetic */ i.a.d0 f26275a;
            public final /* synthetic */ a b;

            public C0420a(a aVar, i.a.d0 d0Var) {
            }

            @Override // com.facebook.datasource.BaseDataSubscriber, com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<CloseableReference<CloseableImage>> dataSource) {
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
            }

            @Override // com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
            public void onNewResultImpl(@Nullable Bitmap bitmap) {
            }
        }

        public a(String str) {
            this.f26274a = str;
        }

        @Override // i.a.e0
        public void a(@i.a.t0.f i.a.d0<Bitmap> d0Var) throws Exception {
            ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(h.x.e.e.o.x(this.f26274a));
            newBuilderWithSource.setImageDecodeOptions(new ImageDecodeOptionsBuilder().setMinDecodeIntervalMs(100).setForceStaticImage(true).build());
            ImagePipelineFactory.getInstance().getImagePipeline().fetchDecodedImage(newBuilderWithSource.build(), null).subscribe(new C0420a(this, d0Var), UiThreadImmediateExecutorService.getInstance());
        }
    }

    /* compiled from: FrescoUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends DefaultCacheKeyFactory {

        /* renamed from: a */
        private static b f26276a;

        public static synchronized b a() {
            b bVar;
            synchronized (b.class) {
                if (f26276a == null) {
                    f26276a = new b();
                }
                bVar = f26276a;
            }
            return bVar;
        }

        @Override // com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
        public Uri getCacheKeySourceUri(Uri uri) {
            return Uri.parse(h.x.e.e.o.b(uri.toString()));
        }
    }

    public static void a(Context context) {
        try {
            Fresco.initialize(context, g(context));
            h.y.a.f.k.b = false;
        } catch (Exception e2) {
            e2.printStackTrace();
            Fresco.initialize(context);
            h.y.a.f.k.b = true;
        }
    }

    private static void b(ImagePipelineConfig.Builder builder, Context context) {
        int i2 = h.x.e.e.m.c;
        final MemoryCacheParams memoryCacheParams = new MemoryCacheParams(i2, Integer.MAX_VALUE, i2, Integer.MAX_VALUE, Integer.MAX_VALUE);
        builder.setBitmapMemoryCacheParamsSupplier(new Supplier() { // from class: h.y.a.n.h
            @Override // com.facebook.common.internal.Supplier
            public final Object get() {
                MemoryCacheParams memoryCacheParams2 = MemoryCacheParams.this;
                c0.i(memoryCacheParams2);
                return memoryCacheParams2;
            }
        }).setMainDiskCacheConfig(DiskCacheConfig.newBuilder(context).setBaseDirectoryPath(context.getCacheDir()).setBaseDirectoryName(f26273a).setMaxCacheSize(41943040L).build());
    }

    private static void c(ImagePipelineConfig.Builder builder) {
        HashSet hashSet = new HashSet();
        hashSet.add(new RequestLoggingListener());
        builder.setRequestListeners(hashSet);
    }

    private static void d(ImagePipelineConfig.Builder builder) {
        builder.setDownsampleEnabled(true);
        builder.setCacheKeyFactory(new b());
    }

    public static i.a.b0<Bitmap> e(String str) {
        return i.a.b0.create(new a(str)).subscribeOn(i.a.f1.b.d());
    }

    public static File f(String str) {
        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(h.x.e.e.o.x(str));
        newBuilderWithSource.setLowestPermittedRequestLevel(ImageRequest.RequestLevel.DISK_CACHE);
        BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(b.a().getEncodedCacheKey(newBuilderWithSource.build(), null));
        if (resource != null) {
            return ((FileBinaryResource) resource).getFile();
        }
        return null;
    }

    private static ImagePipelineConfig g(Context context) {
        if (b == null) {
            ImagePipelineConfig.Builder newBuilder = OkHttpImagePipelineConfigFactory.newBuilder(context, h.y.a.m.m.d(context));
            b(newBuilder, context);
            c(newBuilder);
            d(newBuilder);
            b = newBuilder.build();
            NoOpMemoryTrimmableRegistry.getInstance().registerMemoryTrimmable(new MemoryTrimmable() { // from class: h.y.a.n.g
                @Override // com.facebook.common.memory.MemoryTrimmable
                public final void trim(MemoryTrimType memoryTrimType) {
                    c0.j(memoryTrimType);
                }
            });
        }
        return b;
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (Fresco.getImagePipeline().isInBitmapMemoryCache(Uri.parse(str))) {
            return true;
        }
        File f2 = f(str);
        return f2 != null && f2.exists();
    }

    public static /* synthetic */ MemoryCacheParams i(MemoryCacheParams memoryCacheParams) {
        return memoryCacheParams;
    }

    public static /* synthetic */ void j(MemoryTrimType memoryTrimType) {
        double suggestedTrimRatio = memoryTrimType.getSuggestedTrimRatio();
        if (MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
            ImagePipelineFactory.getInstance().getImagePipeline().clearMemoryCaches();
        }
    }
}

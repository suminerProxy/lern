package h.u.a.c.l0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.showstartfans.activity.model.Article;
import com.taihebase.activity.view.LoadImageView;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareImageUtil.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J2\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShareImageUtil;", "", "()V", "canvasBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "id", "", "createArticleImage", "", "bean", "Lcom/showstartfans/activity/model/Article;", h.a.a.a.a.i.g.C, "onPath", "Lkotlin/Function1;", "", "createArticleView", "Landroid/view/View;", "getCacheBitmapFromView", "view", "setParentViewPhoto", "", "postUrl", "img", "Lcom/taihebase/activity/view/LoadImageView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final v3 f19522a = null;

    /* compiled from: ShareImageUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.profile.ShareImageUtil$createArticleImage$1", f = "ShareImageUtil.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function1<String, Unit> $onPath;
        public final /* synthetic */ int $position;
        public int label;

        /* compiled from: ShareImageUtil.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.showstartfans.activity.activitys.profile.ShareImageUtil$createArticleImage$1$1", f = "ShareImageUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: h.u.a.c.l0.v3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0345a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $filePath;
            public final /* synthetic */ Function1<String, Unit> $onPath;
            public int label;

            public C0345a(Function1<? super String, Unit> function1, String str, Continuation<? super C0345a> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        public a(Context context, Article article, int i2, Function1<? super String, Unit> function1, Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: ShareImageUtil.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/ShareImageUtil$createArticleView$5", "Lcom/taihebase/activity/listener/OnGetBitmapListenerCall;", "onFailure_", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onSuccess_", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends h.y.a.k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f19523a;
        public final /* synthetic */ CountDownLatch b;

        public b(ImageView imageView, CountDownLatch countDownLatch) {
        }

        @Override // h.y.a.k.d
        public void a(@Nullable DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // h.y.a.k.d
        public void b(@Nullable Bitmap bitmap) {
        }
    }

    /* compiled from: ShareImageUtil.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/ShareImageUtil$createArticleView$6", "Lcom/taihebase/activity/listener/OnGetBitmapListenerCall;", "onFailure_", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onSuccess_", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends h.y.a.k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19524a;
        public final /* synthetic */ LoadImageView b;
        public final /* synthetic */ CountDownLatch c;

        public c(Context context, LoadImageView loadImageView, CountDownLatch countDownLatch) {
        }

        @Override // h.y.a.k.d
        public void a(@Nullable DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // h.y.a.k.d
        public void b(@Nullable Bitmap bitmap) {
        }
    }

    private v3() {
    }

    public static final /* synthetic */ View a(v3 v3Var, Context context, Article article, int i2) {
    }

    public static final /* synthetic */ Bitmap b(v3 v3Var, View view) {
    }

    private final Bitmap c(Context context, int i2) {
    }

    private final View e(Context context, Article article, int i2) {
    }

    private final Bitmap f(View view) {
    }

    private final boolean g(Context context, String str, LoadImageView loadImageView) {
    }

    public final void d(@NotNull Context context, @NotNull Article article, int i2, @NotNull Function1<? super String, Unit> function1) {
    }
}

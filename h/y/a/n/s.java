package h.y.a.n;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.palette.graphics.Palette;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BGColorUtil.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2<\u0010\u000b\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¨\u0006\u0012"}, d2 = {"Lcom/taihebase/activity/utils/BGColorUtil;", "", "()V", "getBit", "", "context", "Landroid/content/Context;", "url", "", "normalColor", "", "callBac", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "colorRes", "Landroidx/palette/graphics/Palette;", "palette", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class s {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final s f26360a = null;

    /* compiled from: BGColorUtil.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0014J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, d2 = {"com/taihebase/activity/utils/BGColorUtil$getBit$1$1", "Lcom/facebook/imagepipeline/datasource/BaseBitmapDataSubscriber;", "onFailureImpl", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onNewResultImpl", "bitmap", "Landroid/graphics/Bitmap;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends BaseBitmapDataSubscriber {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26361a;
        public final /* synthetic */ Function2<Integer, Palette, Unit> b;

        public a(int i2, Function2<? super Integer, ? super Palette, Unit> function2) {
        }

        public static /* synthetic */ void a(Function2 function2, int i2) {
        }

        public static /* synthetic */ void b(Function2 function2, int i2, Palette palette) {
        }

        public static /* synthetic */ void c(int i2, Function2 function2, Palette palette) {
        }

        public static /* synthetic */ void d(Function2 function2, int i2) {
        }

        private static final void e(Function2 function2, int i2) {
        }

        private static final void f(int i2, Function2 function2, Palette palette) {
        }

        private static final void g(Function2 function2, int i2, Palette palette) {
        }

        private static final void h(Function2 function2, int i2) {
        }

        @Override // com.facebook.datasource.BaseDataSubscriber
        public void onFailureImpl(@NotNull DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
        public void onNewResultImpl(@Nullable Bitmap bitmap) {
        }
    }

    private s() {
    }

    private static final void b(String str, Context context, int i2, Function2 function2) {
    }

    private static final void c(Function2 function2, int i2) {
    }

    public static /* synthetic */ void d(String str, Context context, int i2, Function2 function2) {
    }

    public static /* synthetic */ void e(Function2 function2, int i2) {
    }

    public final void a(@Nullable Context context, @Nullable String str, int i2, @Nullable Function2<? super Integer, ? super Palette, Unit> function2) {
    }
}

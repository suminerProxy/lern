package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.PhotoTagBean;
import com.showstartfans.activity.model.TagPhotoBean;
import com.sobot.network.http.model.SobotProgress;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticlePhotoView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/view/ArticlePhotoView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutTagParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mData", "Lcom/showstartfans/activity/model/TagPhotoBean;", "photo_item", "Lcom/facebook/drawee/view/SimpleDraweeView;", "viewHeight", "viewWidth", "widthDP", "getWidthDP", "()I", "widthDP$delegate", "Lkotlin/Lazy;", "checkSize", "", "checkTagPos", "createTagView", SobotProgress.TAG, "Lcom/showstartfans/activity/model/PhotoTagBean;", "setData", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArticlePhotoView extends RelativeLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Lazy c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f6594d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TagPhotoBean f6595e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ConstraintLayout f6596f;

    /* renamed from: g  reason: collision with root package name */
    private int f6597g;

    /* renamed from: h  reason: collision with root package name */
    private int f6598h;

    /* compiled from: ArticlePhotoView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<Integer> {
        public final /* synthetic */ ArticlePhotoView this$0;

        public a(ArticlePhotoView articlePhotoView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    public ArticlePhotoView(@NotNull Context context) {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e(PhotoTagBean photoTagBean) {
    }

    private static final void f(View view, double d2, int i2, int i3, int i4, int i5) {
    }

    private static final void g(ArticlePhotoView articlePhotoView, PhotoTagBean photoTagBean, View view) {
    }

    private final int getWidthDP() {
    }

    public static /* synthetic */ void h(View view, double d2, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void i(ArticlePhotoView articlePhotoView, PhotoTagBean photoTagBean, View view) {
    }

    public static /* synthetic */ void j(ArticlePhotoView articlePhotoView, ArrayList arrayList) {
    }

    private static final void k(ArticlePhotoView articlePhotoView, ArrayList arrayList) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void setData(@Nullable TagPhotoBean tagPhotoBean) {
    }

    public ArticlePhotoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ArticlePhotoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

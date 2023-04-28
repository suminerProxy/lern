package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.palette.graphics.Palette;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.UserInfoBean;
import com.taihebase.activity.view.RatioLayout;
import h.y.a.m.n;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FansCardView.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ?\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"2+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001c\u0018\u00010$j\u0004\u0018\u0001`)H\u0002J\u0012\u0010*\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010+\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010\"R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/view/FansCardView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DesingWidth_ID", "iv_qrCode", "Landroid/widget/ImageView;", "layout_draw", "Landroid/view/ViewGroup;", "layout_main", "Lcom/taihebase/activity/view/RatioLayout;", "sdv_user_header", "Lcom/facebook/drawee/view/SimpleDraweeView;", "tv_Big", "Landroid/widget/TextView;", "tv_last_show", "tv_name_id", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "user_bg_image", "SaveToFile", "", "getData", "getImageFile", "Ljava/io/File;", "getUserHomePagerInfo", "UserId", "", "call", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/UserInfoBean;", "Lkotlin/ParameterName;", "name", "bean", "Lcom/showstartfans/activity/view/CallBack;", "initData", "setData", "userID", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class FansCardView extends RelativeLayout {
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private RatioLayout f6667d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f6668e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private SimpleDraweeView f6669f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TextView f6670g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TextView f6671h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private SimpleDraweeView f6672i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private ImageView f6673j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f6674k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private UserLevelView f6675l;

    /* compiled from: FansCardView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "colorRes", "", "palette", "Landroidx/palette/graphics/Palette;", "invoke", "(Ljava/lang/Integer;Landroidx/palette/graphics/Palette;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function2<Integer, Palette, Unit> {
        public final /* synthetic */ FansCardView this$0;

        public a(FansCardView fansCardView) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Palette palette) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num, @Nullable Palette palette) {
        }
    }

    /* compiled from: FansCardView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<UserInfoBean, Unit> {
        public final /* synthetic */ FansCardView this$0;

        public b(FansCardView fansCardView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInfoBean userInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserInfoBean userInfoBean) {
        }
    }

    public FansCardView(@NotNull Context context) {
    }

    public static final /* synthetic */ ViewGroup d(FansCardView fansCardView) {
    }

    public static final /* synthetic */ void e(FansCardView fansCardView, UserInfoBean userInfoBean) {
    }

    private static final void f(FansCardView fansCardView, n nVar) {
    }

    private final void g(String str, Function1<? super UserInfoBean, Unit> function1) {
    }

    private final void getData() {
    }

    private static final void h(FansCardView fansCardView, Function1 function1, n nVar) {
    }

    private final void i(UserInfoBean userInfoBean) {
    }

    public static /* synthetic */ void j(FansCardView fansCardView, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void k(FansCardView fansCardView, n nVar) {
    }

    public final void a() {
    }

    public void b() {
    }

    @Nullable
    public View c(int i2) {
    }

    @Nullable
    public final File getImageFile() {
    }

    public final void setData(@Nullable String str) {
    }

    public FansCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public FansCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.HotelBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ItemHotelStrategy_01.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/showstartfans/activity/view/ItemHotelStrategy_01;", "Lcom/showstartfans/activity/view/BaseItemHotelStrategy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowAlled", "", "layoutStart", "Landroid/widget/LinearLayout;", "maxIntroduceViewHeight", "tvInfo", "Landroid/widget/TextView;", "tvIntroduce", "tvIntroduceHeight", "getTvIntroduceHeight", "()I", "tvIntroduceHeight$delegate", "Lkotlin/Lazy;", "tvShowALL", "tvStart", "tv_title", "tv_userScore", "vWhiteOver", "Landroid/view/View;", "setData", "", "data", "Lcom/showstartfans/activity/model/HotelBean;", "setIntroduceViewHeight", AnimatedPasterJsonConfig.CONFIG_HEIGHT, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ItemHotelStrategy_01 extends BaseItemHotelStrategy {
    @NotNull
    public Map<Integer, View> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f6802d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f6803e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TextView f6804f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f6805g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TextView f6806h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private TextView f6807i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f6808j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private TextView f6809k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private View f6810l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6811m;

    /* renamed from: n  reason: collision with root package name */
    private int f6812n;

    /* compiled from: ItemHotelStrategy_01.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<TextView, Unit> {
        public final /* synthetic */ ItemHotelStrategy_01 this$0;

        public a(ItemHotelStrategy_01 itemHotelStrategy_01) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextView textView) {
        }
    }

    /* compiled from: ItemHotelStrategy_01.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ ItemHotelStrategy_01 this$0;

        public b(ItemHotelStrategy_01 itemHotelStrategy_01) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public ItemHotelStrategy_01(@NotNull Context context) {
    }

    private static final void c(ItemHotelStrategy_01 itemHotelStrategy_01, View view) {
    }

    public static final /* synthetic */ int d(ItemHotelStrategy_01 itemHotelStrategy_01) {
    }

    public static final /* synthetic */ TextView e(ItemHotelStrategy_01 itemHotelStrategy_01) {
    }

    public static final /* synthetic */ View f(ItemHotelStrategy_01 itemHotelStrategy_01) {
    }

    public static final /* synthetic */ void g(ItemHotelStrategy_01 itemHotelStrategy_01, int i2) {
    }

    private final int getTvIntroduceHeight() {
    }

    public static final /* synthetic */ void h(ItemHotelStrategy_01 itemHotelStrategy_01, int i2) {
    }

    public static /* synthetic */ void i(ItemHotelStrategy_01 itemHotelStrategy_01, View view) {
    }

    private final void setIntroduceViewHeight(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    public void a() {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    @Nullable
    public View b(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseItemHotelStrategy
    public void setData(@Nullable HotelBean hotelBean) {
    }

    public ItemHotelStrategy_01(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ItemHotelStrategy_01(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

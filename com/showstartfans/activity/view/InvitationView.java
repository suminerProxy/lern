package com.showstartfans.activity.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.ShareBean;
import com.showstartfans.activity.model.ShareMouldBean;
import com.showstartfans.activity.model.StyleBean;
import com.taihebase.activity.view.RatioLayout;
import h.u.a.d.s1;
import h.u.a.o.u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvitationView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\u0006\u0010+\u001a\u00020'J\u0010\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010\u0018J\u0010\u0010.\u001a\u00020'2\b\b\u0002\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020'R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/showstartfans/activity/view/InvitationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomHeight", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "layout_background", "Lcom/taihebase/activity/view/RatioLayout;", "layout_bottom", "layout_bottom_share", "Landroid/widget/LinearLayout;", "layout_change", "layout_parent", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "mData", "Lcom/showstartfans/activity/model/ShareMouldBean;", "rv_bottom_list", "Landroidx/recyclerview/widget/RecyclerView;", "shareDrawView", "Lcom/showstartfans/activity/view/InvitationShareView;", "sizeIsOK", "", "styleAdapter", "Lcom/showstartfans/activity/adapter/StyleAdapter;", "thisHeight", "tv_music_user_name", "Landroid/widget/TextView;", "v_share_view", "Lcom/showstartfans/activity/view/ShareView;", "changeContent", "", "doAnimal", "initBottomData", "initView", "playAnimal", "setData", "data", "setEditUI", "animal", "setShareUI", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class InvitationView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private MotionLayout c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private RatioLayout f6789d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private RatioLayout f6790e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private InvitationShareView f6791f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f6792g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private s1 f6793h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f6794i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private ShareView f6795j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f6796k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private TextView f6797l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private ShareMouldBean f6798m;

    /* renamed from: n  reason: collision with root package name */
    private int f6799n;

    /* renamed from: o  reason: collision with root package name */
    private int f6800o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6801p;
    private int q;

    /* compiled from: InvitationView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/view/InvitationView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<InvitationView, Unit> {
        public final /* synthetic */ InvitationView this$0;

        public a(InvitationView invitationView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvitationView invitationView) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InvitationView invitationView) {
        }
    }

    /* compiled from: InvitationView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u000028\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ \u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/InvitationView$initView$1", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Lcom/showstartfans/activity/model/StyleBean;", "bean", "", "Lcom/showstartfans/activity/adapter/OnCheckChangeListener;", "invoke", "(Ljava/lang/Integer;Lcom/showstartfans/activity/model/StyleBean;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function2<Integer, StyleBean, Unit> {
        public final /* synthetic */ InvitationView b;

        public b(InvitationView invitationView) {
        }

        public void a(@Nullable Integer num, @NotNull StyleBean styleBean) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, StyleBean styleBean) {
        }
    }

    /* compiled from: InvitationView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/ShareBean;", "invoke", "(Lcom/showstartfans/activity/model/ShareBean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<ShareBean, Boolean> {
        public final /* synthetic */ InvitationView this$0;

        public c(InvitationView invitationView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(ShareBean shareBean) {
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(@Nullable ShareBean shareBean) {
        }
    }

    /* compiled from: InvitationView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/NewShareBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<u, Unit> {
        public final /* synthetic */ InvitationView this$0;

        public d(InvitationView invitationView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable u uVar) {
        }
    }

    public InvitationView(@NotNull Context context) {
    }

    public static final /* synthetic */ int c(InvitationView invitationView) {
    }

    public static final /* synthetic */ RatioLayout d(InvitationView invitationView) {
    }

    public static final /* synthetic */ InvitationShareView e(InvitationView invitationView) {
    }

    public static final /* synthetic */ int f(InvitationView invitationView) {
    }

    public static final /* synthetic */ ShareView g(InvitationView invitationView) {
    }

    public static final /* synthetic */ void h(InvitationView invitationView, int i2) {
    }

    public static final /* synthetic */ void i(InvitationView invitationView, boolean z) {
    }

    public static final /* synthetic */ void j(InvitationView invitationView, int i2) {
    }

    private final void k() {
    }

    private final void l() {
    }

    private static final void m(InvitationView invitationView, ValueAnimator valueAnimator) {
    }

    private static final void n(InvitationView invitationView) {
    }

    private static final void o(InvitationView invitationView, ValueAnimator valueAnimator) {
    }

    private final void p() {
    }

    private final void q() {
    }

    private static final void r(InvitationView invitationView, View view) {
    }

    public static /* synthetic */ void s(InvitationView invitationView, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void t(InvitationView invitationView, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void u(InvitationView invitationView, View view) {
    }

    public static /* synthetic */ void v(InvitationView invitationView) {
    }

    public static /* synthetic */ void x(InvitationView invitationView, boolean z, int i2, Object obj) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void setData(@Nullable ShareMouldBean shareMouldBean) {
    }

    public final void setEditUI(boolean z) {
    }

    public final void w() {
    }

    public final void y() {
    }

    public InvitationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public InvitationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public InvitationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}

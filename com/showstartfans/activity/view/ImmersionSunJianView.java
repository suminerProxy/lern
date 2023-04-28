package com.showstartfans.activity.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.DyVideoView;
import com.showstartfans.activity.widget.AutoScrollRecyclerView;
import com.showstartfans.activity.widget.MomentAnimationTextView;
import com.taihebase.activity.view.LoadImageView;
import h.a.a.a.a.i.g;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImmersionSunJianView.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u000b)\u0018\u00002\u00020\u0001:\u0001UB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u00020;H\u0002J\u0012\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u001dH\u0016J\u0010\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001dH\u0002J\b\u0010F\u001a\u00020;H\u0016J\b\u0010G\u001a\u00020;H\u0016J\b\u0010H\u001a\u00020;H\u0016J\b\u0010I\u001a\u00020;H\u0016J\u0012\u0010J\u001a\u00020;2\b\u0010K\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010L\u001a\u00020;H\u0016J\u0010\u0010M\u001a\u00020;2\u0006\u0010E\u001a\u00020\u001dH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010K\u001a\u00020\u0018H\u0002J\u0010\u0010O\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010P\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010Q\u001a\u00020;2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0002\u0010A\u001a\u00020BH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/showstartfans/activity/view/ImmersionSunJianView;", "Lcom/showstartfans/activity/view/BaseImmersionView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationMoodReady", "Lcom/showstartfans/activity/view/ImmersionMoodAnimationView;", "animationMoodSend", "commentAdapter", "com/showstartfans/activity/view/ImmersionSunJianView$commentAdapter$2$1", "getCommentAdapter", "()Lcom/showstartfans/activity/view/ImmersionSunJianView$commentAdapter$2$1;", "commentAdapter$delegate", "Lkotlin/Lazy;", "commentDataSet", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "comments", "Lcom/showstartfans/activity/widget/AutoScrollRecyclerView;", "content", "Lcom/showstartfans/activity/widget/MomentAnimationTextView;", "data", "Lcom/showstartfans/activity/model/Article;", "dateDay", "Landroid/widget/TextView;", "dateMonth", "declareId", "", "emoji", "emojiContainer", "Landroid/view/View;", "emojiImage", "Lcom/taihebase/activity/view/LoadImageView;", "floor", "Landroid/widget/ImageView;", "good", "hand", "heart", "itemDecoration", "com/showstartfans/activity/view/ImmersionSunJianView$itemDecoration$2$1", "getItemDecoration", "()Lcom/showstartfans/activity/view/ImmersionSunJianView$itemDecoration$2$1;", "itemDecoration$delegate", "layout_main", "Landroidx/constraintlayout/widget/ConstraintLayout;", "moodNearest", "moodOne", "moodThree", "moodTwo", "player", "Lcom/showstartfans/activity/view/DyVideoView;", "poster", "posterBg", "rv_list_topic_sunjian", "Landroidx/recyclerview/widget/RecyclerView;", "se", "OnBindViewHolder_", "", g.C, "addDeclareList", "mood", "getCommentList", "getDeclareList", "isAnimator", "", "getLayoutId", "getRes", "type", "onActivityFinish", "onActivityPause", "onActivityResume", "onPageHide", "onReviewSuccess", "bean", "onSelected", "sendMood", "setTagView", "updateItem", "updateItemStatic", "updateMood", "list", "", "Lcom/showstartfans/activity/model/DeclareBean;", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImmersionSunJianView extends BaseImmersionView {
    @NotNull
    private RecyclerView A;
    @Nullable
    private Article B;
    @NotNull
    private final List<SceneDetailCommBean> C;
    private int D;
    @NotNull
    private final Lazy E;
    @NotNull
    private final Lazy F;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, View> f6746d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private LoadImageView f6747e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private LoadImageView f6748f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private DyVideoView f6749g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private View f6750h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private MomentAnimationTextView f6751i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private TextView f6752j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private TextView f6753k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private LoadImageView f6754l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private TextView f6755m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private TextView f6756n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private ImageView f6757o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private ImageView f6758p;
    @NotNull
    private ImageView q;
    @NotNull
    private ImageView r;
    @NotNull
    private ImageView s;
    @NotNull
    private ImageView t;
    @NotNull
    private ImageView u;
    @NotNull
    private ImageView v;
    @NotNull
    private AutoScrollRecyclerView w;
    @NotNull
    private ImmersionMoodAnimationView x;
    @NotNull
    private ImmersionMoodAnimationView y;
    @NotNull
    private ConstraintLayout z;

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ ImmersionSunJianView this$0;

        public a(ImmersionSunJianView immersionSunJianView) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/view/ImmersionSunJianView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vb", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "getVb", "()Landroidx/viewbinding/ViewBinding;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final ViewBinding f6759a;

        public b(@NotNull ViewBinding viewBinding) {
        }

        @NotNull
        public final ViewBinding c() {
        }
    }

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/view/ImmersionSunJianView$commentAdapter$2$1", "invoke", "()Lcom/showstartfans/activity/view/ImmersionSunJianView$commentAdapter$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<a> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ ImmersionSunJianView this$0;

        /* compiled from: ImmersionSunJianView.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"com/showstartfans/activity/view/ImmersionSunJianView$commentAdapter$2$1", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/showstartfans/activity/view/ImmersionSunJianView$ViewHolder;", "getItemCount", "", "getItemViewType", g.C, "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends RecyclerView.Adapter<b> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImmersionSunJianView f6760a;
            public final /* synthetic */ Context b;

            public a(ImmersionSunJianView immersionSunJianView, Context context) {
            }

            public void c(@NotNull b bVar, int i2) {
            }

            @NotNull
            public b d(@NotNull ViewGroup viewGroup, int i2) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemViewType(int i2) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public /* bridge */ /* synthetic */ void onBindViewHolder(b bVar, int i2) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public /* bridge */ /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            }
        }

        public c(ImmersionSunJianView immersionSunJianView, Context context) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
        }
    }

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ ImmersionSunJianView this$0;

        /* compiled from: ImmersionSunJianView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Long, Unit> {
            public final /* synthetic */ ImmersionSunJianView this$0;

            public a(ImmersionSunJianView immersionSunJianView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            }

            public final void invoke(long j2) {
            }
        }

        public d(ImmersionSunJianView immersionSunJianView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/view/ImmersionSunJianView$itemDecoration$2$1", "invoke", "()Lcom/showstartfans/activity/view/ImmersionSunJianView$itemDecoration$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<a> {
        public final /* synthetic */ Context $context;

        /* compiled from: ImmersionSunJianView.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/ImmersionSunJianView$itemDecoration$2$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends RecyclerView.ItemDecoration {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f6761a;

            public a(Context context) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            }
        }

        public e(Context context) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
        }
    }

    /* compiled from: ImmersionSunJianView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ImmersionSunJianView$updateItem$1", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "onPlayPrepared", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends DyVideoView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImmersionSunJianView f6762a;

        public f(ImmersionSunJianView immersionSunJianView) {
        }

        public static /* synthetic */ void i(ImmersionSunJianView immersionSunJianView, f fVar) {
        }

        private static final void j(ImmersionSunJianView immersionSunJianView, f fVar) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void e() {
        }
    }

    @JvmOverloads
    public ImmersionSunJianView(@NotNull Context context) {
    }

    public /* synthetic */ ImmersionSunJianView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static /* synthetic */ void A(ImmersionSunJianView immersionSunJianView, boolean z, int i2, Object obj) {
    }

    private static final void B(ImmersionSunJianView immersionSunJianView, boolean z, n nVar) {
    }

    private final int C(int i2) {
    }

    public static /* synthetic */ void D(ImmersionSunJianView immersionSunJianView, View view) {
    }

    public static /* synthetic */ void E(ImmersionSunJianView immersionSunJianView, n nVar) {
    }

    public static /* synthetic */ void F(ImmersionSunJianView immersionSunJianView, View view) {
    }

    public static /* synthetic */ void G(ImmersionSunJianView immersionSunJianView, View view) {
    }

    public static /* synthetic */ void H(View view) {
    }

    public static /* synthetic */ void I(ImmersionSunJianView immersionSunJianView, View view) {
    }

    public static /* synthetic */ void J(ImmersionSunJianView immersionSunJianView, boolean z, n nVar) {
    }

    public static /* synthetic */ void K(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private final void L(int i2) {
    }

    private final void M(Article article) {
    }

    private final void N(Article article) {
    }

    private static final void O(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private static final void P(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private static final void Q(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private static final void R(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private static final void S(ImmersionSunJianView immersionSunJianView, View view) {
    }

    private final void T(List<h.u.a.o.g> list, boolean z) {
    }

    public static /* synthetic */ void U(ImmersionSunJianView immersionSunJianView, List list, boolean z, int i2, Object obj) {
    }

    private static final void V(View view) {
    }

    private final c.a getCommentAdapter() {
    }

    private final void getCommentList() {
    }

    private final e.a getItemDecoration() {
    }

    public static final /* synthetic */ c.a s(ImmersionSunJianView immersionSunJianView) {
    }

    private final void setTagView(Article article) {
    }

    public static final /* synthetic */ List t(ImmersionSunJianView immersionSunJianView) {
    }

    public static final /* synthetic */ AutoScrollRecyclerView u(ImmersionSunJianView immersionSunJianView) {
    }

    public static final /* synthetic */ DyVideoView v(ImmersionSunJianView immersionSunJianView) {
    }

    public static final /* synthetic */ LoadImageView w(ImmersionSunJianView immersionSunJianView) {
    }

    private final void x(int i2) {
    }

    private static final void y(ImmersionSunJianView immersionSunJianView, n nVar) {
    }

    private final void z(boolean z) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void f(int i2, @Nullable Article article) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void g() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public int getLayoutId() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    @Nullable
    public View h(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void j() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void k() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void m() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void p() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void q(@Nullable SceneDetailCommBean sceneDetailCommBean) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void r() {
    }

    @JvmOverloads
    public ImmersionSunJianView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}

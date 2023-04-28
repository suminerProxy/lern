package com.showstartfans.activity.activitys.hotel;

import android.content.Context;
import android.view.View;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelRoomBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.a.a.a.a.i.g;
import h.u.a.d.a1;
import h.u.a.g.a2;
import h.y.a.f.i;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelStrategyActivity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelStrategyActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/adapter/HotelStrategyDetaillAdapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/HotelStrategyDetaillAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelStrategyBinding;", "mData", "Lcom/showstartfans/activity/model/HotelBean;", "mRoomDataList", "", "Lcom/showstartfans/activity/model/HotelRoomBean;", "OnTabChange", "", "checkedId", "", "finish", "initData", "data", "initListener", "initView", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "InvisoblePagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelStrategyActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5708g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static Function0<Unit> f5709h;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Lazy c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private HotelBean f5710d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<HotelRoomBean> f5711e;

    /* renamed from: f  reason: collision with root package name */
    private a2 f5712f;

    /* compiled from: HotelStrategyActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelStrategyActivity$Companion;", "", "()V", "onClickShowRoom", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/activitys/hotel/OnClickShowRoom;", "getOnClickShowRoom", "()Lkotlin/jvm/functions/Function0;", "setOnClickShowRoom", "(Lkotlin/jvm/functions/Function0;)V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "ctx", "Landroid/content/Context;", "data", "Lcom/showstartfans/activity/model/HotelBean;", "roomData", "", "Lcom/showstartfans/activity/model/HotelRoomBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final Function0<Unit> a() {
        }

        public final void b(@NotNull Context context, @Nullable HotelBean hotelBean, @Nullable List<HotelRoomBean> list, @Nullable Function0<Unit> function0) {
        }

        public final void c(@Nullable Function0<Unit> function0) {
        }
    }

    /* compiled from: HotelStrategyActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelStrategyActivity$InvisoblePagerAdapter;", "Lcom/taihebase/activity/base/BasePagerAdapter;", "", "context", "Landroid/content/Context;", "(Lcom/showstartfans/activity/activitys/hotel/HotelStrategyActivity;Landroid/content/Context;)V", "getCount", "", "onCreateView", "Landroid/view/View;", g.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends i<String> {
        public final /* synthetic */ HotelStrategyActivity c;

        public b(@Nullable HotelStrategyActivity hotelStrategyActivity, Context context) {
        }

        @Override // h.y.a.f.i, androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // h.y.a.f.i
        @NotNull
        public View h(int i2) {
        }
    }

    /* compiled from: HotelStrategyActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelStrategyDetaillAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<a1> {
        public final /* synthetic */ HotelStrategyActivity this$0;

        public c(HotelStrategyActivity hotelStrategyActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a1 invoke() {
        }
    }

    /* compiled from: HotelStrategyActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelStrategyActivity$initListener$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "isTouch", "", "()Z", "setTouch", "(Z)V", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5713a;
        public final /* synthetic */ HotelStrategyActivity b;

        public d(HotelStrategyActivity hotelStrategyActivity) {
        }

        public final boolean a() {
        }

        public final void b(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static final /* synthetic */ Function0 A() {
    }

    public static final /* synthetic */ void B(Function0 function0) {
    }

    private final a1 C() {
    }

    private final void D(HotelBean hotelBean) {
    }

    private static final void E(HotelStrategyActivity hotelStrategyActivity, View view) {
    }

    private static final void F(HotelStrategyActivity hotelStrategyActivity, RadioGroup radioGroup, int i2) {
    }

    public static /* synthetic */ void G(HotelStrategyActivity hotelStrategyActivity, View view) {
    }

    public static /* synthetic */ void H(HotelStrategyActivity hotelStrategyActivity, RadioGroup radioGroup, int i2) {
    }

    private final void w(int i2) {
    }

    public static final /* synthetic */ a1 x(HotelStrategyActivity hotelStrategyActivity) {
    }

    public static final /* synthetic */ a2 y(HotelStrategyActivity hotelStrategyActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(HotelStrategyActivity hotelStrategyActivity) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // android.app.Activity
    public void finish() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}

package com.showstartfans.activity.activitys.group;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapController;
import com.taihebase.activity.base.BaseNewActivity;
import h.a.a.a.a.i.g;
import h.u.a.g.f1;
import h.u.a.g.zd;
import h.y.a.f.m;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupSensitiveWordActivity.kt */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupSensitiveWordActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "com/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$adapter$2$1", "getAdapter", "()Lcom/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityGroupManagerNewBinding;", "groupId", "", "initData", "", "initListener", "initView", "onResume", "removeSensitiveWord", "word", "requestData", "setContentViewResByViewBind", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupSensitiveWordActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f5637f = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private f1 f5638d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f5639e;

    /* compiled from: GroupSensitiveWordActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "groupId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context, @NotNull String str) {
        }
    }

    /* compiled from: GroupSensitiveWordActivity.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$adapter$2$1", "invoke", "()Lcom/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$adapter$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<a> {
        public final /* synthetic */ GroupSensitiveWordActivity this$0;

        /* compiled from: GroupSensitiveWordActivity.kt */
        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002J*\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¨\u0006\u0013"}, d2 = {"com/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$adapter$2$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "bindHolderItem", "", g.C, "", MapController.ITEM_LAYER_TAG, "itemBinding", "Lcom/showstartfans/activity/databinding/ItemGroupSensitiveWordBinding;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends m<String> {

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ GroupSensitiveWordActivity f5640n;

            public a(GroupSensitiveWordActivity groupSensitiveWordActivity) {
            }

            private final void Q(int i2, String str, zd zdVar) {
            }

            private static final void R(GroupSensitiveWordActivity groupSensitiveWordActivity, String str, View view) {
            }

            public static /* synthetic */ void S(GroupSensitiveWordActivity groupSensitiveWordActivity, String str, View view) {
            }

            @Override // h.y.a.f.m
            @NotNull
            public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
            }

            @Override // h.y.a.f.m
            public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
            }
        }

        public b(GroupSensitiveWordActivity groupSensitiveWordActivity) {
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

    /* compiled from: GroupSensitiveWordActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/group/GroupSensitiveWordActivity$initView$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GroupSensitiveWordActivity f5641a;

        public c(GroupSensitiveWordActivity groupSensitiveWordActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        }
    }

    public static /* synthetic */ void A(GroupSensitiveWordActivity groupSensitiveWordActivity, n nVar) {
    }

    public static /* synthetic */ void B(GroupSensitiveWordActivity groupSensitiveWordActivity, n nVar) {
    }

    private final void C(String str) {
    }

    private static final void D(GroupSensitiveWordActivity groupSensitiveWordActivity, n nVar) {
    }

    private final void E() {
    }

    private static final void F(GroupSensitiveWordActivity groupSensitiveWordActivity, n nVar) {
    }

    @JvmStatic
    public static final void H(@NotNull Context context, @NotNull String str) {
    }

    public static final /* synthetic */ void w(GroupSensitiveWordActivity groupSensitiveWordActivity, String str) {
    }

    private final b.a x() {
    }

    private static final void y(GroupSensitiveWordActivity groupSensitiveWordActivity, View view) {
    }

    public static /* synthetic */ void z(GroupSensitiveWordActivity groupSensitiveWordActivity, View view) {
    }

    @NotNull
    public ConstraintLayout G() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public /* bridge */ /* synthetic */ View setContentViewResByViewBind() {
    }
}

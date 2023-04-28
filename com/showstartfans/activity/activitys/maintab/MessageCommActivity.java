package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.MessageUnreadBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.a.a.a.a.i.g;
import h.u.a.g.m2;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MessageCommActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/MessageCommActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityMessageCommBinding;", "fragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "mUnreadData", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "initData", "", "unreadBean", "initListener", "initView", "msgOffset", "onResume", "requestUnread", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MessageCommActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f5822f = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private MessageUnreadBean c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<Fragment> f5823d;

    /* renamed from: e  reason: collision with root package name */
    private m2 f5824e;

    /* compiled from: MessageCommActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/MessageCommActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "data", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void b(a aVar, Context context, int i2, MessageUnreadBean messageUnreadBean, int i3, Object obj) {
        }

        public final void a(@NotNull Context context, int i2, @Nullable MessageUnreadBean messageUnreadBean) {
        }
    }

    /* compiled from: MessageCommActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/MessageCommActivity$initListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ MessageCommActivity b;

        public b(MessageCommActivity messageCommActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    public static /* synthetic */ void A(MessageCommActivity messageCommActivity) {
    }

    public static /* synthetic */ void B(MessageCommActivity messageCommActivity, n nVar) {
    }

    private final void C() {
    }

    private final void D() {
    }

    private static final void E(MessageCommActivity messageCommActivity, n nVar) {
    }

    public static final /* synthetic */ m2 w(MessageCommActivity messageCommActivity) {
    }

    public static final /* synthetic */ ArrayList x(MessageCommActivity messageCommActivity) {
    }

    private final void y(MessageUnreadBean messageUnreadBean) {
    }

    private static final void z(MessageCommActivity messageCommActivity) {
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
    @NotNull
    public View setContentViewResByViewBind() {
    }
}

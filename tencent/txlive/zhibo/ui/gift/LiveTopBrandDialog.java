package tencent.txlive.zhibo.ui.gift;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.LiveTopGoodsClaBean;
import com.showstartfans.activity.model.LiveTopUserBean;
import com.taihebase.activity.widget.RecycleEmptyView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.adapter.LiveTopClaAdapter;
import tencent.txlive.zhibo.adapter.LiveTopManAdapter;

/* compiled from: LiveTopBrandDialog.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020'2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002J\u0010\u0010/\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveTopBrandDialog;", "Landroid/widget/PopupWindow;", "Ltencent/txlive/zhibo/adapter/LiveTopClaAdapter$OnClaClickCall;", "context", "Landroid/content/Context;", TUIConstants.TUILive.ROOM_ID, "", "liveEventId", "liveThemeId", "fragmetM", "Landroidx/fragment/app/FragmentManager;", "showGift", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Z)V", "bottomP", "Landroid/widget/LinearLayout;", "giftIcon", "Landroid/widget/ImageView;", "mAdapter", "Ltencent/txlive/zhibo/adapter/LiveTopClaAdapter;", "getMAdapter", "()Ltencent/txlive/zhibo/adapter/LiveTopClaAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBottomMsg", "Landroid/widget/TextView;", "mTopLiveUserAdapter", "Ltencent/txlive/zhibo/adapter/LiveTopManAdapter;", "getMTopLiveUserAdapter", "()Ltencent/txlive/zhibo/adapter/LiveTopManAdapter;", "mTopLiveUserAdapter$delegate", "pushUserId", "topBrand", "Lcom/taihebase/activity/widget/RecycleEmptyView;", "topCla", "Landroidx/recyclerview/widget/RecyclerView;", "toppp", "Landroid/widget/FrameLayout;", "initData", "", "onSelectCla", "bean", "Lcom/showstartfans/activity/model/LiveTopGoodsClaBean;", "setMsgNum", "myRank", "", "Lcom/showstartfans/activity/model/LiveTopUserBean;", "show", "view", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveTopBrandDialog extends PopupWindow implements LiveTopClaAdapter.OnClaClickCall {
    @NotNull
    private LinearLayout bottomP;
    @Nullable
    private Context context;
    @NotNull
    private ImageView giftIcon;
    @NotNull
    private String liveEventId;
    @NotNull
    private String liveThemeId;
    @NotNull
    private final Lazy mAdapter$delegate;
    @NotNull
    private TextView mBottomMsg;
    @NotNull
    private final Lazy mTopLiveUserAdapter$delegate;
    @NotNull
    private String pushUserId;
    @NotNull
    private RecycleEmptyView topBrand;
    @NotNull
    private RecyclerView topCla;
    @NotNull
    private FrameLayout toppp;

    public LiveTopBrandDialog(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull FragmentManager fragmentManager, boolean z) {
    }

    /* renamed from: _init_$lambda-0  reason: not valid java name */
    private static final void m1748_init_$lambda0(LiveTopBrandDialog liveTopBrandDialog, View view) {
    }

    public static /* synthetic */ void a(LiveTopBrandDialog liveTopBrandDialog, View view) {
    }

    public static final /* synthetic */ Context access$getContext$p(LiveTopBrandDialog liveTopBrandDialog) {
    }

    public static final /* synthetic */ LiveTopClaAdapter access$getMAdapter(LiveTopBrandDialog liveTopBrandDialog) {
    }

    public static final /* synthetic */ TextView access$getMBottomMsg$p(LiveTopBrandDialog liveTopBrandDialog) {
    }

    public static final /* synthetic */ LiveTopManAdapter access$getMTopLiveUserAdapter(LiveTopBrandDialog liveTopBrandDialog) {
    }

    public static final /* synthetic */ RecycleEmptyView access$getTopBrand$p(LiveTopBrandDialog liveTopBrandDialog) {
    }

    public static final /* synthetic */ void access$setMsgNum(LiveTopBrandDialog liveTopBrandDialog, List list) {
    }

    private final LiveTopClaAdapter getMAdapter() {
    }

    private final LiveTopManAdapter getMTopLiveUserAdapter() {
    }

    private final void setMsgNum(List<? extends LiveTopUserBean> list) {
    }

    public final void initData(@NotNull FragmentManager fragmentManager, boolean z) {
    }

    @Override // tencent.txlive.zhibo.adapter.LiveTopClaAdapter.OnClaClickCall
    public void onSelectCla(@Nullable LiveTopGoodsClaBean liveTopGoodsClaBean) {
    }

    public final void show(@Nullable View view) {
    }
}

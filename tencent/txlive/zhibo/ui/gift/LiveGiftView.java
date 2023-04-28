package tencent.txlive.zhibo.ui.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.GoodsLiveBean;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.u.a.w.d0.d2;
import h.y.a.o.v;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.ui.gift.LiveGiftAdapter;

/* compiled from: LiveGiftView.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB#\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u0004\u0018\u00010\u0013J\b\u0010-\u001a\u00020*H\u0002J\u0006\u0010.\u001a\u00020\u000fJ\b\u0010/\u001a\u00020*H\u0002J\u0012\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020*2\b\u00104\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u00105\u001a\u00020*H\u0016J\u0012\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u00108\u001a\u00020*2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020\u0015J\u0012\u0010;\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020*J(\u0010@\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u00010>2\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveGiftView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "Ltencent/txlive/zhibo/ui/gift/LiveGiftAdapter$OnGiftSelectCall;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aliPay", "", "callback", "Lcom/taihebase/activity/view/SlidedownView$onLifecallBack;", "currentSendGift", "Lcom/showstartfans/activity/model/GoodsLiveBean;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "giftList", "Landroidx/recyclerview/widget/RecyclerView;", "liveThemeId", "", "mAdapter", "Ltencent/txlive/zhibo/ui/gift/LiveGiftAdapter;", "mLiveEventId", "mRoomId", "mTitle", "Landroid/widget/TextView;", "payIcon", "Landroid/widget/ImageView;", "payP", "payWay", "sendGift", "sendGiftNum", "slideView", "Lcom/taihebase/activity/view/SlidedownView;", "totlePrice", "checkDataAgain", "", "dissSelect", "getCurrentSendGift", "hideSelect", "ifShowAndHide", "initData", "onClick", "view", "Landroid/view/View;", "onDanmuInputCall", "inputStr", "onDanmuInputDismiss", "onGiftSelectCall", "bean", "setCallBack", "setFragmentMan", "manager", "setSelectGoodsUI", "setTargetContainer", "target", "Landroid/view/ViewGroup;", "showPreview", "toggleView", TUIConstants.TUILive.ROOM_ID, "liveEventId", "mLiveThemeId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveGiftView extends LinearLayout implements View.OnClickListener, d2, LiveGiftAdapter.OnGiftSelectCall {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean aliPay;
    @Nullable
    private v.c callback;
    @Nullable
    private GoodsLiveBean currentSendGift;
    @Nullable
    private FragmentManager fragmentManager;
    @NotNull
    private RecyclerView giftList;
    @NotNull
    private String liveThemeId;
    @NotNull
    private LiveGiftAdapter mAdapter;
    @NotNull
    private String mLiveEventId;
    @NotNull
    private String mRoomId;
    @NotNull
    private TextView mTitle;
    @Nullable
    private ImageView payIcon;
    @NotNull
    private LinearLayout payP;
    @NotNull
    private TextView payWay;
    @NotNull
    private TextView sendGift;
    @NotNull
    private TextView sendGiftNum;
    @Nullable
    private v slideView;
    @NotNull
    private TextView totlePrice;

    public LiveGiftView(@Nullable Context context) {
    }

    public static /* synthetic */ void a(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ void access$checkDataAgain(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ void access$dissSelect(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ boolean access$getAliPay$p(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ v.c access$getCallback$p(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ LiveGiftAdapter access$getMAdapter$p(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ TextView access$getSendGiftNum$p(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ v access$getSlideView$p(LiveGiftView liveGiftView) {
    }

    public static final /* synthetic */ void access$setSelectGoodsUI(LiveGiftView liveGiftView, GoodsLiveBean goodsLiveBean) {
    }

    private final void checkDataAgain() {
    }

    private final void dissSelect() {
    }

    private final void hideSelect() {
    }

    private final void initData() {
    }

    private final void setSelectGoodsUI(GoodsLiveBean goodsLiveBean) {
    }

    /* renamed from: toggleView$lambda-1  reason: not valid java name */
    private static final void m1743toggleView$lambda1(LiveGiftView liveGiftView) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Nullable
    public final GoodsLiveBean getCurrentSendGift() {
    }

    public final boolean ifShowAndHide() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
    }

    @Override // h.u.a.w.d0.d2
    public void onDanmuInputCall(@Nullable String str) {
    }

    @Override // h.u.a.w.d0.d2
    public void onDanmuInputDismiss() {
    }

    @Override // tencent.txlive.zhibo.ui.gift.LiveGiftAdapter.OnGiftSelectCall
    public void onGiftSelectCall(@Nullable GoodsLiveBean goodsLiveBean) {
    }

    public final void setCallBack(@Nullable v.c cVar) {
    }

    public final void setFragmentMan(@NotNull FragmentManager fragmentManager) {
    }

    public final void setTargetContainer(@NotNull ViewGroup viewGroup) {
    }

    public final void showPreview() {
    }

    public final void toggleView(@Nullable ViewGroup viewGroup, @NotNull String str, @NotNull String str2, @NotNull String str3) {
    }

    public LiveGiftView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public LiveGiftView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

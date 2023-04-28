package tencent.txlive.zhibo.ui.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.msg.TCChatEntity;

/* compiled from: LiveListGiftView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010.\u001a\u00020\tH\u0002J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\u000e\u00102\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000eJ\b\u00104\u001a\u00020,H\u0002J\u000e\u00105\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000eJ\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020\u001fH\u0002J\b\u00108\u001a\u00020,H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveListGiftView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "childView", "Landroid/view/View;", "currentEntity", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "currentGiftNum", "desc", "Landroid/widget/TextView;", "displayDoneListener", "Ltencent/txlive/zhibo/ui/gift/LiveListGiftView$OnViewDisplayDoneListener;", "getDisplayDoneListener", "()Ltencent/txlive/zhibo/ui/gift/LiveListGiftView$OnViewDisplayDoneListener;", "setDisplayDoneListener", "(Ltencent/txlive/zhibo/ui/gift/LiveListGiftView$OnViewDisplayDoneListener;)V", "displayTime", "", "gifNum", "gitfNumCheckTime", "goodsIcon", "Lcom/facebook/drawee/view/SimpleDraweeView;", "haveNewGift", "", "getHaveNewGift", "()Z", "isInLastAnimation", "lastDiplayGiftNum", "pos", "getPos", "()I", "setPos", "(I)V", "userHead", Oauth2AccessToken.KEY_SCREEN_NAME, "addSendGiftText", "", "entity", "newNum", "continueAnimation", "finnalRunOut", "giftAnimation", "isSameGift", "justChangeNum", "runOutAnimation", "setDisplayData", "shakeGiftNum", "showAnimatAdd", "startRunInAnimation", "OnViewDisplayDoneListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveListGiftView extends LinearLayout {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @NotNull
    private final View childView;
    @Nullable
    private TCChatEntity currentEntity;
    private int currentGiftNum;
    @NotNull
    private final TextView desc;
    @Nullable
    private OnViewDisplayDoneListener displayDoneListener;
    private final long displayTime;
    @NotNull
    private final TextView gifNum;
    private final long gitfNumCheckTime;
    @NotNull
    private final SimpleDraweeView goodsIcon;
    private boolean isInLastAnimation;
    private int lastDiplayGiftNum;
    private int pos;
    @NotNull
    private final SimpleDraweeView userHead;
    @NotNull
    private final TextView userName;

    /* compiled from: LiveListGiftView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveListGiftView$OnViewDisplayDoneListener;", "", "onDisplayDone", "", "pos", "", "onDisplayDoneStart", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnViewDisplayDoneListener {
        void onDisplayDone(int i2);

        boolean onDisplayDoneStart();
    }

    public LiveListGiftView(@NotNull Context context) {
    }

    public static /* synthetic */ void a(LiveListGiftView liveListGiftView) {
    }

    public static final /* synthetic */ TCChatEntity access$getCurrentEntity$p(LiveListGiftView liveListGiftView) {
    }

    public static final /* synthetic */ void access$giftAnimation(LiveListGiftView liveListGiftView) {
    }

    public static final /* synthetic */ void access$setCurrentEntity$p(LiveListGiftView liveListGiftView, TCChatEntity tCChatEntity) {
    }

    public static final /* synthetic */ void access$setInLastAnimation$p(LiveListGiftView liveListGiftView, boolean z) {
    }

    public static final /* synthetic */ void access$shakeGiftNum(LiveListGiftView liveListGiftView) {
    }

    public static final /* synthetic */ boolean access$showAnimatAdd(LiveListGiftView liveListGiftView) {
    }

    private final void addSendGiftText(TCChatEntity tCChatEntity, int i2) {
    }

    public static /* synthetic */ void addSendGiftText$default(LiveListGiftView liveListGiftView, TCChatEntity tCChatEntity, int i2, int i3, Object obj) {
    }

    public static /* synthetic */ void b(View view) {
    }

    public static /* synthetic */ void c(LiveListGiftView liveListGiftView) {
    }

    private final void continueAnimation() {
    }

    private final void finnalRunOut() {
    }

    /* renamed from: finnalRunOut$lambda-3  reason: not valid java name */
    private static final void m1745finnalRunOut$lambda3(LiveListGiftView liveListGiftView) {
    }

    private final boolean getHaveNewGift() {
    }

    private final void giftAnimation() {
    }

    private final void runOutAnimation() {
    }

    /* renamed from: setDisplayData$lambda-0  reason: not valid java name */
    private static final void m1746setDisplayData$lambda0(View view) {
    }

    private final void shakeGiftNum() {
    }

    private final boolean showAnimatAdd() {
    }

    /* renamed from: showAnimatAdd$lambda-2  reason: not valid java name */
    private static final void m1747showAnimatAdd$lambda2(LiveListGiftView liveListGiftView) {
    }

    private final void startRunInAnimation() {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Nullable
    public final OnViewDisplayDoneListener getDisplayDoneListener() {
    }

    public final int getPos() {
    }

    public final boolean isSameGift(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void justChangeNum(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void setDisplayData(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void setDisplayDoneListener(@Nullable OnViewDisplayDoneListener onViewDisplayDoneListener) {
    }

    public final void setPos(int i2) {
    }

    public LiveListGiftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public LiveListGiftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

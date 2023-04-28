package tencent.txlive.zhibo.ui.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import h.a.a.a.a.i.g;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.util.LinkListData;
import tencent.txlive.zhibo.msg.TCChatEntity;
import tencent.txlive.zhibo.ui.gift.LiveListGiftView;

/* compiled from: LiveGiftListManagerView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveGiftListManagerView;", "Landroid/widget/LinearLayout;", "Ltencent/txlive/zhibo/ui/gift/LiveListGiftView$OnViewDisplayDoneListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "canShowMaxNum", "gitViewitems", "", "Ltencent/txlive/zhibo/ui/gift/LiveGiftListManagerView$SmallGiftModel;", "[Ltencent/txlive/zhibo/ui/gift/LiveGiftListManagerView$SmallGiftModel;", "linkList", "Ltencent/txlive/util/LinkListData;", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "addASmallGift", "", "entity", "addViewFirst", "dispose", "findHaveShowItem", "", "makeOneItemAndShow", "model", "onDisplayDone", "pos", "onDisplayDoneStart", "SmallGiftModel", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveGiftListManagerView extends LinearLayout implements LiveListGiftView.OnViewDisplayDoneListener {
    @NotNull
    private final String TAG;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private final int canShowMaxNum;
    @NotNull
    private final SmallGiftModel[] gitViewitems;
    @NotNull
    private final LinkListData<TCChatEntity> linkList;

    /* compiled from: LiveGiftListManagerView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveGiftListManagerView$SmallGiftModel;", "", g.C, "", "isUsing", "", "itemView", "Ltencent/txlive/zhibo/ui/gift/LiveListGiftView;", "(IZLtencent/txlive/zhibo/ui/gift/LiveListGiftView;)V", "()Z", "setUsing", "(Z)V", "getItemView", "()Ltencent/txlive/zhibo/ui/gift/LiveListGiftView;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class SmallGiftModel {
        private boolean isUsing;
        @NotNull
        private final LiveListGiftView itemView;
        private final int position;

        public SmallGiftModel(int i2, boolean z, @NotNull LiveListGiftView liveListGiftView) {
        }

        public static /* synthetic */ SmallGiftModel copy$default(SmallGiftModel smallGiftModel, int i2, boolean z, LiveListGiftView liveListGiftView, int i3, Object obj) {
        }

        public final int component1() {
        }

        public final boolean component2() {
        }

        @NotNull
        public final LiveListGiftView component3() {
        }

        @NotNull
        public final SmallGiftModel copy(int i2, boolean z, @NotNull LiveListGiftView liveListGiftView) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        @NotNull
        public final LiveListGiftView getItemView() {
        }

        public final int getPosition() {
        }

        public int hashCode() {
        }

        public final boolean isUsing() {
        }

        public final void setUsing(boolean z) {
        }

        @NotNull
        public String toString() {
        }
    }

    public LiveGiftListManagerView(@Nullable Context context) {
    }

    public static /* synthetic */ void a(SmallGiftModel smallGiftModel, TCChatEntity tCChatEntity) {
    }

    private final void addViewFirst() {
    }

    private final boolean findHaveShowItem(TCChatEntity tCChatEntity) {
    }

    private final void makeOneItemAndShow(SmallGiftModel smallGiftModel, TCChatEntity tCChatEntity) {
    }

    /* renamed from: makeOneItemAndShow$lambda-6  reason: not valid java name */
    private static final void m1738makeOneItemAndShow$lambda6(SmallGiftModel smallGiftModel, TCChatEntity tCChatEntity) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void addASmallGift(@Nullable TCChatEntity tCChatEntity) {
    }

    public final void dispose() {
    }

    @Override // tencent.txlive.zhibo.ui.gift.LiveListGiftView.OnViewDisplayDoneListener
    public void onDisplayDone(int i2) {
    }

    @Override // tencent.txlive.zhibo.ui.gift.LiveListGiftView.OnViewDisplayDoneListener
    public boolean onDisplayDoneStart() {
    }

    public LiveGiftListManagerView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public LiveGiftListManagerView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

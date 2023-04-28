package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.view.DyVideoView;
import com.showstartfans.activity.widget.MomentAnimationTextView;
import com.taihebase.activity.base.BaseViewGroup;
import com.taihebase.activity.view.LoadImageView;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ItemShunJianView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0014J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0010\u0010#\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010$\u001a\u00020\u001eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/showstartfans/activity/view/ItemShunJianView;", "Lcom/taihebase/activity/base/BaseViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "data", "Lcom/showstartfans/activity/model/Article;", "dateDay", "Landroid/widget/TextView;", "dateMonth", "emoji", "emojiContainer", "Landroid/view/View;", "emoji_image", "Lcom/taihebase/activity/view/LoadImageView;", "et_content", "Lcom/showstartfans/activity/widget/MomentAnimationTextView;", "isCheck", "", "my_life", "player", "Lcom/showstartfans/activity/view/DyVideoView;", "poster", "onVisibleChangeCustom", "", "isVisible", "play", "setCheckPlay", "setCheckStop", "setData", "stop", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ItemShunJianView extends BaseViewGroup {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f6819e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Article f6820f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private DyVideoView f6821g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private LoadImageView f6822h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private MomentAnimationTextView f6823i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private TextView f6824j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private TextView f6825k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private View f6826l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private LoadImageView f6827m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private TextView f6828n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private View f6829o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6830p;

    /* compiled from: ItemShunJianView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ItemShunJianView$play$1", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "onPlayPrepared", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends DyVideoView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ItemShunJianView f6831a;

        public a(ItemShunJianView itemShunJianView) {
        }

        public static /* synthetic */ void i(ItemShunJianView itemShunJianView, a aVar) {
        }

        private static final void j(ItemShunJianView itemShunJianView, a aVar) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void e() {
        }
    }

    public ItemShunJianView(@NotNull Context context) {
    }

    public static final /* synthetic */ DyVideoView k(ItemShunJianView itemShunJianView) {
    }

    public static final /* synthetic */ LoadImageView l(ItemShunJianView itemShunJianView) {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    public void a() {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    @Nullable
    public View b(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    public void j(boolean z) {
    }

    public final void m() {
    }

    public final void n() {
    }

    public final void o() {
    }

    public final void p() {
    }

    public final void setData(@Nullable Article article) {
    }

    public ItemShunJianView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ItemShunJianView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

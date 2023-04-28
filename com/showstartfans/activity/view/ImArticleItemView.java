package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.Article;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImArticleItemView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)J\u000e\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u0010\u0010#\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/view/ImArticleItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ic_video_tag", "Landroid/widget/ImageView;", "layoutGrid", "Landroid/widget/LinearLayout;", "layout_maine", "Landroid/view/ViewGroup;", "layout_top", "mData", "Lcom/showstartfans/activity/model/Article;", "sdv_photo", "Lcom/facebook/drawee/view/SimpleDraweeView;", "sdv_photo_Radius", "tv_Name", "Landroid/widget/TextView;", "getTv_Name", "()Landroid/widget/TextView;", "setTv_Name", "(Landroid/widget/TextView;)V", "tv_Time", "getTv_Time", "setTv_Time", "tv_content", "getTv_content", "setTv_content", "tv_num", "vCard", "Landroidx/cardview/widget/CardView;", "setData", "", "msg", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", "setReplyUI", "isSelf", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImArticleItemView extends RelativeLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private TextView f6722d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f6723e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TextView f6724f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private SimpleDraweeView f6725g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private SimpleDraweeView f6726h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f6727i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private Article f6728j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private ImageView f6729k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f6730l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f6731m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private CardView f6732n;

    public ImArticleItemView(@NotNull Context context) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final TextView getTv_Name() {
    }

    @Nullable
    public final TextView getTv_Time() {
    }

    @Nullable
    public final TextView getTv_content() {
    }

    public final void setData(@Nullable TUIMessageBean tUIMessageBean) {
    }

    public final void setReplyUI(boolean z) {
    }

    public final void setTv_Name(@Nullable TextView textView) {
    }

    public final void setTv_Time(@Nullable TextView textView) {
    }

    public final void setTv_content(@Nullable TextView textView) {
    }

    public ImArticleItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImArticleItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.GroupNoticeBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupNoticeView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/view/GroupNoticeView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isInDialog", "", "mBean", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "onImageLongClickListener", "Landroid/view/View$OnLongClickListener;", "getOnImageLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setOnImageLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "sdv_image", "Lcom/facebook/drawee/view/SimpleDraweeView;", "tv_Content", "Landroid/widget/TextView;", "setData", "", "data", "setImUI", "isSelf", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupNoticeView extends RelativeLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f6705d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private GroupNoticeBean f6706e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6707f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private View.OnLongClickListener f6708g;

    public GroupNoticeView(@Nullable Context context) {
    }

    private static final void c(GroupNoticeView groupNoticeView, View view) {
    }

    private static final boolean d(GroupNoticeView groupNoticeView, View view) {
    }

    public static /* synthetic */ void e(GroupNoticeView groupNoticeView, float f2) {
    }

    public static /* synthetic */ boolean f(GroupNoticeView groupNoticeView, View view) {
    }

    public static /* synthetic */ void g(GroupNoticeView groupNoticeView, View view) {
    }

    public static /* synthetic */ void i(GroupNoticeView groupNoticeView, GroupNoticeBean groupNoticeBean, boolean z, int i2, Object obj) {
    }

    private static final void j(GroupNoticeView groupNoticeView, float f2) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final View.OnLongClickListener getOnImageLongClickListener() {
    }

    public final void h(@Nullable GroupNoticeBean groupNoticeBean, boolean z) {
    }

    public final void setImUI(boolean z) {
    }

    public final void setOnImageLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
    }

    public GroupNoticeView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public GroupNoticeView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

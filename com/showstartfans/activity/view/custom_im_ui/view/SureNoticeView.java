package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.showstartfans.activity.model.MessageNoticeBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SureNoticeView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/SureNoticeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutMain", "Landroid/widget/LinearLayout;", "mData", "Lcom/showstartfans/activity/model/MessageNoticeBean;", "mNoticeBean", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "tvContent", "Landroid/widget/TextView;", "setData", "", "msg", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", "noticeBean", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SureNoticeView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private MessageNoticeBean f7215d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private GroupNoticeBean f7216e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f7217f;

    /* compiled from: SureNoticeView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/taihebase/activity/network/Result;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<n, Unit> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull n nVar) {
        }
    }

    public SureNoticeView(@NotNull Context context) {
    }

    private static final void c(SureNoticeView sureNoticeView, View view) {
    }

    public static /* synthetic */ void d(SureNoticeView sureNoticeView, View view) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void e(@Nullable TUIMessageBean tUIMessageBean, @Nullable GroupNoticeBean groupNoticeBean) {
    }

    public SureNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SureNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

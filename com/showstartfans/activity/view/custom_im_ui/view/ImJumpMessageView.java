package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.imsdk.v2.V2TIMMessage;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImJumpMessageView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J,\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018J\"\u0010\u0019\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017J$\u0010\u001c\u001a\u00020\u00102\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/ImJumpMessageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ivArrow", "Landroid/widget/ImageView;", "tvContent", "Landroid/widget/TextView;", "close", "", "show", "showAtUI", "chatView", "Lcom/showstartfans/activity/view/custom_im_ui/view/CustomChatView;", "atMeMsgs", "Ljava/util/ArrayList;", "Lcom/tencent/imsdk/v2/V2TIMMessage;", "Lkotlin/collections/ArrayList;", "showUnReadMsgUI", "unReadCount", "unReadFirstMsg", "updateAtText", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImJumpMessageView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ImageView f7198d;

    public ImJumpMessageView(@NotNull Context context) {
    }

    public static /* synthetic */ void d(CustomChatView customChatView, V2TIMMessage v2TIMMessage, ImJumpMessageView imJumpMessageView, View view) {
    }

    public static /* synthetic */ void e(ArrayList arrayList, CustomChatView customChatView, ImJumpMessageView imJumpMessageView, View view) {
    }

    private static final void h(ArrayList arrayList, CustomChatView customChatView, ImJumpMessageView imJumpMessageView, View view) {
    }

    private static final void j(CustomChatView customChatView, V2TIMMessage v2TIMMessage, ImJumpMessageView imJumpMessageView, View view) {
    }

    private final void k(ArrayList<V2TIMMessage> arrayList) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c() {
    }

    public final void f() {
    }

    public final void g(@Nullable CustomChatView customChatView, @Nullable ArrayList<V2TIMMessage> arrayList) {
    }

    public final void i(@Nullable CustomChatView customChatView, int i2, @Nullable V2TIMMessage v2TIMMessage) {
    }

    public ImJumpMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImJumpMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

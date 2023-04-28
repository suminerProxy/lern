package com.showstartfans.activity.view;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import com.showstartfans.activity.model.TagBean;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TagTextView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/view/TagTextView;", "Lcom/showstartfans/activity/view/BaseClickTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setData", "", "stylesTopic", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/TagBean;", "ClickSpan", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class TagTextView extends BaseClickTextView {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, View> f7057f;

    /* compiled from: TagTextView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/showstartfans/activity/view/TagTextView$ClickSpan;", "Landroid/text/style/ClickableSpan;", "bean", "Lcom/showstartfans/activity/model/TagBean;", "(Lcom/showstartfans/activity/view/TagTextView;Lcom/showstartfans/activity/model/TagBean;)V", "getBean", "()Lcom/showstartfans/activity/model/TagBean;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends ClickableSpan {
        @Nullable
        private final TagBean b;
        public final /* synthetic */ TagTextView c;

        public a(@Nullable TagTextView tagTextView, TagBean tagBean) {
        }

        @Nullable
        public final TagBean a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
        }
    }

    public TagTextView(@NotNull Context context) {
    }

    @Override // com.showstartfans.activity.view.BaseClickTextView
    public void a() {
    }

    @Override // com.showstartfans.activity.view.BaseClickTextView
    @Nullable
    public View b(int i2) {
    }

    public final void setData(@Nullable ArrayList<TagBean> arrayList) {
    }

    public TagTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    public TagTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
    }
}

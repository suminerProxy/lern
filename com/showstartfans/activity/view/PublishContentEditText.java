package com.showstartfans.activity.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.AtBean;
import com.showstartfans.activity.model.UserInfoBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.u.z3.b;
import h.u.a.u.z3.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatEditText;

/* compiled from: PublishContentEditText.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\"\u0010\u0018\u001a\u00020\u00122\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001fJ\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\"\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010*\u001a\u00020\tJ\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020$\u0018\u0001`\u001fJ\b\u0010,\u001a\u00020\u0012H\u0002J\u000e\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011j\u0004\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/view/PublishContentEditText;", "Lskin/support/widget/SkinCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "atMethod", "Lcom/showstartfans/activity/view/editText/ATMethod;", "contentMAX", "maxToastLastShowTime", "", "onInputAT", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/view/OnInputAT;", "getOnInputAT", "()Lkotlin/jvm/functions/Function0;", "setOnInputAT", "(Lkotlin/jvm/functions/Function0;)V", "addAT", "userInfo", "Lcom/showstartfans/activity/model/UserInfoBean;", "addSpace", "", "userInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "canVerticalScroll", "editText", "Landroid/widget/EditText;", "getAtBean", "Lcom/showstartfans/activity/model/AtBean;", "userInfoJson", "", "startIndex", "endIndex", "getAtText", "getMaxLength", "getPostAtBean", "initListere", "setMaxLength", "maxLength", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PublishContentEditText extends SkinCompatEditText {
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private long f6905d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private b f6906e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Function0<Unit> f6907f;

    /* compiled from: PublishContentEditText.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/showstartfans/activity/view/PublishContentEditText$initListere$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ PublishContentEditText b;

        public a(PublishContentEditText publishContentEditText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public PublishContentEditText(@NotNull Context context) {
    }

    public static final /* synthetic */ int c(PublishContentEditText publishContentEditText) {
    }

    public static final /* synthetic */ long d(PublishContentEditText publishContentEditText) {
    }

    public static final /* synthetic */ void e(PublishContentEditText publishContentEditText, long j2) {
    }

    public static /* synthetic */ void h(PublishContentEditText publishContentEditText, UserInfoBean userInfoBean, boolean z, int i2, Object obj) {
    }

    private final boolean i(EditText editText) {
    }

    private final AtBean j(String str, int i2, int i3) {
    }

    private final String k(UserInfoBean userInfoBean) {
    }

    private static final int l(PublishContentEditText publishContentEditText, c cVar, c cVar2) {
    }

    private final void m() {
    }

    private static final boolean n(PublishContentEditText publishContentEditText, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ int o(PublishContentEditText publishContentEditText, c cVar, c cVar2) {
    }

    public static /* synthetic */ boolean p(PublishContentEditText publishContentEditText, View view, MotionEvent motionEvent) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void f(@Nullable UserInfoBean userInfoBean, boolean z) {
    }

    public final void g(@Nullable ArrayList<UserInfoBean> arrayList) {
    }

    public final int getMaxLength() {
    }

    @Nullable
    public final Function0<Unit> getOnInputAT() {
    }

    @Nullable
    public final ArrayList<AtBean> getPostAtBean() {
    }

    public final void setMaxLength(int i2) {
    }

    public final void setOnInputAT(@Nullable Function0<Unit> function0) {
    }

    public PublishContentEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public PublishContentEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

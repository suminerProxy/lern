package com.showstartfans.activity.view;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.umeng.analytics.pro.am;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatTextView;

/* compiled from: BaseClickTextView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u001c\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/showstartfans/activity/view/BaseClickTextView;", "Lskin/support/widget/SkinCompatTextView;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isHavePressed", "", "isNeedPressStatus", "lastClickSpan", "Landroid/text/style/ClickableSpan;", "enableClick", "", "canClick", "onTouch", am.aE, "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "removeClickStatusSpan", "buffer", "Landroid/text/Spannable;", "setClickBackgoundColorSpan", "clickSpan", "ClickBackgroundColorSpan", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaseClickTextView extends SkinCompatTextView implements View.OnTouchListener {
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6606d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ClickableSpan f6607e;

    /* compiled from: BaseClickTextView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/showstartfans/activity/view/BaseClickTextView$ClickBackgroundColorSpan;", "Landroid/text/style/BackgroundColorSpan;", "(Lcom/showstartfans/activity/view/BaseClickTextView;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class ClickBackgroundColorSpan extends BackgroundColorSpan {
        public final /* synthetic */ BaseClickTextView this$0;

        public ClickBackgroundColorSpan(BaseClickTextView baseClickTextView) {
        }
    }

    public BaseClickTextView(@NotNull Context context) {
    }

    private final void d(Spannable spannable) {
    }

    private final void e(Spannable spannable, ClickableSpan clickableSpan) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c(boolean z) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
    }

    public BaseClickTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    public BaseClickTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
    }
}

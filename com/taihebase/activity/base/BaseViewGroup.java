package com.taihebase.activity.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseViewGroup.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0014J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\tH\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/taihebase/activity/base/BaseViewGroup;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isVisible", "", "()Z", "setVisible", "(Z)V", "lastVisible", "checkVisible", "", "checkVisibleChange", "indexOfViewInParent", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "isShade", "onAttachedToWindow", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "visibility", "onVisibleChangeCustom", "onWindowVisibilityChanged", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaseViewGroup extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7976d;

    public BaseViewGroup(@NotNull Context context) {
    }

    private final void c() {
    }

    private static final void d(BaseViewGroup baseViewGroup) {
    }

    private final void e(boolean z) {
    }

    private final int f(View view, ViewGroup viewGroup) {
    }

    private final boolean g() {
    }

    public static /* synthetic */ void i(BaseViewGroup baseViewGroup) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final boolean h() {
    }

    public void j(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i2) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
    }

    public final void setVisible(boolean z) {
    }

    public BaseViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public BaseViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

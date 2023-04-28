package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatRelativeLayout;

/* compiled from: RatioLayout.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taihebase/activity/view/RatioLayout;", "Lskin/support/widget/SkinCompatRelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", h.c.a.a.a.f16081l, MapBundleKey.OfflineMapKey.OFFLINE_RATION, "", "init", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMode", "Lcom/taihebase/activity/view/RatioLayout$Mode;", "setRatio", "Mode", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RatioLayout extends SkinCompatRelativeLayout {
    @NotNull
    public Map<Integer, View> b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private int f8015d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: RatioLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taihebase/activity/view/RatioLayout$Mode;", "", "(Ljava/lang/String;I)V", "Width", "Height", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a Height = null;
        public static final a Width = null;

        private static final /* synthetic */ a[] $values() {
        }

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public RatioLayout(@Nullable Context context) {
    }

    private final void c(Context context, AttributeSet attributeSet) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final void setMode(@NotNull a aVar) {
    }

    public final void setRatio(float f2) {
    }

    public RatioLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public RatioLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

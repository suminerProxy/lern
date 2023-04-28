package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.ShareMouldBean;
import com.showstartfans.activity.model.StyleBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvitationShareView.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\n \u001c*\u0004\u0018\u00010\u001a0\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020&J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/showstartfans/activity/view/InvitationShareView;", "Lcom/showstartfans/activity/view/BaseShareMouldView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iv_bg", "Landroid/widget/ImageView;", "iv_qrCode", "layout_qr", "Landroid/widget/LinearLayout;", "sdv_showConver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "tv_address", "Landroid/widget/TextView;", "tv_performer", "tv_show_title", "tv_time", "tv_user_name", "tv_zhuban", "v_bg_full", "Landroid/view/View;", "getDrawView", "kotlin.jvm.PlatformType", "initData", "", "actDesBean", "Lcom/showstartfans/activity/model/ShareMouldBean;", "setPerformer", "name", "", "setShowBgFull", "show", "", "setShowQR", "boolean", "setStyle", "styleBean", "Lcom/showstartfans/activity/model/StyleBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class InvitationShareView extends BaseShareMouldView {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, View> f6780h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private ImageView f6781i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private View f6782j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private SimpleDraweeView f6783k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private TextView f6784l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private TextView f6785m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private TextView f6786n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private TextView f6787o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private ImageView f6788p;
    @Nullable
    private TextView q;
    @Nullable
    private TextView r;
    @Nullable
    private LinearLayout s;

    public InvitationShareView(@NotNull Context context) {
    }

    @Override // com.showstartfans.activity.view.BaseShareMouldView
    public void c() {
    }

    @Override // com.showstartfans.activity.view.BaseShareMouldView
    @Nullable
    public View d(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseShareMouldView
    public void f(@Nullable ShareMouldBean shareMouldBean) {
    }

    @Override // com.showstartfans.activity.view.BaseShareMouldView
    public View getDrawView() {
    }

    public final void setPerformer(@Nullable String str) {
    }

    public final void setShowBgFull(boolean z) {
    }

    public final void setShowQR(boolean z) {
    }

    public final void setStyle(@NotNull StyleBean styleBean) {
    }

    public InvitationShareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public InvitationShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

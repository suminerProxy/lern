package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.ShareMouldBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMould_Yaoqing.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/view/ShareMould_Yaoqing;", "Lcom/showstartfans/activity/view/BaseShareMouldView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iv_qrCode", "Landroid/widget/ImageView;", "sdv_showConver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "sdv_user_header", "tv_address", "Landroid/widget/TextView;", "tv_show_title", "tv_time", "tv_userName", "tv_userName_target", "OnChangeTargetName", "", "content", "", "getDrawView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "initData", "actDesBean", "Lcom/showstartfans/activity/model/ShareMouldBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShareMould_Yaoqing extends BaseShareMouldView {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, View> f6980h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private SimpleDraweeView f6981i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private SimpleDraweeView f6982j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private TextView f6983k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private TextView f6984l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private TextView f6985m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private ImageView f6986n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private TextView f6987o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private TextView f6988p;

    public ShareMould_Yaoqing(@NotNull Context context) {
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

    public final void i(@Nullable String str) {
    }

    public ShareMould_Yaoqing(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ShareMould_Yaoqing(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public ShareMould_Yaoqing(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}

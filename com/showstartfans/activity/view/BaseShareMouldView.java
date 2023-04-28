package com.showstartfans.activity.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.ShareMouldBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseShareMouldView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020 H&J\n\u0010!\u001a\u0004\u0018\u00010\u001cH\u0007J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0004J\u0012\u0010$\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010%\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\tR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/view/BaseShareMouldView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "DesingHeight", "getDesingHeight", "()I", "setDesingHeight", "(I)V", "DesingWidth_ID", "actDesBean", "Lcom/showstartfans/activity/model/ShareMouldBean;", "getActDesBean", "()Lcom/showstartfans/activity/model/ShareMouldBean;", "setActDesBean", "(Lcom/showstartfans/activity/model/ShareMouldBean;)V", MapBundleKey.OfflineMapKey.OFFLINE_RATION, "", "tempImageFIle", "Ljava/io/File;", "SaveToFile", "", "getDrawView", "Landroid/view/View;", "getImageFile", "getQRCodeBitmap", "Landroid/graphics/Bitmap;", "initData", "setData", "setMaxHeight", AnimatedPasterJsonConfig.CONFIG_HEIGHT, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseShareMouldView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final double f6608d;

    /* renamed from: e  reason: collision with root package name */
    private int f6609e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ShareMouldBean f6610f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private File f6611g;

    /* compiled from: BaseShareMouldView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/view/BaseShareMouldView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<BaseShareMouldView, Unit> {
        public final /* synthetic */ int $height;
        public final /* synthetic */ BaseShareMouldView this$0;

        public a(BaseShareMouldView baseShareMouldView, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BaseShareMouldView baseShareMouldView) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull BaseShareMouldView baseShareMouldView) {
        }
    }

    public BaseShareMouldView(@NotNull Context context) {
    }

    private static final void b(BaseShareMouldView baseShareMouldView, boolean z) {
    }

    private static final void e(BaseShareMouldView baseShareMouldView, boolean z) {
    }

    public static /* synthetic */ void g(BaseShareMouldView baseShareMouldView, boolean z) {
    }

    public static /* synthetic */ void h(BaseShareMouldView baseShareMouldView, boolean z) {
    }

    @SuppressLint({"CheckResult"})
    public final void a() {
    }

    public void c() {
    }

    @Nullable
    public View d(int i2) {
    }

    public abstract void f(@Nullable ShareMouldBean shareMouldBean);

    @Nullable
    public final ShareMouldBean getActDesBean() {
    }

    public final int getDesingHeight() {
    }

    @NotNull
    public abstract View getDrawView();

    @SuppressLint({"CheckResult"})
    @Nullable
    public final File getImageFile() {
    }

    @Nullable
    public final Bitmap getQRCodeBitmap() {
    }

    public final void setActDesBean(@Nullable ShareMouldBean shareMouldBean) {
    }

    public final void setData(@Nullable ShareMouldBean shareMouldBean) {
    }

    public final void setDesingHeight(int i2) {
    }

    public final void setMaxHeight(int i2) {
    }

    public BaseShareMouldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public BaseShareMouldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public BaseShareMouldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}

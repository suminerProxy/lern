package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.FansAlbumsBaseVOBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoSmallView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/view/UserPhotoSmallView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fansId", "", "iv_small_icon", "Landroid/widget/ImageView;", "smal_Conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "smal_Conver_normal", "tv_photo_num", "Landroid/widget/TextView;", "v_over_layer", "Landroid/view/View;", "isMe", "", "setData", "", "data", "Lcom/showstartfans/activity/model/FansAlbumsBaseVOBean;", "setImage", "imageURL", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserPhotoSmallView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ImageView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f7081d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f7082e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f7083f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ImageView f7084g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private View f7085h;

    public UserPhotoSmallView(@NotNull Context context) {
    }

    private final boolean c() {
    }

    public static /* synthetic */ void d(UserPhotoSmallView userPhotoSmallView, String str, View view) {
    }

    private static final void f(UserPhotoSmallView userPhotoSmallView, String str, View view) {
    }

    private final void setImage(String str) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void e(@Nullable FansAlbumsBaseVOBean fansAlbumsBaseVOBean, @Nullable String str) {
    }

    public UserPhotoSmallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public UserPhotoSmallView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}

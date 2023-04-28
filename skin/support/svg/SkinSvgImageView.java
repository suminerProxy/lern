package skin.support.svg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.taihebase.activity.view.svg.SvgImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: SkinSvgImageView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lskin/support/svg/SkinSvgImageView;", "Lcom/taihebase/activity/view/svg/SvgImageView;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "mImageHelper", "Lskin/support/svg/SkinCompatSVGImageHelper;", "applySkin", "", "setBackgroundResource", "resId", "setImageColor", "colorId", "setImageResource", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class SkinSvgImageView extends SvgImageView implements SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @NotNull
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    @NotNull
    private SkinCompatSVGImageHelper mImageHelper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkinSvgImageView(@NotNull Context ctx) {
        this(ctx, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.taihebase.activity.view.svg.SvgImageView
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.taihebase.activity.view.svg.SvgImageView
    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view == null) {
            View findViewById = findViewById(i2);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i2), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        this.mBackgroundTintHelper.applySkin();
        this.mImageHelper.applySkin();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        this.mBackgroundTintHelper.onSetBackgroundResource(i2);
    }

    @Override // com.taihebase.activity.view.svg.SvgImageView
    public void setImageColor(int i2) {
        this.mImageHelper.setImageColor(i2);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i2) {
        SkinCompatSVGImageHelper.setImageResource$default(this.mImageHelper, i2, 0, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkinSvgImageView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.taihebase.activity.view.svg.SvgImageView
    public void setImageResource(@DrawableRes int i2, int i3) {
        this.mImageHelper.setImageResource(i2, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkinSvgImageView(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i2) {
        super(ctx, attributeSet, i2);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this._$_findViewCache = new LinkedHashMap();
        this.mBackgroundTintHelper = new SkinCompatBackgroundHelper(this);
        if (!isInEditMode()) {
            this.mBackgroundTintHelper.loadFromAttributes(attributeSet, i2);
        }
        SkinCompatSVGImageHelper skinCompatSVGImageHelper = new SkinCompatSVGImageHelper(this);
        this.mImageHelper = skinCompatSVGImageHelper;
        skinCompatSVGImageHelper.loadFromAttributes(attributeSet, i2);
    }
}

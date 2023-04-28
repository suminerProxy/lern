package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageFilterView extends AppCompatImageView {
    private float mCrossfade;
    private ImageMatrix mImageMatrix;
    public LayerDrawable mLayer;
    public Drawable[] mLayers;
    private boolean mOverlay;
    private Path mPath;
    public RectF mRect;
    private float mRound;
    private float mRoundPercent;
    public ViewOutlineProvider mViewOutlineProvider;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ViewOutlineProvider {
        public final /* synthetic */ ImageFilterView this$0;

        public AnonymousClass1(ImageFilterView imageFilterView) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends ViewOutlineProvider {
        public final /* synthetic */ ImageFilterView this$0;

        public AnonymousClass2(ImageFilterView imageFilterView) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ImageMatrix {

        /* renamed from: m  reason: collision with root package name */
        public float[] f27m;
        public float mBrightness;
        public ColorMatrix mColorMatrix;
        public float mContrast;
        public float mSaturation;
        public ColorMatrix mTmpColorMatrix;
        public float mWarmth;

        private void brightness(float f2) {
        }

        private void saturation(float f2) {
        }

        private void warmth(float f2) {
        }

        public void updateMatrix(ImageView imageView) {
        }
    }

    public ImageFilterView(Context context) {
    }

    public static /* synthetic */ float access$000(ImageFilterView imageFilterView) {
    }

    public static /* synthetic */ float access$100(ImageFilterView imageFilterView) {
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    private void setOverlay(boolean z) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public float getBrightness() {
    }

    public float getContrast() {
    }

    public float getCrossfade() {
    }

    public float getRound() {
    }

    public float getRoundPercent() {
    }

    public float getSaturation() {
    }

    public float getWarmth() {
    }

    public void setBrightness(float f2) {
    }

    public void setContrast(float f2) {
    }

    public void setCrossfade(float f2) {
    }

    @RequiresApi(21)
    public void setRound(float f2) {
    }

    @RequiresApi(21)
    public void setRoundPercent(float f2) {
    }

    public void setSaturation(float f2) {
    }

    public void setWarmth(float f2) {
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i2) {
    }
}

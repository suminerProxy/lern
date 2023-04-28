package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SubsamplingScaleImageView extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = null;
    public static final int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    private static final List<Integer> VALID_EASING_STYLES = null;
    private static final List<Integer> VALID_ORIENTATIONS = null;
    private static final List<Integer> VALID_PAN_LIMITS = null;
    private static final List<Integer> VALID_SCALE_TYPES = null;
    private static final List<Integer> VALID_ZOOM_STYLES = null;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static Bitmap.Config preferredBitmapConfig;
    private Anim anim;
    private Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled;

    /* renamed from: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ SubsamplingScaleImageView this$0;

        public AnonymousClass1(SubsamplingScaleImageView subsamplingScaleImageView) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ SubsamplingScaleImageView this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass2(SubsamplingScaleImageView subsamplingScaleImageView, Context context) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ SubsamplingScaleImageView this$0;

        public AnonymousClass3(SubsamplingScaleImageView subsamplingScaleImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        public final /* synthetic */ SubsamplingScaleImageView this$0;
        private final PointF vFocus;

        public /* synthetic */ AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2, PointF pointF, PointF pointF2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ AnimationBuilder access$1200(AnimationBuilder animationBuilder, boolean z) {
        }

        public static /* synthetic */ AnimationBuilder access$1300(AnimationBuilder animationBuilder, int i2) {
        }

        @NonNull
        private AnimationBuilder withOrigin(int i2) {
        }

        @NonNull
        private AnimationBuilder withPanLimited(boolean z) {
        }

        public void start() {
        }

        @NonNull
        public AnimationBuilder withDuration(long j2) {
        }

        @NonNull
        public AnimationBuilder withEasing(int i2) {
        }

        @NonNull
        public AnimationBuilder withInterruptible(boolean z) {
        }

        @NonNull
        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
        }

        public /* synthetic */ AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2, PointF pointF, AnonymousClass1 anonymousClass1) {
        }

        public /* synthetic */ AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2, AnonymousClass1 anonymousClass1) {
        }

        public /* synthetic */ AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF, AnonymousClass1 anonymousClass1) {
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2, PointF pointF) {
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f2, PointF pointF, PointF pointF2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BitmapLoadTask extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean z) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public Integer doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        public void onPostExecute2(Integer num) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onComplete() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByNewAnim() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByUser() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DefaultOnImageEventListener implements OnImageEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF pointF, int i2) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f2, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnImageEventListener {
        void onImageLoadError(Exception exc);

        void onImageLoaded();

        void onPreviewLoadError(Exception exc);

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(Exception exc);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnStateChangedListener {
        void onCenterChanged(PointF pointF, int i2);

        void onScaleChanged(float f2, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleAndTranslate {
        private float scale;
        private final PointF vTranslate;

        public /* synthetic */ ScaleAndTranslate(float f2, PointF pointF, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ float access$4700(ScaleAndTranslate scaleAndTranslate) {
        }

        public static /* synthetic */ float access$4702(ScaleAndTranslate scaleAndTranslate, float f2) {
        }

        public static /* synthetic */ PointF access$4800(ScaleAndTranslate scaleAndTranslate) {
        }

        private ScaleAndTranslate(float f2, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Tile {
        private Bitmap bitmap;
        private Rect fileSRect;
        private boolean loading;
        private Rect sRect;
        private int sampleSize;
        private Rect vRect;
        private boolean visible;

        private Tile() {
        }

        public static /* synthetic */ boolean access$400(Tile tile) {
        }

        public static /* synthetic */ boolean access$4000(Tile tile) {
        }

        public static /* synthetic */ boolean access$4002(Tile tile, boolean z) {
        }

        public static /* synthetic */ boolean access$402(Tile tile, boolean z) {
        }

        public static /* synthetic */ Rect access$4100(Tile tile) {
        }

        public static /* synthetic */ Rect access$4102(Tile tile, Rect rect) {
        }

        public static /* synthetic */ Rect access$4200(Tile tile) {
        }

        public static /* synthetic */ Rect access$4202(Tile tile, Rect rect) {
        }

        public static /* synthetic */ int access$4300(Tile tile) {
        }

        public static /* synthetic */ int access$4302(Tile tile, int i2) {
        }

        public static /* synthetic */ Bitmap access$500(Tile tile) {
        }

        public static /* synthetic */ Rect access$5000(Tile tile) {
        }

        public static /* synthetic */ Rect access$5002(Tile tile, Rect rect) {
        }

        public static /* synthetic */ Bitmap access$502(Tile tile, Bitmap bitmap) {
        }

        public /* synthetic */ Tile(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TileLoadTask extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public Bitmap doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        public void onPostExecute2(Bitmap bitmap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TilesInitTask extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ int[] doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(int[] iArr) {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public int[] doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        public void onPostExecute2(int[] iArr) {
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ View.OnLongClickListener access$000(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ float access$1000(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ int access$102(SubsamplingScaleImageView subsamplingScaleImageView, int i2) {
    }

    public static /* synthetic */ boolean access$1400(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void access$1500(SubsamplingScaleImageView subsamplingScaleImageView, Context context) {
    }

    public static /* synthetic */ boolean access$1600(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF access$1700(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF access$1702(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF access$1802(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ float access$1902(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ boolean access$2002(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    public static /* synthetic */ void access$201(SubsamplingScaleImageView subsamplingScaleImageView, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ float access$2102(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ PointF access$2200(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF access$2202(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF access$2302(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ PointF access$2402(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
    }

    public static /* synthetic */ boolean access$2502(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    public static /* synthetic */ void access$2600(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF, PointF pointF2) {
    }

    public static /* synthetic */ void access$301(SubsamplingScaleImageView subsamplingScaleImageView, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ void access$5100(SubsamplingScaleImageView subsamplingScaleImageView, String str, Object[] objArr) {
    }

    public static /* synthetic */ int access$5200(SubsamplingScaleImageView subsamplingScaleImageView, Context context, String str) {
    }

    public static /* synthetic */ Rect access$5300(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ String access$5400() {
    }

    public static /* synthetic */ void access$5500(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, int i2, int i3, int i4) {
    }

    public static /* synthetic */ OnImageEventListener access$5600(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ ReadWriteLock access$5700(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void access$5800(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
    }

    public static /* synthetic */ void access$5900(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean access$600(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ void access$6000(SubsamplingScaleImageView subsamplingScaleImageView, Bitmap bitmap) {
    }

    public static /* synthetic */ void access$6100(SubsamplingScaleImageView subsamplingScaleImageView, Bitmap bitmap, int i2, boolean z) {
    }

    public static /* synthetic */ List access$6300() {
    }

    public static /* synthetic */ Anim access$6400(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ Anim access$6402(SubsamplingScaleImageView subsamplingScaleImageView, Anim anim) {
    }

    public static /* synthetic */ float access$6500(SubsamplingScaleImageView subsamplingScaleImageView, float f2) {
    }

    public static /* synthetic */ PointF access$6600(SubsamplingScaleImageView subsamplingScaleImageView, float f2, float f3, float f4, PointF pointF) {
    }

    public static /* synthetic */ void access$6800(SubsamplingScaleImageView subsamplingScaleImageView, boolean z, ScaleAndTranslate scaleAndTranslate) {
    }

    public static /* synthetic */ boolean access$700(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ PointF access$800(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean access$900(SubsamplingScaleImageView subsamplingScaleImageView) {
    }

    public static /* synthetic */ boolean access$902(SubsamplingScaleImageView subsamplingScaleImageView, boolean z) {
    }

    private int calculateInSampleSize(float f2) {
    }

    private boolean checkImageLoaded() {
    }

    private boolean checkReady() {
    }

    private void createPaints() {
    }

    @AnyThread
    private void debug(String str, Object... objArr) {
    }

    private float distance(float f2, float f3, float f4, float f5) {
    }

    private void doubleTapZoom(PointF pointF, PointF pointF2) {
    }

    private float ease(int i2, long j2, float f2, float f3, long j3) {
    }

    private float easeInOutQuad(long j2, float f2, float f3, long j3) {
    }

    private float easeOutQuad(long j2, float f2, float f3, long j3) {
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
    }

    @AnyThread
    private void fileSRect(Rect rect, Rect rect2) {
    }

    private void fitToBounds(boolean z, ScaleAndTranslate scaleAndTranslate) {
    }

    @AnyThread
    private int getExifOrientation(Context context, String str) {
    }

    @NonNull
    private Point getMaxBitmapDimensions(Canvas canvas) {
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
    }

    @AnyThread
    private int getRequiredRotation() {
    }

    private synchronized void initialiseBaseLayer(@NonNull Point point) {
    }

    private void initialiseTileMap(Point point) {
    }

    private boolean isBaseLayerReady() {
    }

    @NonNull
    private PointF limitedSCenter(float f2, float f3, float f4, @NonNull PointF pointF) {
    }

    private float limitedScale(float f2) {
    }

    private float minScale() {
    }

    private synchronized void onImageLoaded(Bitmap bitmap, int i2, boolean z) {
    }

    private synchronized void onPreviewLoaded(Bitmap bitmap) {
    }

    private synchronized void onTileLoaded() {
    }

    private synchronized void onTilesInited(ImageRegionDecoder imageRegionDecoder, int i2, int i3, int i4) {
    }

    private boolean onTouchEventInternal(@NonNull MotionEvent motionEvent) {
    }

    private void preDraw() {
    }

    private int px(int i2) {
    }

    private void refreshRequiredTiles(boolean z) {
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
    }

    private void reset(boolean z) {
    }

    private void restoreState(ImageViewState imageViewState) {
    }

    private int sHeight() {
    }

    private int sWidth() {
    }

    private void sendStateChanged(float f2, PointF pointF, int i2) {
    }

    private void setGestureDetector(Context context) {
    }

    private void setMatrixArray(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
    }

    private void sourceToViewRect(@NonNull Rect rect, @NonNull Rect rect2) {
    }

    private float sourceToViewX(float f2) {
    }

    private float sourceToViewY(float f2) {
    }

    private boolean tileVisible(Tile tile) {
    }

    @NonNull
    private PointF vTranslateForSCenter(float f2, float f3, float f4) {
    }

    private float viewToSourceX(float f2) {
    }

    private float viewToSourceY(float f2) {
    }

    @Nullable
    public AnimationBuilder animateCenter(PointF pointF) {
    }

    @Nullable
    public AnimationBuilder animateScale(float f2) {
    }

    @Nullable
    public AnimationBuilder animateScaleAndCenter(float f2, PointF pointF) {
    }

    public final int getAppliedOrientation() {
    }

    @Nullable
    public final PointF getCenter() {
    }

    public float getMaxScale() {
    }

    public final float getMinScale() {
    }

    public final int getOrientation() {
    }

    public final void getPanRemaining(RectF rectF) {
    }

    public final int getSHeight() {
    }

    public final int getSWidth() {
    }

    public final float getScale() {
    }

    @Nullable
    public final ImageViewState getState() {
    }

    public boolean hasImage() {
    }

    public final boolean isImageLoaded() {
    }

    public final boolean isPanEnabled() {
    }

    public final boolean isQuickScaleEnabled() {
    }

    public final boolean isReady() {
    }

    public final boolean isZoomEnabled() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void onImageLoaded() {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void onReady() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    public void recycle() {
    }

    public final void resetScaleAndCenter() {
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends ImageDecoder> cls) {
    }

    public final void setBitmapDecoderFactory(@NonNull DecoderFactory<? extends ImageDecoder> decoderFactory) {
    }

    public final void setDebug(boolean z) {
    }

    public final void setDoubleTapZoomDpi(int i2) {
    }

    public final void setDoubleTapZoomDuration(int i2) {
    }

    public final void setDoubleTapZoomScale(float f2) {
    }

    public final void setDoubleTapZoomStyle(int i2) {
    }

    public void setEagerLoadingEnabled(boolean z) {
    }

    public void setExecutor(@NonNull Executor executor) {
    }

    public final void setImage(@NonNull ImageSource imageSource) {
    }

    public final void setMaxScale(float f2) {
    }

    public void setMaxTileSize(int i2) {
    }

    public final void setMaximumDpi(int i2) {
    }

    public final void setMinScale(float f2) {
    }

    public final void setMinimumDpi(int i2) {
    }

    public final void setMinimumScaleType(int i2) {
    }

    public void setMinimumTileDpi(int i2) {
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
    }

    public final void setOrientation(int i2) {
    }

    public final void setPanEnabled(boolean z) {
    }

    public final void setPanLimit(int i2) {
    }

    public final void setQuickScaleEnabled(boolean z) {
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends ImageRegionDecoder> cls) {
    }

    public final void setRegionDecoderFactory(@NonNull DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
    }

    public final void setScaleAndCenter(float f2, @Nullable PointF pointF) {
    }

    public final void setTileBackgroundColor(int i2) {
    }

    public final void setZoomEnabled(boolean z) {
    }

    @Nullable
    public final PointF sourceToViewCoord(PointF pointF) {
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
    }

    @Nullable
    public final PointF viewToSourceCoord(PointF pointF) {
    }

    public void visibleFileRect(Rect rect) {
    }

    public final void setImage(@NonNull ImageSource imageSource, ImageViewState imageViewState) {
    }

    @Nullable
    public final PointF sourceToViewCoord(float f2, float f3) {
    }

    @Nullable
    public final PointF viewToSourceCoord(float f2, float f3) {
    }

    public final void setImage(@NonNull ImageSource imageSource, ImageSource imageSource2) {
    }

    public void setMaxTileSize(int i2, int i3) {
    }

    @Nullable
    public final PointF sourceToViewCoord(PointF pointF, @NonNull PointF pointF2) {
    }

    @Nullable
    public final PointF viewToSourceCoord(PointF pointF, @NonNull PointF pointF2) {
    }

    public final void setImage(@NonNull ImageSource imageSource, ImageSource imageSource2, ImageViewState imageViewState) {
    }

    @Nullable
    public final PointF sourceToViewCoord(float f2, float f3, @NonNull PointF pointF) {
    }

    @Nullable
    public final PointF viewToSourceCoord(float f2, float f3, @NonNull PointF pointF) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Anim {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private PointF sCenterEnd;
        private PointF sCenterEndRequested;
        private PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time;
        private PointF vFocusEnd;
        private PointF vFocusStart;

        private Anim() {
        }

        public static /* synthetic */ boolean access$2700(Anim anim) {
        }

        public static /* synthetic */ boolean access$2702(Anim anim, boolean z) {
        }

        public static /* synthetic */ OnAnimationEventListener access$2800(Anim anim) {
        }

        public static /* synthetic */ OnAnimationEventListener access$2802(Anim anim, OnAnimationEventListener onAnimationEventListener) {
        }

        public static /* synthetic */ PointF access$3100(Anim anim) {
        }

        public static /* synthetic */ PointF access$3102(Anim anim, PointF pointF) {
        }

        public static /* synthetic */ long access$3200(Anim anim) {
        }

        public static /* synthetic */ long access$3202(Anim anim, long j2) {
        }

        public static /* synthetic */ long access$3300(Anim anim) {
        }

        public static /* synthetic */ long access$3302(Anim anim, long j2) {
        }

        public static /* synthetic */ int access$3400(Anim anim) {
        }

        public static /* synthetic */ int access$3402(Anim anim, int i2) {
        }

        public static /* synthetic */ float access$3500(Anim anim) {
        }

        public static /* synthetic */ float access$3502(Anim anim, float f2) {
        }

        public static /* synthetic */ float access$3600(Anim anim) {
        }

        public static /* synthetic */ float access$3602(Anim anim, float f2) {
        }

        public static /* synthetic */ PointF access$3700(Anim anim) {
        }

        public static /* synthetic */ PointF access$3702(Anim anim, PointF pointF) {
        }

        public static /* synthetic */ PointF access$3800(Anim anim) {
        }

        public static /* synthetic */ PointF access$3802(Anim anim, PointF pointF) {
        }

        public static /* synthetic */ int access$3900(Anim anim) {
        }

        public static /* synthetic */ int access$3902(Anim anim, int i2) {
        }

        public static /* synthetic */ PointF access$4400(Anim anim) {
        }

        public static /* synthetic */ PointF access$4402(Anim anim, PointF pointF) {
        }

        public static /* synthetic */ PointF access$4500(Anim anim) {
        }

        public static /* synthetic */ PointF access$4502(Anim anim, PointF pointF) {
        }

        public /* synthetic */ Anim(AnonymousClass1 anonymousClass1) {
        }
    }

    private void fitToBounds(boolean z) {
    }

    public SubsamplingScaleImageView(Context context) {
    }
}

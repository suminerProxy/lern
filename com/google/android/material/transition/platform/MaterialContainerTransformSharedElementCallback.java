package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    @Nullable
    private static WeakReference<View> capturedSharedElement;
    private boolean entering;
    @Nullable
    private Rect returnEndBounds;
    @Nullable
    private ShapeProvider shapeProvider;
    private boolean sharedElementReenterTransitionEnabled;
    private boolean transparentWindowBackgroundEnabled;

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TransitionListenerAdapter {
        public final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        public final /* synthetic */ Window val$window;

        public AnonymousClass1(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Window window) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends TransitionListenerAdapter {
        public final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        public final /* synthetic */ Activity val$activity;

        public AnonymousClass2(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Activity activity) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends TransitionListenerAdapter {
        public final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        public final /* synthetic */ Window val$window;

        public AnonymousClass3(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Window window) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View view);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view) {
        }
    }

    public static /* synthetic */ void access$000(Window window) {
    }

    public static /* synthetic */ void access$100(Window window) {
    }

    public static /* synthetic */ WeakReference access$200() {
    }

    public static /* synthetic */ WeakReference access$202(WeakReference weakReference) {
    }

    private static void removeWindowBackground(Window window) {
    }

    private static void restoreWindowBackground(Window window) {
    }

    private void setUpEnterTransform(Window window) {
    }

    private void setUpReturnTransform(Activity activity, Window window) {
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
    }

    public boolean isSharedElementReenterTransitionEnabled() {
    }

    public boolean isTransparentWindowBackgroundEnabled() {
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider) {
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
    }
}

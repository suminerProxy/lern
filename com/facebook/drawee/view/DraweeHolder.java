package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.umeng.analytics.pro.d;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DraweeHolder<DH extends DraweeHierarchy> implements VisibilityCallback {
    @Nullable
    private DH mHierarchy;
    private boolean mIsControllerAttached = false;
    private boolean mIsHolderAttached = false;
    private boolean mIsVisible = true;
    private DraweeController mController = null;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();

    public DraweeHolder(@Nullable DH hierarchy) {
        if (hierarchy != null) {
            setHierarchy(hierarchy);
        }
    }

    private void attachController() {
        if (this.mIsControllerAttached) {
            return;
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.mIsControllerAttached = true;
        DraweeController draweeController = this.mController;
        if (draweeController == null || draweeController.getHierarchy() == null) {
            return;
        }
        this.mController.onAttach();
    }

    private void attachOrDetachController() {
        if (this.mIsHolderAttached && this.mIsVisible) {
            attachController();
        } else {
            detachController();
        }
    }

    public static <DH extends DraweeHierarchy> DraweeHolder<DH> create(@Nullable DH hierarchy, Context context) {
        DraweeHolder<DH> draweeHolder = new DraweeHolder<>(hierarchy);
        draweeHolder.registerWithContext(context);
        return draweeHolder;
    }

    private void detachController() {
        if (this.mIsControllerAttached) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.mIsControllerAttached = false;
            if (isControllerValid()) {
                this.mController.onDetach();
            }
        }
    }

    private void setVisibilityCallback(@Nullable VisibilityCallback visibilityCallback) {
        Drawable topLevelDrawable = getTopLevelDrawable();
        if (topLevelDrawable instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) topLevelDrawable).setVisibilityCallback(visibilityCallback);
        }
    }

    @Nullable
    public DraweeController getController() {
        return this.mController;
    }

    public DraweeEventTracker getDraweeEventTracker() {
        return this.mEventTracker;
    }

    public DH getHierarchy() {
        return (DH) Preconditions.checkNotNull(this.mHierarchy);
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        DH dh = this.mHierarchy;
        if (dh == null) {
            return null;
        }
        return dh.getTopLevelDrawable();
    }

    public boolean hasHierarchy() {
        return this.mHierarchy != null;
    }

    public boolean isAttached() {
        return this.mIsHolderAttached;
    }

    public boolean isControllerValid() {
        DraweeController draweeController = this.mController;
        return draweeController != null && draweeController.getHierarchy() == this.mHierarchy;
    }

    public void onAttach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.mIsHolderAttached = true;
        attachOrDetachController();
    }

    public void onDetach() {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.mIsHolderAttached = false;
        attachOrDetachController();
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public void onDraw() {
        if (this.mIsControllerAttached) {
            return;
        }
        FLog.w(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mController)), toString());
        this.mIsHolderAttached = true;
        this.mIsVisible = true;
        attachOrDetachController();
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (isControllerValid()) {
            return this.mController.onTouchEvent(event);
        }
        return false;
    }

    @Override // com.facebook.drawee.drawable.VisibilityCallback
    public void onVisibilityChange(boolean isVisible) {
        if (this.mIsVisible == isVisible) {
            return;
        }
        this.mEventTracker.recordEvent(isVisible ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.mIsVisible = isVisible;
        attachOrDetachController();
    }

    public void registerWithContext(Context context) {
    }

    public void setController(@Nullable DraweeController draweeController) {
        boolean z = this.mIsControllerAttached;
        if (z) {
            detachController();
        }
        if (isControllerValid()) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.mController.setHierarchy(null);
        }
        this.mController = draweeController;
        if (draweeController != null) {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.mController.setHierarchy(this.mHierarchy);
        } else {
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            attachController();
        }
    }

    public void setHierarchy(DH hierarchy) {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean isControllerValid = isControllerValid();
        setVisibilityCallback(null);
        DH dh = (DH) Preconditions.checkNotNull(hierarchy);
        this.mHierarchy = dh;
        Drawable topLevelDrawable = dh.getTopLevelDrawable();
        onVisibilityChange(topLevelDrawable == null || topLevelDrawable.isVisible());
        setVisibilityCallback(this);
        if (isControllerValid) {
            this.mController.setHierarchy(hierarchy);
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("controllerAttached", this.mIsControllerAttached).add("holderAttached", this.mIsHolderAttached).add("drawableVisible", this.mIsVisible).add(d.ar, this.mEventTracker.toString()).toString();
    }
}

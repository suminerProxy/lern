package com.facebook.drawee.interfaces;

import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DraweeController {
    Animatable getAnimatable();

    String getContentDescription();

    @Nullable
    DraweeHierarchy getHierarchy();

    boolean isSameImageRequest(DraweeController other);

    void onAttach();

    void onDetach();

    boolean onTouchEvent(MotionEvent event);

    void onViewportVisibilityHint(boolean isVisibleInViewportHint);

    void setContentDescription(String contentDescription);

    void setHierarchy(@Nullable DraweeHierarchy hierarchy);
}
